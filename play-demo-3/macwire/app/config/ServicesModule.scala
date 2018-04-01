package config

import com.softwaremill.macwire._
import services._

trait ServicesModule {
  lazy val databaseAccessService = wire[DatabaseAccessService]
  lazy val wxcardService = wire[WxcardService]
  lazy val wxcardMemberService = wire[WxcardMemberService]
}
