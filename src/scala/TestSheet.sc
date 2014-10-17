object TestSheet {
  var board = new Board()                         //> board  : Board = XXiiiiiii
  board.next
  board.toString                                  //> res0: String = XXXiiXXXX
    board.next
  board.toString                                  //> res1: String = XiiXXXXii
    board.next
  board.toString                                  //> res2: String = iXiiXXiXi
}