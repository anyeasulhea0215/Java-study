
import java.util.Scanner;


//객체예제
class animal{
  String name;
  public void setname(String name2){
    this.name=name2;

  }
}
 class Sample {
  void sum(int a, int b) {
      System.out.println(a+"과 "+b+"의 합은 "+(a+b)+"입니다.");
  }
}

public class Ex01/*  ->src코드 명 */ {
    public static void main(String[] args) {
       
    
    //정수->실수 변환시 float로의 변환은 권장하지 않음
    //double 로 형변환.

    /*byte num1='a';
    short num2='a';
    float num5='a'; //97.0
    double num='a'; //97.0

    //a의 아스키 코드는 97

  int B='A'+1;
  int C='A'+1;

  System.out.printf("B=%s, C=%s",B,C);

    }


    int a=(int)(10.2+3.1);

    System.out.println(a);
 */

animal a=new animal();


a.setname("cloudy");
System.out.println(a.name);

Sample sample=new Sample();
sample.sum(3,40);


   }

}
