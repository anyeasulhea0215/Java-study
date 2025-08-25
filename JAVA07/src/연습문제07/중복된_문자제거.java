package 연습문제07;

public class 중복된_문자제거 {
    public static String solution(String my_string) {
        String answer = "";

        for (char c : my_string.toCharArray()) {
            if (answer.indexOf(c) == -1) {
                answer += c;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("people"));
    }
}
