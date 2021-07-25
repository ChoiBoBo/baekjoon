package baekjoon;

import java.util.Scanner;

public class Test3052_T {

  public static void main(String[] args) {
    // Scanner를 통해 입력값은 받는다.
    Scanner sc = new Scanner(System.in);

    int arr[] = new int [10];
    int [] results = new int[42];
    int count = 0;

    // 입력값을 arr배열 주소에 넣는다. 
    for(int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();

    // arr배열%42의 값을 results 값에 넣는다. // results는 42개
    for(int i = 0; i < arr.length; i++) {
      results[arr[i] % 42]++;
    }

    // results != 0 이면, count에 추가 한다.
    for(int i = 0; i < results.length; i++) {
      results[i]++;
      if(results[i] != 0) {
        count++;
      }
    }

    // count 출력을 한다.
    System.out.println(count);
  }
}