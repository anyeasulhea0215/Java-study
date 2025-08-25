package 컬렉션제너릭타입;
import java.util.Map;  //자료를 key-value 쌍으로 보관할수 있는 객체
import java.util.HashMap;

public class EX01_Map {
   public static void main(String[] args) {
    /*
    Map객체 생성->Key,Value로 사용할 데이터 타입을 명시

    ..->사용할 데이터 타입을 선언시 정하는 것으 제네릭이라고 함.
    기본 자료형을 사용할 경우 WrapperClass로 선언한다.
    */    

    Map<String,Integer> map=new HashMap<String,Integer>();
    /*
     * Map:인터페이스  HashMap:Map을 상속받는 클래스->Map의 공통기능 사용가능
     */

    map.put("나이",21);
    map.put("키",175);
    map.put("몸무게",80);

    System.out.printf("저장된 데이터의수'%d\n",map.size()); //저장된 데이터 수


    System.out.printf("age:%d\n",map.get("나이"));
    System.out.printf("height:%d\n",map.get("키"));
    System.out.printf("weight:%d\n",map.get("몸무게"));

   }    
}
