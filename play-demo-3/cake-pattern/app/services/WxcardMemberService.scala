package services

import models._

trait WxcardMemberServiceComp {
  this: DatabaseAccessServiceComp =>

  val wxcardMemberService = new WxcardMemberService(databaseAccessService)
}

class WxcardMemberService(databaseAccessService: DatabaseAccessService) {

  def get(id: Long) =
    WxcardMembers
      .filter(wm =>
        wm.id == id
          && wm.status == WxcardMember.MemberStatus.StatusNormal
      ).headOption

  def getAll =
    WxcardMembers
      .filter(_.status == WxcardMember.MemberStatus.StatusNormal)

  lazy val WxcardMembers = databaseAccessService.wxcardMemberList
}
