package baekjoon;

import java.util.Scanner;

// 1001 문제 asd
public class Test1001 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();


    System.out.println((A+B)%C);
    System.out.println(((A%C) + (B%C))%C);
    System.out.println((A*B)%C);
    System.out.println(((A%C) * (B%C))%C);
  }
}


