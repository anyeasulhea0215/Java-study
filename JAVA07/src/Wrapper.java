public class Wrapper {
    public static void main(String[] args) {
        String mynum="123";
        int realnum=Integer.parseInt(mynum);
        System.out.println(realnum+1000);

        int mynum2=123;
        String strnum=String.valueOf(mynum2); //기본 데이터 타입 문자열 변환
        System.out.println(strnum+1000);

           

        String msg="Hello World";
        char[]unit =msg.toCharArray();  //문자를 한 글자씩 분해해서 배열로 변환
        /*
         * for(i=0;i<unit.length;i++){
         * Sytem.out.println("unit[i]");
         * }
         */

        for(char u:unit){   //인덱스 없이 배열의 원소를 변수 'u'에 직접 할당
            System.out.println(u);
        }

        String msg2="Hello 123 World";
        char[]unit2=msg2.toCharArray();

        for(char u:unit2){

            //파라미터로 전달된 문자열이 숫자형이면 트루
            if(Character.isDigit(u)){
                System.out.println(u);
            }

            char k=Character.toUpperCase(u);

            char m=Character.toLowerCase(u);
        }
        //문자열비교->
        if(msg.equals(msg2)){

        }
    }
}
