public class Calc {
    private static Calc current;

    public static Calc getInstance(){
        if(current==null){
            current=new Calc();
        }
        return current;
    }

    private Calc(){
        super();
    }
    //런타임 에러 가능성이 있는 메서드 안에 직접 try-catch사용 
    public int divided(int x,int y){
        int z=0;
        try{
            z=x/y;
        }
        catch(Exception e){
               System.out.println("[divided에러] 0으로 나눌수 없습니다");
        }
        return z;
    }
    //theows처리->에러 발생시 메서드를 호출한 지점으로 예외처리 책임 넘김:try,catch
    public int dividedEx(int x,int y)throws Exception{
     return x/y;
    }
}
