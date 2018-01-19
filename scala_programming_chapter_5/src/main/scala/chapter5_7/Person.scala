package chapter5_7

class Person(Fullname: String) {
  val name = Fullname.split(" ")

  private val firstName = name(0)
  private val lastName = name(1)

  def getName() = (firstName, lastName)
}
