package 연습문제07;

public class 특정문자제거하기 {

    public static String solution(String my_string, String letter) {
        String answer = "";

        char c = letter.charAt(0);

        for (char i : my_string.toCharArray()) {
            if (i != c) {
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("abcdef", "f"));
    }
}
