package chapter5_8

object problem5_8 {
  def main(args: Array[String]): Unit = {

    //8. 제조사, 모델명, 모델 연도를 읽기 전용 프로퍼티로 가지고 번호판을 읽기-쓰기 프로퍼티로 가지는
    //   Car 클래스를 만들어라. 네개의 생성자를 제공하라. 모든 생성자는 제조사와 모델명을 요구한다.
    //   선택적으로, 모델 연도와 번호판을 생성자에 지정할 수 있다. 그렇지 않으면 모델 연도는 -1이 되고
    //   번호판은 빈 문자열이 된다. 어느 생성자를 기본 생성자로 선택할 것인가? 왜 그런가? => 항상 인자로 받아야하는 제조사, 모델명

    val car1 = new Car("1", "2")
    val car2 = new Car("1", "2", "3")
    val car3 = new Car("1", "2", 3)
    val car4 = new Car("1", "2", 3, "4")

    car1.getProperties()
    car1.number="345"
    car1.getProperties()
    car2.getProperties()
    car3.getProperties()
    car4.getProperties()

    //car1.year = 123
    //car1.made = "aaa"


  }
}
