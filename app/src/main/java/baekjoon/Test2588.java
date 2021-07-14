package baekjoon;

import java.util.Scanner;

// 2588 문제
// 다시 풀기
public class Test2588 {

  public static void main(String[] args) {

    Scanner keyboardScan = new Scanner(System.in);

    int A = keyboardScan.nextInt();
    int B = keyboardScan.nextInt();

    System.out.println(A * (B%10) );
    System.out.println(A * (( B % 100) / 10));
    System.out.println(A * (B/100));
    System.out.println(A * B);
  }

}
