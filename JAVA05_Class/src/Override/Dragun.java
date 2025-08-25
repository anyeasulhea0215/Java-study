package Override;
public class Dragun extends Protess {
    public Dragun(String name,int hp,int speed,int dps){
        super(name,hp,speed,dps);
    }

    //보모 객체 메서드 재정의
    @Override
    public void attack(String target){
      super.attack(target);
      System.out.println(">>>포탄 발사!!");
    }

    @Override
    public void move(String position){
        super.move(position);
        System.out.println(">>>지정된 위치까지 지상으로 이동!");
    }


    public void fireattack(String target){
        System.out.printf("[드라군의 고유스킬]%s가 %s에게 포탄 발사",this.getName(),target);
    }
    
}
