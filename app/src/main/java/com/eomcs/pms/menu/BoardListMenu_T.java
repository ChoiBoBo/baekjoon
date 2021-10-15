package com.eomcs.pms.menu;

import com.eomcs.pms.handler.BoardHandler;

// Composite 패턴에서 Leaf 역할을 할 메뉴 항목을 정의한다.
public class BoardListMenu_T extends Menu {

  BoardHandler boardHandler;

  public BoardListMenu_T(BoardHandler boardHandler) {
    super("목록");
    this.boardHandler = boardHandler;
  }

  @Override 
  public void execute() {
    boardHandler.list(); 
  } 
}
