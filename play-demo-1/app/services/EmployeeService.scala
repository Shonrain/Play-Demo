package services

import models._

class EmployeeSerivce {

  val jilen = Employee(
    id = 1,
    name = "Jilen",
    sex = "男",
    position = "全干工程师"
  )

  val yison = Employee(
    id = 2,
    name = "Yison",
    sex = "女",
    position = "程序员鼓励师"
  )

  def getEmployees(): Seq[Employee] = Seq(jilen, yison)
}
