package Lang패키지.kr.hossam.helper;

public class UtilHelper{
private static UtilHelper current;

public static UtilHelper getInstance(){
    if(current==null){
        current=new UtilHelper();
    }
    return current;
}
private UtilHelper(){
    super(); //Object 객체 메서드 가져옴
}

public int random(int min,int max){

    int num=(int)((Math.random()*(max-min+1))+min);
    return num;
 }

}