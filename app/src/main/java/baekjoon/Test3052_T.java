package baekjoon;

import java.util.Scanner;

//첫째 줄에, 42로 나누었을 때, 
//서로 다른 나머지가 몇 개 있는지 출력한다.

public class Test3052_T {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);


    int arr[] = new int[10];

    //입력값을 10개를 배열로 받는다.
    for(int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();

    // 받은 배열에 %42를 한 값을 배열로 받는다.

    // 그 배열의 값이 0과 같다면 count를 한다.

    // count 출력을 한다.


  }
}