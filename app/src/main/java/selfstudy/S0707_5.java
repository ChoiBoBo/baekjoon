package selfstudy;

public class S0707_5 {

  public static void main(String[] args) {

    //bitcamp-study > java-basic > ex99 > Exam0210~0250


    //    Exam0250



    java.util.Scanner Keyboard = new java.util.Scanner(System.in);

    System.out.println("나이, 이름, 진실?");

    int age = Keyboard.nextInt();
    String name =Keyboard.next() ;
    boolean woring = Keyboard.nextBoolean();

    System.out.printf("%f,%s,%b\n",age, name, woring);
    Keyboard.close();

  }

}
