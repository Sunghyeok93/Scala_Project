package chapter6_6

object problem6_6 {

  def main(args: Array[String]): Unit = {
    //6. 4개의 카드 세트를 묘사하는 이뉴머레이션을 작성하여 toString 메소드가 ♣, ◆, ♥, ♠를 리턴하게 만들어라3
    println(cardSet.diamond)
    println(cardSet.heart)
    println(cardSet.isRed(cardSet.heart))
  }
}
