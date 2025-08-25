package Calender;
import java.util.Calendar;

public class EX04_날짜기타값 {
    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();
        
        //요일에 해당 인덱스 일=1~토=7
        int day=cal.get(Calendar.DAY_OF_WEEK);
        System.out.println("요일인덱스="+day);
       
        String[]day_name={"일","월","화","수","목","금","토"};
        System.out.println("요일="+day_name[day-1]);

        int week_count=cal.getActualMaximum(Calendar.WEEK_OF_MONTH);
        System.out.println("이번달은="+week_count+"주로 되어있다");

        int day_count=cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("이번달은"+day_count+"일 까지");

        cal.set(Calendar.DAY_OF_MONTH, 1);
        int first_day=cal.get(Calendar.DAY_OF_WEEK);
        System.out.println("이번달의 시작 요일 인덱스"+first_day);
        System.out.println("이번달의 시작 요일="+day_name[first_day-1]);
    }
}
