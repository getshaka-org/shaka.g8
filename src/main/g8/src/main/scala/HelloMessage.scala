import org.getshaka.shaka.*
import org.scalajs.dom.*

class HelloMessage(user: String) extends Component:
  override val template = Frag {
    import builders.*

    div{color("purple"); t"Hello \$user"}
  }

@main def launchApp(): Unit =
  render(HelloMessage(user = "Nikki"), document.body)
