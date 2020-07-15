package example

import org.scalatest._

class CSVParseTest extends WordSpec with Matchers {
  "The CSV Parser" should {
    "Parse a CSV file" in {
      val input = "A;1\nBB;2;\nC;"

      val output = CSVParser.parse(input)

      output shouldBe Seq("A" -> Some(1), "BB" -> Some(2), "C" -> None)
    }
  }
}
