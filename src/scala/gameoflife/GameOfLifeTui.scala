package scala.gameoflife

class GameOfLifeTui extends ViewListener {
  
  var board = new Board;
  def setBoard(newBoard: Board) = board = newBoard
  
  def newRound(dimension: Integer, configuration: Array[Integer]) = {}

  def run() =
    {
      println(board.toString)

      var shouldContinue = true
      while (shouldContinue) {
        var input = readLine()
        if (input == "q") {
          println("quit game")
          shouldContinue = false
        } else {
          board.next
          println(board.toString)
        }
      }
    }
}