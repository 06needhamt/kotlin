package foo

import java.util.*

fun box(): Boolean {
    val oneTwo = Array(2) {
        it + 1
    }
    val a = ArrayList<() -> Int>()
    for (i in oneTwo) {
        for (j in 1..2) {
            a.add({
                      var res = 0
                      for (t in 0..2) {
                          res += i * j
                      }
                      res
                  })
        }
    }
    var sum = 0
    for (f in a) {
        sum += f()
    }
    return (sum == 27)
}
