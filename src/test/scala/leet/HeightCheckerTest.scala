package leet

import org.scalatest.FunSuite
import org.scalatest.Matchers._

class HeightCheckerTest extends FunSuite {

  test("testHeightChecker") {
    HeightChecker.heightChecker(Array(1,2,1,2,1,1,1,2,1)) should equal(4)

  }

}
