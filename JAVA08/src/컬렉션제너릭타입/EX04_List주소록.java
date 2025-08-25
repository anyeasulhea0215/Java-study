package 컬렉션제너릭타입;
import java.util.List;
import java.util.ArrayList;

public class EX04_List주소록 {
    public static void main(String[] args) {
     List<Member> list=new ArrayList<Member>();

     list.add(new Member("철수", "010-1223-2345"));
     list.add(new Member("수현", "010-2345-3456"));
     list.add(new Member("석훈", "010-3456-4567"));
     list.add(new Member("철수", "010-4567-5678"));
     list.add(new Member("철수", "010-456-2345"));
 
     //추가된 사용자의 수 만큼 반복
     for(int i=0;i<list.size();i++){

        //추가된 객체의 클래스타입으로 추출결과를 받음
        Member item=list.get(i);
        System.out.println(item.toString());
     }
    }
}
