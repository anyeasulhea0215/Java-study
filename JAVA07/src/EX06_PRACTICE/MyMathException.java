package EX06_PRACTICE;
public class MyMathException extends Exception{
    public MyMathException(){
      super("수학점수가 범위를 벗어남.");
    }
    public MyMathException(String message){
        super(message);
    }
}
