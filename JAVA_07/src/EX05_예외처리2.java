import java.util.Scanner;
class Calc {
  private static Calc current;

  public static Calc getInstance(){
      if(current==null){
          current=new Calc();
      }
      return current;
  }

  private Calc(){
      super();
  }
  //런타임 에러 가능성이 있는 메서드 안에 직접 try-catch사용 
  public int divided(int x,int y){
      int z=0;
      try{
          z=x/y;
      }
      catch(Exception e){
             System.out.println("[divided에러] 0으로 나눌수 없습니다");
      }
      return z;
  }
  //theows처리->에러 발생시 메서드를 호출한 지점으로 예외처리 책임 넘김:try,catch
  public int dividedEx(int x,int y)throws Exception{
   return x/y;
  }
}

public class EX05_예외처리2 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);

        System.out.print("x 를 입력:");
        int x=reader.nextInt();

        System.out.print("y 를 입력:");
        int y=reader.nextInt();
 
          reader.close();

          Calc c=Calc.getInstance();
         //y가 0이면 devided메서드 안에서 0으로 나누기 때문에 예외발생
          int z=c.divided(x, y);

          System.out.printf("[divided]%d나누기 %d는 %d입니다\n", x,y,z);
          System.out.println("=============");
       
          int a=0;

          //throws적용된 메서드 호출 때 try~catch에 대한 내용이 강제됨.
          try{
            a=c.dividedEx(x, y);
          }
          catch(Exception e){
            System.out.println("[dividedEx 에러]0으로 나눌수 없습니다.");
          }
          System.out.printf("[dividedEx]%d나누기 %d는 %d입니다\n", x,y,a);
        
    }
  }
