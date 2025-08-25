package 연습문제07;

public class str_7의개수출력 {

    public static int solution(int[] array) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {

            String str = String.valueOf(array[i]);
            for (int j = 0; j < str.length(); j++) { // 77,171,7877->j가 인덱스
                if (str.charAt(j) == '7') {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        System.out.println(solution(new int[] { 7, 77, 7, 23, 4 }));
    }
}
