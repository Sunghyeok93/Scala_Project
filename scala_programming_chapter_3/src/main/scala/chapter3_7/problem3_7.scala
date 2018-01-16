package chapter3_7

object problem3_7 {

  def main(args: Array[String]): Unit = {

    //7. 중복 제거한 배열의 모든 값을 생성하는 코드조각을 작성하라.

    val array = Array(1,1,2,3,3,5,6,7,7,10)

    println(array.distinct.mkString(","))
  }
}
