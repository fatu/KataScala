import PrimeFactors._
import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by fatu on 9/19/2014.
 */
class PrimeFactorsTest extends FlatSpec with Matchers{

  it should "be List() for 1" in {
    result(1) should equal (List())
  }

  it should "be List(2) for 2" in {
    result(2) should equal (List(2))
  }

  it should "be List(2, 2) for 4" in {
    result(4) should equal (List(2, 2))
  }

  it should "be List(2, 2, 2) for 8" in {
    result(8) should equal (List(2, 2, 2))
  }


}
