package baekjoon;

import java.util.Scanner;

public class Test10952 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    while(true) {
      int A = in.nextInt();
      int B = in.nextInt();

      if(A==0 && B==0) {
        break;
      }
      System.out.println(A+B);
    }

  }
}