package 연습문제07;

public class 문자열계산하기 {
    public static int solution(String my_string) {
       
        String[] myList=my_string.split(" "); //공백제거하고 문자열 배열로 변환
       int answer=Integer.parseInt(myList[0]);
        
        for(int i=1;i<myList.length-1;i+=2){
            String operator=myList[i]; //1,3,5..번째 문자열들은 연산자 operator에 저장
            int number=Integer.parseInt(myList[i+1]);  //숫자들은 number에 저장
            
            if(operator.equals("+")){
                answer+=number;
            }
            else{
                answer-=number;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("3 + 5"));
    }
}
