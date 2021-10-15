package com.eomcs.pms.menu;

public class BoardUpdateMenu extneds Menu {

  BoardHandler boardHandler;

  public BoardUpdateMenu(BoardHandler boardHandler) {
    super("변경");
    this.boardHandler = boardHandler;
  }

  @override
  public void execute() {
    boardHandler.update();
  }
}
