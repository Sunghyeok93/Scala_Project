package chapter9_7

import scala.io.Source
import scala.util.matching.Regex

object problem9_7 {

  def main(args: Array[String]): Unit = {

    val sources = Source.fromFile("/Users/sunghyeok/install_java8.sh").toArray

    val numPattern = """^\d*.\d*$""".r

    for (matchString <- numPattern.findAllIn(sources))
      println(matchString)
  }
}
