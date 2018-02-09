package chapter9_8

import scala.io.Source

object problem9_8 {
  def main(args: Array[String]): Unit = {
    val source = Source.fromURL("https://github.com/", "UTF-8").getLines().map(println(_))

  }
}
