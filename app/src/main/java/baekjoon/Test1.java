package baekjoon;
//asd
public class Test1 {

  static int countEvenNumber(int value) {
    // 코드를 완성하시오 assa

    int number = value;
    int count = 0;
    while(number > 0){
      if(number % 2 == 0){
        count++;
      }
      number /= 10;
    }
    return count;

  }

  public static void main(String[] args) {
    System.out.println(countEvenNumber(1238694636));
  }
}