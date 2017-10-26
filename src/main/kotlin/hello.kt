import dokany.*
import platform.windows.*

fun main(args: Array<String>) {
  println("Hello from Kotlin Native!")
  println("Dokan version is ${DokanVersion()}")
  println("Dokan driver version is ${DokanDriverVersion()}")

  MessageBoxW(null, "This is the content",
          "This is the title", MB_YESNOCANCEL or MB_ICONQUESTION)
}
