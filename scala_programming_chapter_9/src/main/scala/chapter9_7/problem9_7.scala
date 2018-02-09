package chapter9_7

import scala.io.Source

object problem9_7 {

  def main(args: Array[String]): Unit = {

    val sources = Source.fromFile("/Users/sunghyeok/install_java8.sh")

    val tokens = sources.mkString.split("\\s+")

    val numbers = for(w <- tokens)
      println(w)
  }
}
