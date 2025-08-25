package 연습문제07;

public class 대문자소문자 {
    public static String solution(String my_string) {
        String answer = "";
        for(int i=0;i<my_string.length();i++){
            char c=my_string.charAt(i);
            if(Character.isLowerCase(c)){
                answer+=Character.toUpperCase(c);
            }
            else{
                answer+=Character.toLowerCase(c);
            }
        }

        /*
         * for (int i = 0; i < my_string.length(); i++) {
            int num = (int)my_string.charAt(i);

            if (num >= 65 && num <= 90) answer += (char)(num + 32) + "";
            else answer += (char)(num - 32) + "";
        }
         */
        
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("aDfRdeS"));
    }

}
