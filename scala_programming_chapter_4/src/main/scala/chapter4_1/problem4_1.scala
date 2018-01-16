package chapter4_1

object problem4_1 {

  def main(args: Array[String]): Unit = {

    //1. 사고싶은 여러 장치의 가격 맵을 만들라. 그러고 나서 키는 같고 가격은 10% 할인된 두 번째 맵을 생성하라.

    val prices = scala.collection.mutable.Map("psp4" -> 400000, "nintendo" -> 350000, "macPro"->2000000)
    val discountPrices = for ((k,v) <- prices) yield (k -> (v*0.9).toInt)

    println(discountPrices)
  }
}
