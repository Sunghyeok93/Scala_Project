package chapter9_8

import scala.io.Source

object problem9_8 {
  def main(args: Array[String]): Unit = {
    val source = Source.fromURL("https://www.naver.com/", "UTF-8").mkString

    val content = Source.fromURL("https://github.com/").mkString
    val pattern = """<img.*? src="(.+?)"""".r

    for (pattern(url) <- pattern.findAllIn(source))
      println(url)
  }
}
