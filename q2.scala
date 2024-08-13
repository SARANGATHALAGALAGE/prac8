object NumberCategorizer {
  def main(args: Array[String]): Unit = {

    println("Please enter an integer:")

    val input = scala.io.StdIn.readInt()

    def categorizeNumber(num: Int): String = {
      num match {
        case n if n % 15 == 0 => "Multiple of Both Three and Five"
        case n if n % 3 == 0 => "Multiple of Three"
        case n if n % 5 == 0 => "Multiple of Five"
        case _ => "Not a Multiple of Three or Five"
      }
    }

    println(categorizeNumber(input))
  }
}
