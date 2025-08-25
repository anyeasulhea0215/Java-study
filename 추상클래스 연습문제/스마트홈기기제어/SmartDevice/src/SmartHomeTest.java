public class SmartHomeTest {
    public static void main(String[] args) {
        SmartDevice[]device =new SmartDevice[3];
        device[0]=new SmartLight("스마트 전등");
        device[1]=new SmartSpeaker("스마트 스피커");
        device[2]=new SmartThermostat("스마트 온도조절기");

        for(int i=0;i<device.length;i++){
            device[i].turnOn();
        }

        for(int i=0;i<device.length;i++){
            device[i].showStatus();
        }
        System.out.println();
    
        SmartLight light=(SmartLight)device[0];
        light.changeColor("파란색");

     SmartSpeaker speaker=(SmartSpeaker)device[1];
     speaker.playMusic("Jazz");

     SmartThermostat thermostate=(SmartThermostat)device[2];
     thermostate.setTemperature("24");
    
    }
    
}
