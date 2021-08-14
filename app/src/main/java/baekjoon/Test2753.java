package baekjoon;

import java.util.Scanner;

// 2753 문제
public class Test2753 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();


    if(A % 4 == 0 && A % 100 != 0) {
      System.out.println(1);
    } else if(A % 4 == 0 && A % 400 == 0) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }

    // 윤년의 정의
    // 4의 배수 && !100 
    // 4의 배수 && 400의 배수
  }
}
