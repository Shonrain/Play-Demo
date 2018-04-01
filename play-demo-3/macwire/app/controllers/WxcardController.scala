package controllers

import play.api._
import play.api.mvc._
import models._
import services._

class WxcardController (
  cc: ControllerComponents,
  wxcardService: WxcardService,
  wxcardMemberService: WxcardMemberService
) extends Controller(cc) {

  def wxcardList = Action { implicit request: Request[AnyContent] =>
    val wxcardMembers = wxcardMemberService.getAll
    val wxcards = wxcardService.getAll
    val memberList = wxcardMembers.map { wm =>
      wm -> wxcards.filter(_.id == wm.cardId).head
    }
    Ok(views.html.wxcardList(memberList))
  }
}
