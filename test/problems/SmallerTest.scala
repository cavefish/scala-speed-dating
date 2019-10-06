package problems

import org.scalatest.FlatSpec
import org.scalatest.prop.TableDrivenPropertyChecks._

class SmallerTest extends FlatSpec {
  val cases = Table(
    ("input", "delimiter", "result"),
    (List(1, 2, 3, 4), 3, List(1, 2)),
    (Set(-1, -2, -3, -4), -3, Set(-4)),
  )

  forAll(cases) { (input, delimiter, result)
  =>
    assertResult(result)(Smaller.get(input, delimiter))
  }
}
