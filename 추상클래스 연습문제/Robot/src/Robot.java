public abstract class Robot {
    private String name;
    private int batteryLevel;

    public Robot(String name, int batteryLevel) {
        this.name = name;
        this.batteryLevel = batteryLevel;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBatteryLevel() {
        return this.batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", batteryLevel='" + getBatteryLevel() + "'" +
            "}";
    }

    public void showStatus(){
        System.out.printf("로봇명:%s, 배터리: %d \n",this.getName(),this.getBatteryLevel());
    }

    public abstract void operate();
}

interface Flyable {
    public void fly();
   } 
   

   interface Rescuable {
    public void rescue();    
   } 

   
   interface Searchable {
    public void search();
}


class DroneBot extends Robot implements Flyable,Searchable{

    public DroneBot(String name,int batteryLevel){
        super(name, batteryLevel);
    }
    
    @Override
    public void operate() {
       System.out.println("드론봇이 공중에서 임무를 시작합니다");
    }

    @Override
    public void fly() {
        System.out.println("드론이 비행합니다");
    }

    @Override
    public void search() {
        System.out.println("드론이 수색작업을 시작합니다");
    }
    
}

class RescueBot extends Robot implements Rescuable{

    public RescueBot(String name,int batteryLevel){
        super(name, batteryLevel);
    }
    
    @Override
    public void operate() {
       System.out.println("구조 임무를를 수행합니다");
    }

    @Override
    public void rescue() {
        System.out.println("구조봇이 현장에 투입됩니다");
    }

}

class HybridBot extends Robot implements Rescuable,Searchable,Flyable{

    public HybridBot(String name,int batteryLevel){
        super(name, batteryLevel);
    }
    
    @Override
    public void operate() {
       System.out.println("하이브리드 로봇이 다기능 모드로 작동합니다");
    }

    @Override
    public void rescue() {
        System.out.println("구조 임무를 수행합니다");
    }
 
    @Override
    public void fly() {
        System.out.println("드론이 비행합니다");
    }

    @Override
    public void search() {
        System.out.println("드론이 수색작업을 시작합니다");
    }
    
}