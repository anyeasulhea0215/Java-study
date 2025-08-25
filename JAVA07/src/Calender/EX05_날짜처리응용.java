package Calender;
import java.util.Calendar;

public class EX05_날짜처리응용 {
    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();

        int weekCount=cal.getActualMaximum(Calendar.WEEK_OF_MONTH); //이번달은 몇주?

        int dayCount=cal.getActualMaximum(Calendar.DAY_OF_MONTH); //이번달은 몇일?

        cal.set(Calendar.DAY_OF_MONTH, 1); //이번달의 1일은 몇요일?
        int firstday=cal.get(Calendar.DAY_OF_WEEK);

        int[][]data=new int[weekCount][7]; //weekCount->몇주?몇행, 7일->7열

        int count=1; //배열의 원소로 설정할 숫자

        for(int i=0;i<data.length;i++){ //행의수만큼 반복->주 수만큼 반복
            for(int j=0;j<data[i].length;j++){ //각 행의 열수만큼 반복 -->요일 만큼 반복

                //i=0->1주차 , j가 firstDay보다 작음:1주차의 시작요일보다 인덱스가 작음.
                if(!(i==0 &&j+1<firstday)&&count<=dayCount){  //dayCount=마지막날..
                    data[i][j]=count;
                    count++;
                }
            }
        }

        for(int i=0;i<data.length;i++){
            for(int j=0;j<data[i].length;j++){
                if(data[i][j]==0){
                    System.out.print("\t");
                }
                else{
                    System.out.printf("%d\t", data[i][j]);
                }
            }
            System.out.println();
        }

    }
}
