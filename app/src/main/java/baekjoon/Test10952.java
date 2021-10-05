package baekjoon;

import java.util.Scanner;

public class Test10952 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    //11
    // sc.nextint() 로 입력값을 담는 A,B를 생성
    int A = sc.nextInt();
    int B = sc.nextInt();

    if(0 < A || B <10) {
      int result = A + B;
    }
    // result = a + b

    System.out.println(result);
    // ssysout 


  }
}