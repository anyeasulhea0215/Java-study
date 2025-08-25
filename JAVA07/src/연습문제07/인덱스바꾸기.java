package 연습문제07;

public class 인덱스바꾸기 {
    public String solution(String my_string, int num1, int num2) {
        char[] chararry = my_string.toCharArray();

        char temp = chararry[num1];
        chararry[num1] = chararry[num2];
        chararry[num2] = temp;

        return new String(chararry);
    }

    public static void main(String[] args) {
        인덱스바꾸기 sol = new 인덱스바꾸기();

        System.out.println(sol.solution("hello", 1, 3));
    }
}
