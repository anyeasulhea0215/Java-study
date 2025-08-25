package 컬렉션제너릭타입;
import java.util.List;
import java.util.ArrayList;

public class EX03_List {
    public static void main(String[] args) {
        /*
         * 객체 생성시 제네릭의 사용
         * 클래스 오른쪽에 <자료형>의 형식으로 표현
         * 이때 자료형에는 클래스타입만 가능
         * 기본 데이터형을 사용하고자 하는경우 해당 데이터의 WrapperClass를 사용.
         * 
         * List->무제한 데이터의저장
         * 메서드:size,get,add,get,remove,clear
         * 
         */
        List<Integer> numberlist=new ArrayList<Integer>();  //List형의 numberlist 객체 생성
        
        numberlist.add(10); //index:0
        numberlist.add(20); //index:1
        numberlist.add(30);
        numberlist.add(40);
        numberlist.add(50);
        numberlist.add(60);
        numberlist.add(70);
        numberlist.add(80);
        numberlist.add(90);

        int count=numberlist.size(); //추가된 데이터 수량
        System.out.println("data size:"+count); //->9

        int value=numberlist.get(4);  //인덱스 번호가 4인 데이터 추출
        System.out.println("4번째요소:"+value);

        numberlist.remove(4); //4번 데이터 삭제 ->뒤의 데이터들이 빈자리 메꾸려고 앞으로 이동.

        count=numberlist.size();
        System.out.println("data size:"+count); //하나 삭제후 전체 크기 조회:8

        value=numberlist.get(4);
        System.out.println("4번째요소:"+value);

        numberlist.add(4,123); //4번 인덱스에 123을 추가.
        value=numberlist.get(4);
        System.out.println("4번째요소:"+value);

        count=numberlist.size();
        System.out.println("데이터 크기:"+count);

        for(int i=0;i<numberlist.size();i++){
            Integer number=numberlist.get(i);
            System.out.printf("%d번째 데이터>>%d\n",i,number);
        }

        numberlist.clear(); //전체 삭제
        count=numberlist.size();
        System.out.println("데이터크기"+count);
    }
}
