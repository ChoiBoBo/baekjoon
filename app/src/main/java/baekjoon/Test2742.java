package baekjoon;

import java.util.Scanner;

// 2741 문제
public class Test2742 {

  public static void main(String[] args) {

    Scanner keyboardScan = new Scanner(System.in);
    int i = keyboardScan.nextInt(); 
    keyboardScan.close();

    int result = 1;
    while(result <= i) {
      System.out.println(result);
      result++;
    }
  }
}
