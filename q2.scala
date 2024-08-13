object NumberCategorizer {
  def main(args: Array[String]): Unit = {

    println("Please enter an integer:")

    val input = scala.io.StdIn.readInt()

    val isDivisibleBy3 = (num: Int) => num % 3 == 0
    val isDivisibleBy5 = (num: Int) => num % 5 == 0

    def categorizeNumber(num: Int): String = {
      num match {
        case n if isDivisibleBy3(n) && isDivisibleBy5(n) => "Multiple of Both Three and Five"
        case n if isDivisibleBy3(n) => "Multiple of Three"
        case n if isDivisibleBy5(n) => "Multiple of Five"
        case _ => "Not a Multiple of Three or Five"
      }
    }

    println(categorizeNumber(input))
  }
}
