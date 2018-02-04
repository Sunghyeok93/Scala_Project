package chapter_ex

object case_class {

  abstract class Notification

  case class Email(sourceEmail: String, title: String, body: String) extends Notification
  case class SMS(sourceNumber: String, message: String) extends Notification
  case class VoiceRecording(contactName: String, link: String) extends Notification

  def main(args: Array[String]): Unit = {

    val emailFromJohn = Email("john.doe@mail.com", "Greetings From John!", "Hello World!")

    val title = emailFromJohn.title
    println(title) // print "Greetings From John!"
    //emailFromJohn.title = "Goodbye From John!" // 컴파일시 에러. val인 필드에 다른 값을 할당할수 없으며,
                                               // 모든 케이스 클래스 필드는 기본적으로 val이다.

    val editedEmail = emailFromJohn.copy(title = "I am learning Scala!", body = "It's so cool!")
    println(emailFromJohn) // prints "Email(john.doe@mail.com,Greetings From John!,Hello World!)"
    println(editedEmail) // prints "Email(john.doe@mail.com,I am learning Scala,It's so cool!)"

    val someSms = SMS("12345", "Are you there?")
    val someVoiceRecording = VoiceRecording("Tom", "voicerecording.org/id/123")

    println(showNotification(someSms))
    println(showNotification(someVoiceRecording))
  }

  def showNotification(notification: Notification): String = {
    notification match {
      case Email(email, title, _) =>
        "You got an email from " + email + " with title: " + title
      case SMS(number, message) =>
        "You got an SMS from " + number + "! Message: " + message
      case VoiceRecording(name, link) =>
        "you received a Voice Recording from " + name + "! Click the link to hear it: " + link
    }
  }

}
