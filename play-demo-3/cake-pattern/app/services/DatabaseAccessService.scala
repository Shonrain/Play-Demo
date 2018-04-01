package services
import models._

trait DatabaseAccessServiceComp {
  val databaseAccessService = new DatabaseAccessService()
}

class DatabaseAccessService{
  val wxcardList = Seq(
    Wxcard(
      id = 1L,
      level = 1,
      discount = 8,
      title = "黄金战神卡",
      status = Wxcard.CardStatus.StatusNormal
    ),
    Wxcard(
      id = 2L,
      level = 2,
      discount = 7,
      title = "红宝石战神卡",
      status  = Wxcard.CardStatus.StatusNormal
    )
  )

  val wxcardMemberList = Seq(
    WxcardMember(
      id = 1L,
      cardNumber = "10020180331001",
      cardId = 1,
      status = WxcardMember.MemberStatus.StatusNormal,
      name = "狗卵单",
      sex = 1
    ),
    WxcardMember(
      id = 2L,
      cardNumber = "10020180331002",
      cardId = 2,
      status = WxcardMember.MemberStatus.StatusNormal,
      name = "Jilen",
      sex = 2
    ),
    WxcardMember(
      id = 3L,
      cardNumber = "10020180331003",
      cardId = 2,
      status = WxcardMember.MemberStatus.StatusNormal,
      name = "Shaw",
      sex = 2
    )
  )
}
