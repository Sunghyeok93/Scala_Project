package chapter4_7
import scala.collection.JavaConversions.propertiesAsScalaMap

object problem4_7 {

  def main(args: Array[String]): Unit = {
    
    // 7. 모든 자바 속성의 표를 출력하라.
    val props : scala.collection.Map[String, String] = System.getProperties
    var longestLength = 0;
    for (key <- props.keySet) {
      longestLength = if (key.length > longestLength) key.length else longestLength
    }

    for ((key, value) <- props) {
      printf("%-" + (longestLength + 1) +"s | %s%n", key, value)


    }
  }

}