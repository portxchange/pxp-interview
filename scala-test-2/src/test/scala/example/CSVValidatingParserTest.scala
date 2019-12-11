package example

import org.scalatest._

@DoNotDiscover
class CSVValidatingParserTest extends WordSpec with Matchers {
  "The CSV Parser" should {
    "Parse a CSV file" in {
      val input = "A;1\nBB;2;\nC;"

      val output = CSVValidatingParser.parse(input)

      output should have size (3)
      output(0) shouldBe Right("A" -> 1)
      output(1) shouldBe Right("BB" -> 2)
      output(2) shouldBe a[Left[_, _]]
    }
  }
}
