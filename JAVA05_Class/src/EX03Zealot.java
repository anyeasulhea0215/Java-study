class Zealot{
    int hp;
    int dps;

void state(){
    System.out.printf("상태확인>>hp:%d, dps:%d\n",hp,dps);
}

void levelup(){
    hp+=10;
    dps+=20;
    System.out.println("레벨업을 하여 체력이(+10),공격력(+2)이 증가합니다");
}

void attack(int enemy){
    hp-=enemy;
    System.out.printf("%d의 공격을 받아 hp가  %d만큼 감소\n",enemy,hp);
}


}

public class EX03Zealot {
    public static void main(String[] args) {
        
    
   Zealot zealot=new Zealot();

   zealot.hp=100;
   zealot.dps=20;

   zealot.state();
   zealot.attack(30);
   zealot.state();
   zealot.levelup();
   zealot.state();

    }

}
