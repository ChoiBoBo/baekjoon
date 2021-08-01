package baekjoon;

import java.util.Scanner;

// 1330 문제
public class Test10950 {

  public static void main(String[] args) {

    Scanner keyboardScan = new Scanner(System.in);

    int A = keyboardScan.nextInt();
    int B = keyboardScan.nextInt();

    if(A > B) {
      System.out.println(">");
    }else if(A < B) {
      System.out.println("<");
    }else {
      System.out.println("==");
    }
  }

}
