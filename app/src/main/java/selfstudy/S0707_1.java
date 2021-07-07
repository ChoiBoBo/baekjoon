package selfstudy;

public class S0707_1 {

  public static void main(String[] args) {

    //bitcamp-study > java-basic > ex99 > Exam0210~0250


    //    Exam0210

    // keyboard 데이터 읽을 도구 세팅
    java.io.InputStream keyboard = System.in;


    //    Scanner설계도가 자바 및 유틸 밑에 위치했다.
    //    Scaner 도구(=객체, 물건)를 keyboard에 장착한다
    //이 기능을 가진 걸 KeyScan의 리모컨을 만들어 사용할 예정이다.
    java.util.Scanner KeyScan = new java.util.Scanner(keyboard);

    System.out.println("이름은?");

    String str = KeyScan.nextLine();

    System.out.println(str);

    KeyScan.close();








  }

}
