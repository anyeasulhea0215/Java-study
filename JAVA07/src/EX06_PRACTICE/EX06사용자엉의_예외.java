package EX06_PRACTICE;
public class EX06사용자엉의_예외 {
    public static void main(String[] args) {
        Student s=new Student();
       s.setName("헬로월드");

       try{
        s.setKor(-123);
       }
       catch(MyKoreaException e){
        //에러메세지용 출력문
        System.err.println("[MyKorException]>>"+e.getMessage());
       }
       try{
        s.setKor(123);
       }
       catch(MyKoreaException e){
        System.err.println("[MyKorException]>>"+e.getMessage());
       }

       try{
        s.setMath(-1);
       }
       catch(MyMathException e){
        //에러메세지용 출력문
        System.err.println("[MymathException]>>"+e.getMessage());
       }
       try{
        s.setMath(101);
       }
       catch(MyMathException e){
        System.err.println("[MyKorException]>>"+e.getMessage());
       }
       System.out.println(s.toString());
    }
}
