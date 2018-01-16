package chapter3_1

import scala.collection.mutable.ArrayBuffer
import scala.util.Random

object problem3_1 {

  def main(args: Array[String]): Unit = {

    // 1. a를 0(포함)과 n(불포함) 사이의 임의의 수 n개의 배열로 설정하는 코드 조각을 작성하라.

    val randomInt = Random.nextInt(100)
    val randomArray = new Array[Int](randomInt)

    for(i <- 0 until randomArray.length)
      {
        randomArray(i) = Random.nextInt(randomInt)
      }

    println(randomArray.mkString(","))

  }
}
