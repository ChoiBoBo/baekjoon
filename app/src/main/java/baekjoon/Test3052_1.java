package baekjoon;

//첫째 줄에, 42로 나누었을 때, 
//서로 다른 나머지가 몇 개 있는지 출력한다.



public class Test3052_1 {
  public static void main(String[] args) {

    for(int i = 0; i < 10; i++) {
      b1 = false;
      for(int j = i + 1; j < 10; j++) {
        if(num[i] == num[j]) {

          b1 = true;
          break;
        }
        if(b1 == false) {
          count++;
        }
      }
    }

  }
}//클래스종료