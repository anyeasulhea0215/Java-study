import java.util.Scanner;

//import:가져오다  Scanner기능을 가져옴


public class App {
  public static void main (String [] args ){
  
    Scanner sc=new Scanner(System.in);

    System.out.println("점수를 입력:");

    int num=sc.nextInt();
    sc.close();

   if(num<=10){
    System.out.println("불합격");

   }

  else{
    System.out.println("합격");

  }


  }
}
