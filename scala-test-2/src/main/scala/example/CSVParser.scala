package example
import scala.util.Try

object CSVParserRunner extends App {
  val file = scala.io.Source.fromFile(args(0))
  val contents = file.getLines().mkString("\n")
  file.close()
  val parsed = CSVParser.parse(contents)
  pprint.pprintln(parsed, width = 20)
}

object CSVParser {
  def parse(input: String): Seq[(String, Option[Int])] = ???
}
