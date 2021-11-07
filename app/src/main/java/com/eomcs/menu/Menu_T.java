package com.eomcs.menu;

public abstract class Menu_T {

  public static final int ENABLE_ALL = 0;
  public static final int ENABLE_LOGOUT = 1;
  public static final int ENABLE_LOGIN = 2;

  String title;

  int enableState;

  public Menu_T(String title) {
    this.title = title;
  }

  public Menu_T(String title, int enableState) {
    this(title); // 메뉴 이름 설정은 기존 생성자를 통해 처리한다.
    this.enableState = enableState;
  }

  public abstract void execute();
}
