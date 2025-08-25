import java.util.Scanner;
//F10--->코드 한줄씩 실행
//F9->그 위치부터 중단

public class if_01 {

    public static void main(String[] args) {

        /*
         * ----------3과5의 배수,공배수
         */
        for (int i = 100; i > 0; i--) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.printf("  \"%d \" \n", i);
            } else if (i % 3 == 0 || i % 5 == 0) {
                System.out.printf("%d\n", i);
            }

        }

    }

}
