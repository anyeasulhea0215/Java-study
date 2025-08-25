class Staticcounter2{
    static int count=0; //공유변수
    boolean created=false;
 
    //생성자
    public Staticcounter2(){
        count++;
        created=true;
    }
    //static 변수를 반환함. 객체가 생성되야 실행됨
    public int getNormal(){
        created=true;
        return count;
    }
    //샛체가 생성안되도 실행 가능->공유자원
    public static int getStatic(){
        return count;
    }
}



public class EX03_StaticMethod {
    public static void main(String[] args) {
        System.out.printf("전체 객채의 수:%d\n", Staticcounter2.count);
        System.out.println("------");

        Staticcounter2 c1=new Staticcounter2(); //count++->1
        Staticcounter2 c2=new Staticcounter2(); //count++->2

        System.out.printf("c1의 getNormal() 리턴값:%d\n",c1.getNormal());
        System.out.printf("c2의 getNormal() 리턴값:%d\n",c2.getNormal());
        System.out.println("--------");

        System.out.printf("c1의 getStatic() 리턴값:%d\n",Staticcounter2.getStatic());
        System.out.printf("c2의 getStatic() 리턴값:%d\n",c1.getStatic());
        System.out.println("-------");

        System.out.printf("전체 객체의 수:%d \n",Staticcounter2.count);
    }
}
