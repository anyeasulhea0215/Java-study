package Calender.kr.hossam.helpers;

import java.util.Calendar;

public class EX03_날짜연산 {
    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();
        DatePrinter.PrintDateTime(cal);

        cal.add(Calendar.DAY_OF_MONTH, 100);
        DatePrinter.PrintDateTime(cal);

        cal.add(Calendar.YEAR, -75);
        DatePrinter.PrintDateTime(cal);

        cal.add(Calendar.HOUR, 9);
        DatePrinter.PrintDateTime(cal);

        cal.add(Calendar.MONTH, 8);
        DatePrinter.PrintDateTime(cal);

        
    }
}
