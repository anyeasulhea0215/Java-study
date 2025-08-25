interface Cleanable {

    public void startCleaning(); //굳이 public안넣어도 됨
    public void stopCleaning();
    
} 

class VacuumRobot implements Cleanable{

    @Override
    public void startCleaning() {
       System.out.println("진공 청소를 시작합니다"); 
    }

    @Override
    public void stopCleaning() {
        System.out.println("진공 청소를 종료합니다");
    }
    
}

class MopRobot implements Cleanable{

    @Override
    public void startCleaning() {
        System.out.println("물걸레 청소를 시작합니다");
    }

    @Override
    public void stopCleaning() {
        System.out.println("물걸레 청소를 종료합니다");
    }
   
}


public class App {
    public static void main(String[] args) throws Exception {
     Cleanable []c=new Cleanable[2];
     c[0]=new VacuumRobot();
     c[1]=new MopRobot();

     for(int i=0;i<c.length;i++){
        c[i].startCleaning();
        c[i].stopCleaning();
     }
    }
}
