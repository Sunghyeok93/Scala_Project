package jsonEdit

import java.util
import java.util.List


object Command {

  class Subcommand {
    private var option: util.List[Command.Option] = null
    private var output: Command.Output = null
    private var input: Command.Input = null
    private var name: String = null

    def getOption: util.List[Command.Option] = option

    def setOption(option: util.List[Command.Option]): Unit = {
      this.option = option
    }

    def getOutput: Command.Output = output

    def setOutput(output: Command.Output): Unit = {
      this.output = output
    }

    def getInput: Command.Input = input

    def setInput(input: Command.Input): Unit = {
      this.input = input
    }

    def getName: String = name

    def setName(name: String): Unit = {
      this.name = name
    }
  }

  class Option {
    private var parameter: Command.Parameter = null
    private var flag: Boolean = false
    private var dup: Boolean = false
    private var mandatory: Boolean = false
    private var value: String = null
    private var name: String = null

    def getParameter: Command.Parameter = parameter

    def setParameter(parameter: Command.Parameter): Unit = {
      this.parameter = parameter
    }

    def getFlag: Boolean = flag

    def setFlag(flag: Boolean): Unit = {
      this.flag = flag
    }

    def getDup: Boolean = dup

    def setDup(dup: Boolean): Unit = {
      this.dup = dup
    }

    def getMandatory: Boolean = mandatory

    def setMandatory(mandatory: Boolean): Unit = {
      this.mandatory = mandatory
    }

    def getValue: String = value

    def setValue(value: String): Unit = {
      this.value = value
    }

    def getName: String = name

    def setName(name: String): Unit = {
      this.name = name
    }
  }

  class Parameter {
    private var punc: String = null
    private var range: String = null
    private var value: String = null
    private var max: Int = 0
    private var min: Int = 0

    def getPunc: String = punc

    def setPunc(punc: String): Unit = {
      this.punc = punc
    }

    def getRange: String = range

    def setRange(range: String): Unit = {
      this.range = range
    }

    def getValue: String = value

    def setValue(value: String): Unit = {
      this.value = value
    }

    def getMax: Int = max

    def setMax(max: Int): Unit = {
      this.max = max
    }

    def getMin: Int = min

    def setMin(min: Int): Unit = {
      this.min = min
    }
  }

  class Output {
    private var punc: String = null
    private var file: String = null
    private var max: Int = 0
    private var min: Int = 0

    def getPunc: String = punc

    def setPunc(punc: String): Unit = {
      this.punc = punc
    }

    def getFile: String = file

    def setFile(file: String): Unit = {
      this.file = file
    }

    def getMax: Int = max

    def setMax(max: Int): Unit = {
      this.max = max
    }

    def getMin: Int = min

    def setMin(min: Int): Unit = {
      this.min = min
    }
  }

  class Input {
    private var punc: String = null
    private var file: String = null
    private var max: Int = 0
    private var min: Int = 0

    def getPunc: String = punc

    def setPunc(punc: String): Unit = {
      this.punc = punc
    }

    def getFile: String = file

    def setFile(file: String): Unit = {
      this.file = file
    }

    def getMax: Int = max

    def setMax(max: Int): Unit = {
      this.max = max
    }

    def getMin: Int = min

    def setMin(min: Int): Unit = {
      this.min = min
    }
  }

}

class Command {
  private var subcommand: Command.Subcommand = null
  private var java: Boolean = false
  private var version: String = null
  private var tool: String = null

  def getSubcommand: Command.Subcommand = subcommand

  def setSubcommand(subcommand: Command.Subcommand): Unit = {
    this.subcommand = subcommand
  }

  def getJava: Boolean = java

  def setJava(java: Boolean): Unit = {
    this.java = java
  }

  def getVersion: String = version

  def setVersion(version: String): Unit = {
    this.version = version
  }

  def getTool: String = tool

  def setTool(tool: String): Unit = {
    this.tool = tool
  }
}

