package baekjoon;

import java.util.Scanner;

// 10818 문제
public class Test10818 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int min = 1000000;
    int max = -1000000;

    // 입력값 3을 n에 보관한다. 
    int n = sc.nextInt();

    // 3개 크기의 배열을 numbers 배열에 담는다. 
    int[] numbers = new int[n];


    // 새로 입력한 값의 횟수는 numbers의 크기인 3개만큼 담는다.

    for(int i = 0; i < n; i++) {
      numbers[i] = sc.nextInt();
      if(max < numbers[i]) {
        max = numbers[i];
      }
      if(min > numbers[i]) {
        min = numbers[i];
      }
    }
    System.out.println(min + " "+ max);
  }
}


