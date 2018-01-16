package chapter3_5

import scala.util.Random

object problem3_5 {

  def main(args: Array[String]): Unit = {

    // 5. Array[Double]의 평균을 어떻게 계산하나?

    val arrayDouble = new Array[Double](10)
    var avg = 0.0

    for(i <- 0 until arrayDouble.length)
      {
        arrayDouble(i) = Random.nextDouble()
      }

    for(i <- 0 until arrayDouble.length)
      {
        avg = avg + arrayDouble(i)
      }

    println(avg/arrayDouble.length)
  }
}
