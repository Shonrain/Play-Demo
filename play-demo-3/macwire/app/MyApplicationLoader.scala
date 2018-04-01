import controllers._
import play.api._
import play.api.routing.Router
import services._
import router.Routes
import com.softwaremill.macwire._

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
    with config.ServicesModule {

  lazy val wxcardController = wire[WxcardController]
  lazy val router: Router = {
    val prefix = "/"
    wire[Routes]
  }
}
