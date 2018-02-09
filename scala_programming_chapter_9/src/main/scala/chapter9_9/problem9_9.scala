package chapter9_9

import java.io.File

import scala.io.Source

object problem9_9 {
  def main(args: Array[String]): Unit = {
    printFiles("./")
    Source.fromFile("install_java8.sh").mkString.split(" ").map(println(_))

  }
  def subdirs(dir:File): Iterator[File] = {
    val children = dir.listFiles.filter(_.isDirectory)
    children.toIterator ++ children.toIterator.flatMap(subdirs _)
  }

  def printFiles(path: String) = {
    for (dir <- subdirs(new File(path)))
      for (file <- dir.listFiles)
        if (file.getName.endsWith(".class"))
          println(file.getName)
  }
}
