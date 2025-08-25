public class EX03_예외처리 {
    public static void main(String[] args) {
        int[]k={10,20,30};
          //에러가 발생할것 같은 코드를 try블록으로 감싼다
        try{
            for(int i=0;i<5;i++){
        System.out.println(k[i]);
            }
        }
        //try블록 안에서 에러가 발생할 경우 실행되는 블록
        //try와 catch는 항상 함께 명시
        //try블록을 수행하는 과정에서 에러가 발새하면 프로그램 다운되지 않고 그즉시 catch블록으로 제어가 이동된다.

        catch(Exception e){
          System.out.println("에러가 발생했다");
          System.out.println("에러의 원인:"+e.getMessage());
          //에러의 원인:Index 3 out of bounds for length 3
          System.out.println("==========");

           /*
           java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
           at EX03_예외처리.main(EX03_예외처리.java:7) */
           //시스템에 의해 출력되는 에러메세지 전문을 강제로 출력함
          e.printStackTrace();
          System.out.println("=========");

        }
        //에러의 발생 여부애 상관없이 무조건 실행되는 블록
        finally{
            System.out.println("배열 탐색 종료");
        }
        System.out.println("fin :)");
    }
}
