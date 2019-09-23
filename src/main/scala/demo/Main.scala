package demo

object Main extends App {
  implicit val generator = new IdGenerator()
  val conference = Conference("Scala Russia 2019", 10)
  println(s"Welcome to ${conference.title}, ${conference.visitors}!")
}