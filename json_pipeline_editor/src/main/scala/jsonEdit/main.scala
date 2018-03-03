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
    "name" : "Watership Down",
    "location" : {
      "lat" : 51.235685,
      "long" : -1.309197
    },
    "residents" : [ {
      "name" : "Fiver",
      "age" : 4,
      "role" : null
    }, {
      "name" : "Bigwig",
      "age" : 6,
      "role" : "Owsla"
    } ]
  }
  """)

  println(json)
  }
}
