package selfstudy;

public class Y060 {
  public static void main(String[] args) {
    MyMath1 mm = new MyMath1();

    long result1 = mm.add(3L, 5L);
    System.out.println(result1);

    int result2 = mm.max(5, 4);
    System.out.println(result2);

    int result3 = mm.min(10, 1);
    System.out.println(result3);
  }
}

class MyMath1 {

  long add(long a, long b) {
    long result = a + b;
    return result;
    //    return a + b; //위 두줄과 같은 말.
  }

  //두 값을 받아서 둘중에 큰 값을 반환하는 메서드를 작성해라.
  int max(int a, int b) {
    int result = 0;
    if(a > b) {
      result = a;
    } else {
      result = b;
    }
    return result;
  }

  //  두 값을 받아서 둘중에 작은 값을 반환하는 메서드를 작성해라. 

  int result = 0;

  int min(int a, int b) {
    if(a < b) {
      result = a;
    } else {
      result = b;
    }
    return result;
  }

}