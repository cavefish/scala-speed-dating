package problems


import org.scalatest.FlatSpec
import org.scalatest.prop.TableDrivenPropertyChecks._

class MultiTest extends FlatSpec {
  val cases = Table(
    ("input", "multiplier", "result"),
    (List(1, 2, 3), 2, List(2, 4, 6)),
    (List(1, 2, 3), 0, List(0, 0, 0)),
    (Set(1, 2, 3), 2, Set(2, 4, 6)),
    (Set(1, 2, 3), 0, Set(0, 0, 0))
  )

  forAll(cases) { (input, multiplier, result)
  =>
    assertResult(result)(Multi.multiply(input, multiplier))
  }
}
