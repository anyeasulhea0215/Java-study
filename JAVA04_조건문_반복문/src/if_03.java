import java.util.Scanner;

public class if_03 {
    public static void main(String[] args) {
        // while문
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int x = sc.nextInt();

        sc.close();

        int i = 1; // 초기식

        while (i < 10) {
            System.out.printf("%d x %x=%d\n", x, i, x * i);
            i++;
        }
    }
}
