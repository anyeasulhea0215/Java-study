public class TransportTest {
    public static void main(String[] args) throws Exception {
       Transport []t=new Transport[3];
       t[0]=new Bus("BUS-001", "운행중");
       t[1]=new Train("TR-202", "");
       t[2]=new Drone("DRN-A7", "");

       for(int i=0;i<t.length;i++){
        t[i].start();
        t[i].nevigate("서울역");
        t[i].stop();

        if(t[i] instanceof Train){
            Train r=(Train)t[i];
            r.announceStations();
            //((Train)t[i]).announceStations(); 형변환축약
        }
        else if(t[i] instanceof Drone){
            Drone d=(Drone)t[i];
            d.captureSurroundings();
        }
        System.out.println();
       }
    }
}
