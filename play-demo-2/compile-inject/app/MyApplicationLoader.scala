import controllers._
import play.api._
import play.api.routing.Router
import services._
import router.Routes

class MyApplicationLoader extends ApplicationLoader {
  private var components: MyComponents = _

  def load(context: ApplicationLoader.Context): Application = {
    components = new MyComponents(context)
    components.application
  }
}

class MyComponents(context: ApplicationLoader.Context)
    extends BuiltInComponentsFromContext(context)
    with play.filters.HttpFiltersComponents {

  lazy val databaseAccessService = new DatabaseAccessService

  lazy val employeeSerivce = new EmployeeSerivce(databaseAccessService)

  lazy val employeeController = new EmployeeController(employeeSerivce, controllerComponents)

  lazy val router: Router = new Routes(httpErrorHandler, employeeController)
}
