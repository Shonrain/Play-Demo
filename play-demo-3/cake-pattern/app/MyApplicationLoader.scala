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
    with play.filters.HttpFiltersComponents
    with DatabaseAccessServiceComp
    with WxcardServiceComp
    with WxcardMemberServiceComp {

  lazy val wxcardController = new WxcardController(controllerComponents, wxcardService, wxcardMemberService)

  lazy val router: Router = new Routes(httpErrorHandler, wxcardController)
}
