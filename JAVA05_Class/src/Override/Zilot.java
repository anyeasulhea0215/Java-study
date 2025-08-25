package Override;
public class Zilot extends Protess {

    //Protess를 상속받는 Zilot생성자->super명령어
    public Zilot(String name,int hp,int speed,int dps){
      super(name,hp,speed,dps);
    }

    @Override
    public void move(String target){
        System.out.printf("[Zilot]%s이 %s까지 빠른 속도로 이동합니다\n",this.getName(),target);
    }

    @Override
    public void attack(String target){
        System.out.printf("[Zilot]%s이 %s를 칼로 찌름 >>데미지:%d\n",this.getName(),target,this.getDps());
    }

    //Zilot 고유 메서드
    public void swardAttack(String target){
        System.out.printf("[질럿 고유의 스킬]%s가 %s를 칼로공격.\n",this.getName(),target);
    }

}
