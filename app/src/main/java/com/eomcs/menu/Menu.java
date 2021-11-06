package com.eomcs.menu;

public abstract class Menu {

  public static final int ENAVLE_ALL = 0;
  public static final int ENAVLE_LOGOUT = 1;
  public static final int ENAVLE_LOGINY = 2;

  String title;
  int enableState;

  public Menu(String title) {
    this.title = title;
  }

  public abstract void execute();
}
