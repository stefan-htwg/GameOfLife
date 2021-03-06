

package scala.gameoflife

class Board(xDimension: Integer, yDimension: Integer) {
  def this() = this(3, 3)

  var set = getBoardSet(xDimension, yDimension)

  set(0)(1).isAlive = true
  set(1)(1).isAlive = true
  set(2)(1).isAlive = true

  private def getBoardSet(x: Integer, y: Integer): Array[Array[Cell]] =
    {
      val newSet = Array.ofDim[Cell](x, y)

      for (yOuter <- 0 until y; xInner <- 0 until x) {
        newSet(xInner)(yOuter) = new Cell(xInner, yOuter)
      }

      return newSet
    }

  def next() =
    {
      var newSet = getBoardSet(xDimension, yDimension)

      for (y <- 0 until set.length; x <- 0 until set.length) {
        val cell = set(x)(y)

        newSet(x)(y).isAlive = cell.nextRoundAlive(getNeighborsCount(cell))
      }

      set = newSet
    }

  private def getNeighborsCount(currentCell: Cell): Integer =
    {
      var neighbors = 0

      for (y <- 0 until set.length; x <- 0 until set.length) {
        val cellToTest = set(x)(y)

        if (cellToTest.isNeighborOf(currentCell) && cellToTest.isAlive)
          neighbors += 1
      }
      return neighbors
    }

  override def toString =
    {
      var output = ""

      for (y <- 0 until set.length) {
        for (x <- 0 until set.length) {
          var value = set(x)(y).isAlive
          var string = if (value) "X" else "i"
          output += string
        }
        output += "\n"
      }
      output
    }
}

