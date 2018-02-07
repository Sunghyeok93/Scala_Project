package chapter8_1

class BankAccount(initialBalance: Double) {
  private var balance = initialBalance
  def deposit(amount: Double) = { balance += amount; balance }
  def withdraw(amount: Double) = { balance -= amount; balance }
}

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  override def deposit(amount: Double): Double = super.deposit(amount - 1.0)
  override def withdraw(amount: Double): Double = super.withdraw(amount + 1.0)
}

class SavingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  
}