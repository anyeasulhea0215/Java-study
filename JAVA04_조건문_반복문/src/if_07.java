public class if_07 {
    public static void main(String[] args) {

        int time = 1;
        int count = 0;

        while (true) {
            count++;
            time *= 2;
            System.out.println(time);
            if (time > 500) {
                break;
            }
        }

        int x = 0;

        while (x < 10) {
            x++;
            if (x % 2 == 0) {
                continue;
            }
            System.out.println(x);
        }

        int y = 0;
        for (int i = 1; i < 10; i += 2) {

            y += i;
            System.out.println(y);
        }

    }
}
