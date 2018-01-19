package chapter6_6

object cardSet extends Enumeration {
  type cardSet = Value
  val heart = Value("하트")
  val space = Value("스페이스")
  val diamond = Value("다이아")
  val star = Value("스타")

  override def toString(): String = super.toString()

  //7. 카드 세트값이 빨강인지 확인하는 함수를 구현하여라
  def isRed(card: cardSet): Boolean =
  {
    card == heart
  }
}
