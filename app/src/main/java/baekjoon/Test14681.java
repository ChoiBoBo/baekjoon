package baekjoon;

import java.util.Scanner;

// 14681 문제
public class Test14681 {

  public static void main(String[] args) {
    Scanner keyboardScan = new Scanner(System.in);

    int a = keyboardScan.nextInt();
    int b = keyboardScan.nextInt();

    if(a < 0 && b < 0 ) {
      System.out.println("3");
    }else if(a < 0 && b > 0 ) {
      System.out.println("2");
    }else if (a > 0 && b > 0 ) {
      System.out.println("1");
    }else {
      System.out.println("4");
    }
  }
}
