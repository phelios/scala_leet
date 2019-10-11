package leet

import org.scalatest.FunSuite
import org.scalatest.Matchers._

class CountAndSayTest extends FunSuite {

  test("testCountAndSay") {
    CountAndSay.countAndSay(5) should equal("111221")

  }

}
