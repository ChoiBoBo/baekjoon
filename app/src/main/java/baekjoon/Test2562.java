// 1. 서로 다른 9개의 자연수 중에 최댓값을을 찾기 
// 2. 그 최댓값이 몇 번째 수인가 작성

package baekjoon;

import java.util.Scanner;

public class Test2562 {

  public static void main(String[] args) {

    //    Scanner sc = new Scanner(System.in);
    //    int arr[] = new int[10];
    //    int count = 0;
    //    int counts[] = new int[42];
    //
    //    for(int i=0; i<arr.length; i++) {
    //      arr[i] = sc.nextInt(); //arr[0]에 키보드 입력값을 레퍼런스 대입 //  
    //    }
    //    sc.close();
    //
    //    for(int i=0; i<arr.length; i++) {
    //      counts[arr[i]%42]++;
    //    }
    //    for(int i=0; i<counts.length; i++) {
    //      if(counts[i] != 0) {
    //        count++;
    //      }
    //    }
    //    System.out.println(count);

    Scanner sc = new Scanner(System.in);

    // Scanner 로 9개의 입력값을 for문을 통해 arr배열 주소에 저장
    int arr[] = new int[9];

    for(int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    int result = 0;

    for(int i = 0; i < arr.length; i++) {
      if(arr[i] < arr[i+1] && arr[i] > arr[i+1]) {

      }
    }
    System.out.println();
    // 반복문을 통해 0~9번까지 값 비교하기

    // if i < i.length %% > 이면

    // result 저장 후, 출력


  }
}