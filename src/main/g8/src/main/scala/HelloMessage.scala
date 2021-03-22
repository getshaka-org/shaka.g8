import org.getshaka.shaka
import org.getshaka.shaka.{Component, ComponentBuilder}

class HelloMessage(user: String) extends Component:
  override val template: ComponentBuilder =
    import shaka.builders.*

    div{color("purple"); t"Hello \$user"}

@main def launchApp(): Unit =
  shaka.render(HelloMessage(user = "Nikki"))