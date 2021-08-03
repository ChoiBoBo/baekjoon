package selfstudy;

class Y54{
  public static void main(String[] args) {

    Tv t1 = new Tv();
    Tv t2 = new Tv();

    t1.chanel = 7;
    t1.chaneldown();
    System.out.println(t1.chanel);

    t1 = t2; //참조변수 t1의 값을 t2에 저장.
    System.out.println(t1.chanel);
  }
}

class Tv {
  String color;
  boolean power;
  int chanel;

  void power() { power =! power;}
  void chanelUp() {++chanel;}
  void chaneldown() {--chanel;}
}