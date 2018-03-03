package jsonEdit

//7개의 인자를 필요로 하는 노드클래스
//각각 인풋과 아웃풋에 대해 string이 아닌 string배열이 와야할 것 같으며 조금 더 생각해봐야할것같음
class Node(tool:String, version: String, subcommand: String, input: String, output: String, reference: String, option: String) {
  var command = {
    "./" + tool + " " + subcommand + " " + input + " " + output+ " " + reference + " "
  }
}
