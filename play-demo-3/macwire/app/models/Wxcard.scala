package models

import org.joda.time._

case class Wxcard (
  id: Long = 0L,
  level: Int,
  discount: Int,
  title: String,
  status: Int,
  gmtCreate: DateTime = DateTime.now(),
  gmtModified: DateTime = DateTime.now()
) {
  def getLevel = level match {
    case 1 => "普通会员"
    case 2 => "高级会员"
  }
}

object Wxcard {
  object CardStatus {
    final val StatusNormal = 1
    final val StatusDelete = -1
  }
}
