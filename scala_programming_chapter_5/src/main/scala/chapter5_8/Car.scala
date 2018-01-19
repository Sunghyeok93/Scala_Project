package chapter5_8

class Car(made: String, name: String) {
  private var year = -1
  var number = "#"

  def this(made: String, name:String, year: Int) =
  {
    this(made, name)
    this.year = year
  }

  def this(made:String, name:String, number: String) =
  {
    this(made, name)
    this.number = number
  }

  def this(made:String, name:String, year:Int, number: String) =
  {
    this(made, name)
    this.year = year
    this.number = number
  }

  def getProperties() = println(made + " " + name+ " " + year+ " " + number)

}
