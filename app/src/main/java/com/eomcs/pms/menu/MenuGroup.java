package com.eomcs.pms.menu;

public class MenuGroup extends Menu {

  Menu[] childs = new Menu[100];
  int size;
  boolean disablePrevMenu;
  String prevMenuTitle = "이전 메뉴";

  public MenuGroup(String title) {
    super(title);
  }

  public MenuGroup(String title, boolean disablePrevMenu) {
    super(title);
    this.disablePrevMenu = disablePrevMenu;
  }

  public void add(Menu child) {
    if(this.size == this.childs.length) {
      return;
    }
    this.childs[this.size++] = child;
  }

  public Menu remove(Menu child) {
    int index = indexOf(child);
    if(index == -1) {
      return null;
    }
    for(int i = index + 1; i < this.size; i++) {
      this.childs[i - 1] = this.childs[i];
    }
    childs[--this.size] = null;
    return child;
  }

  public Menu getMenu(String title) {
    for(int i = 0; i < this.size; i++) {
      if(this.childs[i].title.endsWith(title)) {
        return this.childs[i];
      }
    }
    return null;
  }


}
