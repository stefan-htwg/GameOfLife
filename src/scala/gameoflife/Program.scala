

package scala.gameoflife

object Program {
  def main(args: Array[String]) {
    
    var tui = new GameOfLifeTui
    var board = new Board
    var controller = new Controller(tui, board)
    
    controller.loadView
    tui.run
  }
}