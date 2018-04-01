package models

import org.joda.time._

case class WxcardMember (
  id: Long = 0L,
  cardNumber: String,
  cardId: Long,
  status: Int,
  name: String,
  sex: Int,
  activeTime: DateTime = DateTime.now(),
  gmtCreate: DateTime = DateTime.now(),
  gmtModified: DateTime = DateTime.now()
) {
  def getSex = if (sex == 1) "女" else "男"
}

object WxcardMember {
  object MemberStatus {
    final val StatusAuditing = 0
    final val StatusNormal = 1
    final val StatusDelete = -1
  }
}
