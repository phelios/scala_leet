package leet

object CountAndSay {
  def countAndSay(n: Int, saying: String = "1"): String = {
    var str = ""
    var prev = ""
    var curr = ""
    var new_saying: String = ""

    if (n > 0) {
      new_saying = countAndSay(n-1, saying)
      var count = 0
      saying.toSeq.foreach {
        x =>

          curr = x.toString

          if (prev == curr || prev == "") {
            count+=1
          } else {
            str += count.toString + prev
            count = 1
          }
          prev = curr
      }

      str += count.toString + curr
      count = 1

    }

    new_saying

  }
}
