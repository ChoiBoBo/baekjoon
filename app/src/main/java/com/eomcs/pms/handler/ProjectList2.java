package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Project;

public class ProjectList2 {

  static class Node {
    Project project;
    Node next;

    public Node(Project project) {
      this.project = project;
    }
  }

  Node head;
  Node tail;
  int size = 0;

  public void add(Project project) {

    Node node = new Node(project);
    if(head == null) {
      tail = head = node;
    } else {
      tail.next = node;

      tail = node;
    }
    size++;
  }

  public Project[] toArray() {
    Project[] arr = new Project[this.size]; // 배열에 저장된 값을 담을 정도의 크기를 가진 새 배열을 만든다.

    Node node = head;

    for (int i = 0; i < this.size; i++) { // 배열에 저장된 값을 새 배열에 복사한다.
      arr[i] = node.project;
      node = node.next;
    }

    return arr; // 새 배열을 리턴한다.
  }

  public Project findByNo(int no) {
    Node node = head;
    while (node != null) {
      if(node.project.no == no) {
        return node.project;
      }
      node = node.next;
    }
    return null;
  }

  public boolean remove(Project project) {
    Node node = head;
    Node prev = null;

    while(node != null) {
      if(node.project == project) {
        if(node == head) {
          head = node.next;
        } else {
          prev.next = node.next;
        }
        node.next = null;

        if(node == tail) {
          tail = prev;
        }
        size--;
        return true;
      }
      prev = node;
      node = node.next;
    }

    return false;
  }
}








