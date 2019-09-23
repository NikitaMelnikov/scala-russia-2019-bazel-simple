package demo

object Conference {
  def apply(title: String, size: Int)(implicit generator: IdGenerator): Conference = {
    Conference(title, (1 to size).map(_ => Visitor(generator.next())).toList)
  }
}

final case class Conference(title: String, visitors: List[Visitor])