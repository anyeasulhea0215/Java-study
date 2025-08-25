package 컬렉션제너릭타입;
import java.util.Map;
import java.util.HashMap;
 


public class EX02_map {
    public static void main(String[] args) {
        
       Map<String, Member> map=new HashMap<String,Member>();  //<String,Member>자료타입을 갖는 Map객체 생성->HashMap에 할당

       Map<String,Member> map2=new HashMap<String,Member>();  //ex
       map2.put("서", new Member("23", "45"));
       Member out=map2.get("서");

        Member m1=new Member("010-1234-2345", "member1@naver.com");
        map.put("철수", m1);              //객체 생성후 map에 추가

        map.put("수현",new Member("010-1234-2345", "member1@naver.com"));
        map.put("석훈",new Member("010-3456-2345", "member1@naver.com"));
        map.put("민영",new Member("010-5678-2345", "member1@naver.com"));
        map.put("호영",new Member("010-2345-2345", "member1@naver.com"));

        Member output=map.get("호영");
        System.out.println(output.toString());

    }
}

