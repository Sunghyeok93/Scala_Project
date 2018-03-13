package jsonEdit

import netscape.javascript.JSObject
import play.api.libs.json._


object main {
  def main(args: Array[String]): Unit = {
    println("aaaaaaaa")
    val myNode = new Node("aaa","aaa","aaa","aaa","aaa","aaa","aaa")
    println(myNode.command)

    val json: JsValue = Json.parse("""
      {
        "tool":"trimmomatic",
        "version":"0.36",
        "java":true,
        "subcommand":{
          "name":"SE",
          "input":{
          "min":1,
          "max":1,
          "file":"Test01_1.fastq.gz",
          "punc":" "
        },
          "output":{
          "min":1,
          "max":1,
          "file":"Test01_trim_1.fastq.gz",
          "punc":" "
        },
          "option":[
        {
          "name":"Number of Threads",
          "value":"-threads",
          "mandatory":false,
          "dup":false,
          "flag":false,
          "parameter":{
          "min":1,
          "max":1,
          "value":"int",
          "range":"1-10",
          "punc":" "
        }
        },
        {
          "name":"SLIDING WINDOW",
          "value":"SLIDINGWINDOW",
          "mandatory":false,
          "dup":false,
          "flag":false,
          "parameter":{
          "min":2,
          "max":2,
          "value":"string",
          "range":null,
          "punc":":"
        }
        }
          ]
        }
      }
    """)


  println(json)
  }
}
