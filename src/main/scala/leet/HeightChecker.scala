package leet

object HeightChecker {
  def heightChecker(heights: Array[Int]): Int = {
//    var notInOrder = 0
//
//    heights.foldLeft(0) {
//      (prev, current) =>
//
//        if (current >= prev) {
//          current
//        } else {
//          notInOrder+=1
//          prev
//        }
//
//    }
//
//    notInOrder


    val sorted = heights.sorted

    heights.zip(sorted).collect{
      case (a, b) =>
        if (a != b) 1 else 0
    }.sum

  }
}
