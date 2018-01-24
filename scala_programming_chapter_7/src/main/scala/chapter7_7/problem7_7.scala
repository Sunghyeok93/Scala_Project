package chapter7_7



object problem7_7 {
  def main(args: Array[String]): Unit = {
    // 6. 자바 해시 맵에서 스칼라 해시 맵으로 모든 원소를 복사하는 프로그램을 작성하라. 임포트를 사용해 두 클래스의 이름을 변경하라.
    // 7. 6번 문제에서 모든 임포트는 최대한 안쪽 스코프로 옮기라.

    import java.util.{HashMap => JavaHashMap}
    import scala.collection.mutable.{HashMap => ScalaHashMap}

    val scalaHashMap = new ScalaHashMap[String, Int]
    val javaHashMap = new JavaHashMap[String, Int]

    javaHashMap.put("111", 111)
    javaHashMap.put("222", 222)

    import scala.collection.JavaConversions._
    for( (k,v) <- javaHashMap)
      {
        scalaHashMap.put(k,v)
      }

    //scalaHashMap.++=(javaHashMap.asScala)
    println(scalaHashMap)

    // 8. import java._
    //    import javax._ 의 효과는 무엇인가? 좋은 생각인가? => 둘이 중복 안됨.

  }
}
