package Lang패키지;
import Lang패키지.kr.hossam.helper.UtilHelper;

public class EX03_random {
    public static void main(String[] args) {
        
        UtilHelper utilHelper=UtilHelper.getInstance();

        int random=utilHelper.random(0, 9);
        System.out.printf("randomnumber=%d\n",random);

        String authNum="";

        for(int i=0;i<6;i++){
            authNum+=utilHelper.random(0, 9);
        }
        System.out.printf("인증번호: %s\n", authNum);
    }
}
