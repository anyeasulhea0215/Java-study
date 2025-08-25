import java.util.Scanner;

public class if_08 {
    public static void main(String[] args) {
        // 숫자와 문자 입력
        Scanner sc1 = new Scanner(System.in);
        System.out.println("숫자 입력:");
        int po = sc1.nextInt();
        sc1.nextLine(); // 버퍼 비우기
        System.out.println("문자 입력:");
        String name = sc1.nextLine();
        System.out.printf("숫자:%d ", po);
        System.out.printf("문자:%s\n", name);
        sc1.close();

        // switch문 예제
        Scanner sc2 = new Scanner(System.in);
        System.out.println("숫자를 입력하세요:");
        int num = sc2.nextInt();
        switch (num) {
            case 1:
                System.out.println("에이 점입니다");
                break;
            case 10:
                System.out.println("비이 점입니다");
                break;
            default:
                System.out.println("fail");
                break;
        }
        sc2.close();

        // if문 예제
        Scanner sc3 = new Scanner(System.in);
        System.out.println("점수를 입력하세요:");
        int score = sc3.nextInt();
        if (score >= 70 && score <= 100) {
            System.out.println("에이 그레이드");
        } else if (score < 70 && score > 60) {
            System.out.println("비 그레이드");
        } else if (score <= 60 && score > 50) {
            System.out.println("씨 그레이드");
        } else {
            System.out.println("낙제");
        }
        sc3.close();

        // while문으로 합 구하기
        Scanner sc4 = new Scanner(System.in);
        System.out.println("x 입력:");
        int x = sc4.nextInt();
        System.out.println("y 입력:");
        int y = sc4.nextInt();
        int i = x;
        int sum = 0;
        while (i <= y) {
            sum += i;
            i++;
        }
        System.out.printf("%d부터 %d까지의 합은 %d입니다.\n", x, y, sum);
        sc4.close();

        // 10의 배수 합
        int sum2 = 0;
        int j = 0;
        while (j < 100) {
            sum2 += j;
            System.out.printf("i:%d  sum:%d\n", j, sum2);
            j += 10;
        }
    }
}
