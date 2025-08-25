public class if_04 {

    public static void main(String[] args) {
        int n = 3;
        int i = 1;

        while (i <= n) {
            for (int j = 0; j < i; j++) {
                System.out.printf("*");
            }
            System.out.println();
            i++;
        }

        i = n - 1;
        while (i > 0) {
            for (int k = 0; k <= i; k++) {
                System.out.printf("*");
            }
            System.out.println();
            i--;
        }

        for (int k = 0; k < 5; k++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%d", k + j + 1);
            }
            System.out.println();
        }

    }

}
