package selfstudy;

public class S0707_3 {

  public static void main(String[] args) {

    //bitcamp-study > java-basic > ex99 > Exam0210~0250


    //    Exam0230


    java.io.InputStream keyboard = System.in;
    java.util.Scanner remoto = new java.util.Scanner(keyboard);


    System.out.print("int: ");
    int i = remoto.nextInt();

    System.out.print("float: ");
    float f = remoto.nextFloat();

    System.out.print("boolean: ");
    boolean b = remoto.nextBoolean();

    remoto.close();

    System.out.printf("%d, %f, %b\n", i, f, b);




  }

}
