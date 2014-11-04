/**
 * Created by fatu on 9/19/2014.
 */
object PrimeFactors {
  def result(number: Int): List[Int] = {
    var primeFactors = List[Int]()
    var n = number
    while (number % 2 == 0) {
      primeFactors :+= 2
      n /= 2
    }
    else if (n > 1)
      primeFactors :+ n
    else
      primeFactors
  }

}
