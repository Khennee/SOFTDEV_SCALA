object ScrabbleScoreUnitTest extends App {
  object ScrabbleScore {
    val LETTER_SCORES: Map[Char, Int] = Map(
      'A' -> 1,
      'E' -> 1,
      'I' -> 1,
      'O' -> 1,
      'U' -> 1,
      'L' -> 1,
      'N' -> 1,
      'S' -> 1,
      'T' -> 1,
      'R' -> 1,
      'D' -> 2,
      'G' -> 2,
      'B' -> 3,
      'C' -> 3,
      'M' -> 3,
      'P' -> 3,
      'F' -> 4,
      'H' -> 4,
      'V' -> 4,
      'W' -> 4,
      'Y' -> 4,
      'K' -> 5,
      'J' -> 8,
      'X' -> 8,
      'Q' -> 10,
      'Z' -> 10
    )

    def calculateScore(WORD: String): Int = {
      WORD.toUpperCase.toList.map(LETTER_SCORES.getOrElse(_, 0)).sum
    }
  }
  println()
  println("Trying some words with int results : ")
  println(ScrabbleScore.calculateScore("amazing"))
  println(ScrabbleScore.calculateScore("wow"))
  println(ScrabbleScore.calculateScore("sheeeeeeeeeeesh"))
  println(ScrabbleScore.calculateScore(""))
  println()
  println("Trying some words with boolean results : ")
  println(ScrabbleScore.calculateScore("lol") == 3)
  println(ScrabbleScore.calculateScore("ohio") == 11)
  println(ScrabbleScore.calculateScore("sigma") == 21)
  println(ScrabbleScore.calculateScore("") == 0)
  println(ScrabbleScore.calculateScore("krazy") == 300)
  println(ScrabbleScore.calculateScore("JuStinEbIebEr") == 10)
  println()
  println("TEST FINISHED.")
}



