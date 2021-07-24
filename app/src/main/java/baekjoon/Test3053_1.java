package baekjoon;

import java.util.Scanner;

//첫째 줄에, 42로 나누었을 때, 
//서로 다른 나머지가 몇 개 있는지 출력한다.



public class Test3053_1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int arr[] = new int[10];
    int count = 0;
    int counts[] = new int[42];

    for(int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();

    for(int i = 0; i<arr.length; i++) {
      counts[arr[i]%42]++;
    }

    for(int i = 0; i < counts.length; i++) {
      if(counts[i] != 0) {
        count++;
      }
    }

    System.out.println(count);
  }
}