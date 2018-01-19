package chapter5_7

object problem5_7 {
  def main(args: Array[String]): Unit = {

    // 7. new Person("Fred Smith")와 같이 이름, 공백, 성을 포함한 문자열을 받는 기본 생성자가 있는
    // Person 클래스를 작성하라. 읽기 전용 프로퍼티인 firstName과 lastName을 제공하라. 기본 생성자
    // 인자는 var, val, 일반 인자 중 어느 것이어야 하나? 왜 그런가? => 일반인자 사용. val, var 개념이 의미가 없음.

    val sunghyeok = new Person("Sunghyeok Kang")
    println(sunghyeok.getName()._1 + " " +sunghyeok.getName()._2)
  }
}
