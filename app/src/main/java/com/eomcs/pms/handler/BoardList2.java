package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Board;

public class BoardList2 {

  static class Node() {
    Board board;
    Node next;

    public Node(Board board) {
      this.board = board;
    }
  }

  Node head;
  Node tail;
  int size = 0;

  public void add(Board board) {

    Node node = new Node(board);

    if(head == null) {
      tail = head = node;
    } else {
      tail.next = node;

      tail = node;
    }
    size++;
  }

  public Board[] toArray() {

    if(head == null) {
      tail = head = node;
    } else {
      tail.next = node;

      tail = node;
    }
    size++;
  }

  public Board findByNo(int no) {
    for (int i = 0; i < this.size; i++) {
      if (boards[i].no == no) {
        return boards[i];
      }
    }
    return null;
  }

  public boolean remove(Board board) {
    int index = indexOf(board);
    if (index == -1) {
      return false;
    }

    for (int i = index + 1; i < this.size; i++) {
      this.boards[i - 1] = this.boards[i];
    }
    this.boards[--this.size] = null;

    return true;
  }

  private int indexOf(Board board) {
    for (int i = 0; i < this.size; i++) {
      if (this.boards[i] == board) {
        return i;
      }
    }
    return -1;
  }
}








