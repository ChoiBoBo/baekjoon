package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Board;

public class BoardList2_T extends LinkedList {

  public Board findByNo(int no) {
    Object[] list = toArray();
    for (Object obj : list) {
      Board board = (Board) obj;
      if (board.no == no) {
        return board;
      }
    }
    return null;
  }

}








