public class CalcSingleTon {
    
    //자신의 대한 객체를 은닉한 static멤버변수 current선언->단 하나의 객체 만 존재
    private static CalcSingleTon current;

    //불필요한 객체 생성 없이 static객체를 할당하기위한 static 메서드
    public static CalcSingleTon getInstance(){
        if(current==null){
            current=new CalcSingleTon();
        }
        return current;
    }
    //new키워드로 객체 생성 금지위해 private로 은닉
    private CalcSingleTon(){
       System.out.println("CalcSingleTon에 대한 current객체가 생성됨");
    }

    //일반 메서드
    public int plus(int x,int y){return x+y;}
    public int minus(int x,int y){return x-y;}
    public int times(int x,int y){return x*y;}
    public int div(int x,int y){return x/y;}
}
