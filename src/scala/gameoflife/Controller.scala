package scala.gameoflife

class Controller(listener: ViewListener, board: Board) {
  
  def loadView = { listener.setBoard(board)}
}