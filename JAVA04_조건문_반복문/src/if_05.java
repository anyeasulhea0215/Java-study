public class if_05 {
    public static void main(String[] args) {

        int i = 0;
        int sum = 0; // i%3==0&&i%4==0
        for (i = 1; i < 201; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                if (sum > 1000) {
                    break;
                }
            }

        }

        System.out.printf("빠져나온수:%d \n", i);
        System.out.printf("합은: %d", sum);

        for (int k = 2; k < 10; k++) {
            for (int j = 1; j < 10; j++) {

                System.out.printf("%d x %d=%d\n", k, j, k * j);
            }

        }
    }
}
