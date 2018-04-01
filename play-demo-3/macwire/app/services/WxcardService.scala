package services

import models._

class WxcardService(databaseAccessService: DatabaseAccessService) {
  def get(id: Long) =
    Wxcards
      .filter(wc =>
        wc.id == id
          && wc.status == Wxcard.CardStatus.StatusNormal
      ).headOption

  def getAll =
    Wxcards
      .filter(_.status == Wxcard.CardStatus.StatusNormal)

  lazy val Wxcards = databaseAccessService.wxcardList
}
