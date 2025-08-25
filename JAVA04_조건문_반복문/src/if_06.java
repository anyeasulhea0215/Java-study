import java.util.Scanner;

public class if_06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age;

        // 첫입력
        System.out.println("가족 구성원의 나이를 입력하시오(0입력시 종료):\n");
        age = sc.nextInt();

        int old = 0;
        int adult = 0;
        int student = 0;
        int child = 0;

        int money = 0; // 지원금

        while (age != 0) {
            if (age > 64) {
                old++;
            } else if (age > 19) {
                adult++;
            } else if (age > 7) {
                student++;
            } else {
                child++;
            }

            System.out.println("가족 구성원의 나이를 입력하시오(0입력시 종료):\n");
            age = sc.nextInt();

        }
        sc.close();

        int sum = old + adult + student + child;

        if (child > 2) {
            money = child * 500000;
        }

        System.out.printf("<귀댁의 가족 구성>\n" + "총 %d명: 노인:%d 성인:%d 청소년:%d 아동:%d 다자녀 지원금이 %d지급됩니다", sum, old, adult,
                student, child, money);

    }
}
