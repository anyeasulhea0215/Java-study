public abstract class Transport {
    private String vehicleId;
    private String status;


    public Transport(String vehicleId, String status) {
        this.vehicleId = vehicleId;
        this.status = status;
    }

    public String getVehicleId() {
        return this.vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public void stop(){
        System.out.printf("교통수단 %s가 정지합니다\n",this.getVehicleId());
    }

    public abstract void  start();
    //public void start(){ System.out.println(this.status);}
   
    public abstract void nevigate(String destination);
    

}



class Bus extends Transport{
    public Bus(String vehicleId, String status) {
    super(vehicleId, status);    
    }

    @Override
    public void nevigate(String destination) {
        if(this.getStatus()=="운행중"){
            System.out.printf("버스가 %s로 이동합니다\n",destination);
        }
    }

    @Override
    public void start() {
        //super.start();
        //->부모의 오버라이드전 원래 메서드를 가져옴.->부모의 메서드가 일반 메서드여야함.추상x
       
    System.out.printf("버스%s가 출발합니다\n",this.getVehicleId());
    }
    
}

class Train extends Transport{
    public Train(String vehicleId, String status) {
        super(vehicleId, status);    
        }
    
        @Override
        public void nevigate(String destination) {
            System.out.printf("기차가 %s행 노선으로 진입합니다.\n",destination); 
        }
    
        @Override
        public void start() {
            
            System.out.printf("기차%s가 플랫폼을 떠납니다\n",this.getVehicleId());
        }
         // 고유메서드
        public void announceStations(){
            System.out.println("기차가 다음역을 안내합니다");
        }
}

class Drone extends Transport{
    public Drone(String vehicleId, String status) {
        super(vehicleId, status);    
        }
    
        @Override
        public void nevigate(String destination) {
            System.out.printf("드론이 항공 경로를 따라 %s로 이동합니다\n",destination);
            
        }
    
        @Override
        public void start() {
            System.out.printf("드론%s가 이륙합니다\n",this.getVehicleId());
        }   
        //고유메서드 
        public void captureSurroundings(){
            System.out.println("드론이 주변 상황을 촬영합니다");
        }
}

