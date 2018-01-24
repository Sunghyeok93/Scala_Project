package chapter7_9

object problem7_9 {
  def main(args: Array[String]): Unit = {

    /*
      9. java.lang.System 클래스를 임포트하고, user.name 시스템 프라퍼티에서
      사용자 이름을 읽고, Console 오브젝트에서 암호를 읽어 암호가 "secret"가
      아니면 표준 에러 스트림으로 메시지를 출력하는 프로그램을 작성하라.
      암호가 맞으면 표준 출력 스트림으로 인사를 출력하라. 다른
      임포트는 사용하지 말고 전체 이름(점이 있는)도 사용하지 말아야 한다.
    */

    val systemProperty = System.getProperty("user.name")
    println("user.name = " + systemProperty)

    val password = Console.readLine("enter password : ")

    if (password == "secret")
      Console.out.println("hello")
    else
      Console.err.println("error")
  }
}
