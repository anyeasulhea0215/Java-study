package 연습문제07;

public class 문자열밀기 {
  public static int solution(String A, String B) {

    String str = B + B;

    int index = str.indexOf(A);

    if (index != -1) {
      return index;
    } else {
      return index;
    }
  }

  public static void main(String[] args) {
    System.out.println(solution("hello", "ohell")); // hellohello
  }
}
