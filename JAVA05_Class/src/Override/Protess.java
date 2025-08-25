package Override;
public class Protess {
    private String name;
    private int hp;
    private int speed;
    private int dps;

    public Protess(String name, int hp, int speed, int dps) {
        this.name = name;
        this.hp = hp;
        this.speed = speed;
        this.dps = dps;
        System.out.printf(">>유닛이 생성되었습니다.-->이름:%s, 체력:%d,공격력:%d\n",name,hp,dps);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDps() {
        return this.dps;
    }

    public void setDps(int dps) {
        this.dps = dps;
    }

      
     public void move(String position){

        System.out.printf("%s이가 %s까지 이동합니다\n",this.name,position);
    }//move 메서드

    public void attack(String target){
        System.out.printf("%s가 %s를 공격합니다 >>데미지:%d\n",this.name,target,this.dps);
     }//어택 메서드

    @Override
    public String toString(){
        return"{"+"name='"+getName()+"'"+",hp='"+getHp()+"'"+",speed='"+getSpeed()+"'"+",dps='"+getDps()+"'"+"}";
    } //Object 상속->toString재정의!
}
