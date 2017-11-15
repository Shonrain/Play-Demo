package controllers

import play.api._
import play.api.mvc._
import models._
import services._

class EmployeeController (
  employeeSerivce: EmployeeSerivce,
  cc: ControllerComponents
) extends AbstractController(cc) {

  def employeeList = Action { implicit request: Request[AnyContent] =>
    val employees = employeeSerivce.getEmployees()
    Ok(views.html.employeeList(employees))
  }
}
