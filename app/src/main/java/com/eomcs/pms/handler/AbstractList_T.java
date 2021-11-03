package com.eomcs.pms.handler;

public abstract class AbstractList_T implements List {
  protected int size;

  @Override
  public int size() {
    return this.size;
  }
}
