public class Ex02_고전적예외처리 {
    public static void main(String[] args) {
        int[]k={10,20,30};
         
        for(int i=0;i<5;i++){
            //반복문 안에서 i가 배열의 길이를 초과하지 않을때만 출력,,
            if(i<3){
                System.out.println(k[i]);
            }
        }
        System.out.println("fin :)");
    }
}
