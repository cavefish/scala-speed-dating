package problems
import org.scalatest.FlatSpec
import org.scalatest.prop.TableDrivenPropertyChecks._

class PrimeTest extends FlatSpec {

  "number 2" should "be a prime" in {
    assert(Prime.isPrime(2))
  }

  "number 3" should "be a prime" in {
    assert(Prime.isPrime(3))
  }

  "number 99" should "not be a prime" in {
    assert(!Prime.isPrime(99))
  }

  "number 101" should "be a prime" in {
    assert(Prime.isPrime(101))
  }

  val cases = Table(
    ("n", "result"),
    (-1, false),
    (0, false),
    (1, false),
    (2, true),
    (3, true),
    (99, false),
    (101, true)
  )

  forAll (cases) { (n:Int, result:Boolean) =>
    assertResult(result)(Prime.isPrime(n))
  }



}
