public class EX01_예외 {
    public static void main(String[] args) throws Exception {
        int []k={10,20,30};

        for(int i=0;i<5;i++){
            //인덱스가 3인 i가 없으므로 i가 3일때 에러발생
            System.out.println(k[i]);
        }
           //에러 발생하면 프로그램 다운되므로 아래 구문 실행못함
        System.out.println("fin:");
        /*
          10
          20
          30
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        at EX01_예외.main(EX01_예외.java:6)
         */
    }
}
