public class SmartDevice {
    private String name;
    private int isOn;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIsOn() {
        return this.isOn;
    }

    public void setIsOn(int isOn) {
        this.isOn = isOn;
    }
    //생성자
    public SmartDevice(String name) {
        this.name = name;
        
    }

    public void turnOn(){
        this.isOn=1;
        System.out.println(getName()+"이 켜졌습니다");
    }

    
    public void turnOff(){
        this.isOn=0;
        System.out.println(getName()+"이 꺼졌습니다");
    }

    public void showStatus(){
        if(this.isOn==1){
            System.out.println(this.name+"상태 :ON");
        }
        else{
            System.out.println(this.name+"상태 :OFF");
        }
        
    }
}

class SmartLight extends SmartDevice{
public SmartLight(String name) {
        super(name);
       }

public void changeColor(String color){
    if(this.getIsOn()==1){
        System.out.println(this.getName()+"이 "+color+"으로 바뀝니다.\n");
    } 
    else{
        System.out.println(this.getName()+"이 꺼져있어 색상을 변경할수 없습니다.\n");
    }
 }
}



class SmartSpeaker extends SmartDevice{

    public SmartSpeaker(String name) {
        super(name);
       }

       public void playMusic(String song){
        if(this.getIsOn()==1){
            System.out.println(this.getName()+"에서 "+song+"음악을 재생합니다\n");
        } 
        else{
            System.out.println(this.getName()+"이 꺼져있어 색상을 변경할수 없습니다.\n");
        }
     }
    

}
class SmartThermostat extends SmartDevice{

    public SmartThermostat(String name) {
        super(name);
       
    }

    public void setTemperature(String temperature){
        if(this.getIsOn()==1){
            System.out.println(this.getName()+"의 온도를 "+temperature+"도로 설정합니다.\n");
        } 
        else{
            System.out.println(this.getName()+"이 꺼져있어 색상을 변경할수 없습니다.\n");
        }
     }

}
