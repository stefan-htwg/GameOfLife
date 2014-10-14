
class Cell(var x:Integer, var y:Integer)
{
  var isAlive = false
  
  def isNeighborOf(cell:Cell) : Boolean =
  {
    if(x == cell.x &&
        y == cell.y)
    	return false
    	
	if((x - cell.x).abs > 1 ||
			(y - cell.y).abs > 1)
		return false
    return true
  }
  
  def nextRoundAlive(neighbors:Integer): Boolean =
  {
    if(isAlive == false)
      return if(neighbors == 3) true else false
    if (neighbors == 2 || neighbors == 3)
    	return true
    return false
  }
  
  override def toString : String =
  {
	  return isAlive.toString()
  }
}