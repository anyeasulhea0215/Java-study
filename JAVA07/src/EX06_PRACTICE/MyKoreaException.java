package EX06_PRACTICE;
public class MyKoreaException extends Exception {
    public MyKoreaException(){
        super("국어 점수가 범위를 벗어났다");
        
    }
    public MyKoreaException(String message){
        super(message);
    } 
}
/*
 * java에서 제공하는 에러 클래스를 상속받은 클래스
 * 개발자가 직접 정의한 비정상적인 상황을 의미하는 클래스
 */
