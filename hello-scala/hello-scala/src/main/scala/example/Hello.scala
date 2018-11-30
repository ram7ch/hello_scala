package example

object Hello extends Greeting with App {
  println(greeting)
  println("blah blah fro hello - scal")
  println("slalal")
}

trait Greeting {
  lazy val greeting: String = "hello"
}
