package 연습문제07;
public class 문자열_뒤집기 {
    

    public static String solution(String my_string){
       
        char[]unit=my_string.toCharArray();

        int n=unit.length;
        for(int i=0;i<n/2;i++){
            int p=n-i-1; //반대쪽 원소
            char temp=unit[i];
            unit[i]=unit[p];
            unit[p]=temp;
        }

        return new String(unit);
    }


    public static void main(String[] args) {
      
  }
}
