package 연습문제07;

public class 숨어있는_숫자덧셈 {

  public static int solution(String my_string) {
    int answer = 0;
    for (char m : my_string.toCharArray()) {
      /*
       * if(Character.isDigit(m)){
       * answer+=Character.getNumericValue(m);
       * }
       */

      // ================================ ->아스키코드
      int code = (int) m;
      if (code >= 48 && code <= 57) {
        answer += (code - 48);
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    System.out.println(solution("12a7d5f4"));
  }
}
