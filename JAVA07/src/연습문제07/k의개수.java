package 연습문제07;

public class k의개수 {
    public static int solution(int i, int j, int k) {
        int answer = 0;
        String kstr = String.valueOf(k);

        for (int n = i; n <= j; n++) {

            String str = String.valueOf(n);
            answer += str.length() - str.replace(kstr, "").length(); // 13131->5-(3의개수)===3개 ->1이 몇번있는지
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 60, 4));
    }

}
