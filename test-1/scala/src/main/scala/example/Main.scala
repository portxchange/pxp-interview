package example
import scala.util.Try

object Main extends App {
  if(args.size <= 0) {
    println("Usage: Main number")
    sys.exit(-1)
  }
  val number = Integer.parseInt(args(0))
  val isHappy = HappyNumber.isHappy(number)
  println(s"$number is ${if(isHappy) "" else "not"} a happy number")
}
