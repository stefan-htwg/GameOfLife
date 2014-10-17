package scala.gameoflife

trait ViewListener {
  def run();
  def setBoard(board: Board)
}