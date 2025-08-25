public class App {
    public static void main(String[] args)  {
        Robot[]r=new Robot[3];
        //로봇 클래스로의 형변환은 로봇 메서드외의 다른 메서드는 잠금형태가됨.
        r[0]=new DroneBot("드론-01", 80);
        r[1]=new RescueBot("구조-09", 65);
        r[2]=new HybridBot("하이브리드-X", 95);

        for(int i=0;i<r.length;i++){
            r[i].showStatus();
            r[i].operate();
            if(r[i] instanceof DroneBot){
                DroneBot d=(DroneBot)r[i];
                d.fly();
                d.search();
            }
            else if(r[i] instanceof RescueBot){
                RescueBot cue=(RescueBot)r[i];
                cue.rescue();
            }
            else{
                HybridBot h=(HybridBot)r[i];
                h.fly();
                h.search();
                h.rescue(); 
            }
            System.out.println();

          /* 22.
            if(r[i] instanceof Flyable){
                ((Flyable)r[i]).fly();
            }
            if(r[i] instanceof Searchable){
                ((Searchable)r[i]).search();
            }
            if(r[i] instanceof Rescuable){
                ((Rescuable)r[i]).rescue();
            } 
            */
            
        }
    }
}
