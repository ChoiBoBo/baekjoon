package baekjoon;

import java.util.Scanner;
//asd
// 2739 문제
public class Test2739 {

  public static void main(String[] args) {

    Scanner keyboardScan = new Scanner(System.in);
    int i = keyboardScan.nextInt(); 
    keyboardScan.close();


    int result = 1;
    while(result <= 9) {
      System.out.println(i + " * " + result + " = " + i * result);
      result++;
    } 

  }
}
