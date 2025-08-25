package 문자열처리;

public class EX01_String {
    public static void main(String[] args) {
        String msg = "Life is too short. You need Java!";
        System.out.println("문자열:" + msg);

        int length = msg.length();
        System.out.println("문자열의 길이:" + length);

        // 인덱스 위치의 문자열
        char str2nd = msg.charAt(2);
        System.out.println("두번째글자: " + str2nd);

        // 문자열이 처음 위치하는 인덱스
        int p1 = msg.indexOf("f");
        System.out.println("'f'가 처음 나타나는 위치:" + p1);

        System.out.println("z가 처음 나타나는 위치" + msg.indexOf("z"));

        System.out.println("'short'가 처음 나타나는 위치:" + msg.indexOf("short")); // ****/////////// ////////////*/

        int p2 = msg.indexOf("i");
        // p2+1=3 -> 그다음 인덱스부터 i를 다시찾음.
        int p3 = msg.indexOf("i", p2 + 1);
        System.out.println("i가 첫번째로 나타나는 위치:" + p2);
        System.out.println("i사 두번째로 나타나는 위치" + p3);
        // 뒤에서부터 문자의 위치를 찾음
        int p4 = msg.lastIndexOf("a");
        System.out.println("a의 마지막 위치:" + p4);

        if (msg.indexOf("Hello") > -1) {
            System.out.println("Hello가 포함됨");
        } else {
            System.out.println("Hello가 포함되지 않음");
        }

        System.out.println("===================");

        // 문자열을 시작위치와 끝위치로 자름->18전이 끝..
        String substring1 = msg.substring(0, 18);
        System.out.println("문자열 자리긔:" + substring1);
        // 지정된 위치부터 끝까지 자름
        String substring2 = msg.substring(19);
        System.out.println("문자열 자르기:" + substring2);

        String up = msg.toUpperCase(); // 대문자
        System.out.println("모든 문자 대문자 변환:" + up);
        String low = msg.toLowerCase(); // 소문자
        System.out.println("모든 문자 소문자 변환:" + low);

        String src1 = "  Hello World  ";
        String src2 = src1.trim(); // 앞,뒤 공백을 지워줌
        System.out.printf("src1=[%s]\n", src1);
        System.out.printf("src2[%s]\n", src2);

        String txt = "HTML,CSS,Javascript";
        String[] arr = txt.split(",");
        // split->문자열에 포함된 구분자를 기준으로 문자열을 잘라 배열로 반환한다

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // 첫번째 파라미터의 내용을 두번째 파라미터로 변경한 결과를 반환
        String txt2 = txt.replace(",", "$");
        System.out.println(txt2);

        String txt3 = "Hello";
        System.out.println(txt3.equals("Hello"));

        if (txt3.equals("Hello")) {
            System.out.println("txt3는 Hello입니다");
        } else {
            System.out.println("txt3는 Hello가 아닙니다");
        }
    }
}

/*
 * 숫자타입은 숫자로 변환->Integer.parseInt();
 * 문자열 형태는 문자열로 변환 +,-케이스 나눠서 실행..
 */