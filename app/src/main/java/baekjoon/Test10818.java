package baekjoon;

import java.util.Scanner;

// 10818 문제
public class Test10818 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int min = 100000;
    int max = -10000;
    int n = sc.nextInt();
    int[] numbers = new int[n];

    for(int i = 0; i < n; i++) {
      numbers[i] = sc.nextInt();
      if(max < numbers[i]) {
        max = numbers[i];
      }
      if(min > numbers[i]) {
        min = numbers[i];
      }
    }
    System.out.println(min + " " + max);
  }
}


