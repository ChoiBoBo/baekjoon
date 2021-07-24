package selfstudy;


class Y53{
  public static void main(String[] args) {
    //main메서드가 있는 class이름을 소스파일과 일치해야 이클립스가 실행함.

    MyMath mm = new MyMath();
    long result1 = mm.add(5L, 3L);
    long result = mm.max(5,3);

    System.out.println("Max(5, 3) = " + result);
    System.out.println("add(5L, 3L) = " + result1);



  }
}
class MyMath{
  long add(long a, long b) {
    long result = a = b;
    return result ;

  }
  long max(long a, long b) {
    return a> b ? a : b;
  }



}


