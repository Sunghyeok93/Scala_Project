package chapter8_1

object problem8_1 {
  def main(args: Array[String]): Unit = {
    // 다음 BankAccount 클래스를 매회 입금과 출금에 $1를 청구하는 CheckingAccount로 확장하라.
    val checkingAccount = new CheckingAccount(100.0)
    println(checkingAccount.deposit(30))


  }
}
