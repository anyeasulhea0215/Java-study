class Marine{
    String name;
    int hp;

    Marine(String name,int hp){
        this.name=name;
        this.hp=hp;
        System.out.printf("[%s] You wanna\n",this.name);
    } //Marine 생성자 

void state(){
    System.out.printf("[%s] hp:%d\n",name,hp);
}

void levelup(){
    hp+=5;
    System.out.printf("[%s]레벨업을 하여 체력이 +5\n",hp);
}

void attacked(int enemy){
    hp-=enemy;
    System.out.printf("[%s]의 공격을 받아 체력이 %d만큼 감소\n",name,enemy);
 }

}

public class EX04Marinesimul {
    public static void main(String[] args) {
     Marine m1=new Marine("marine1", 100);
     Marine m2=new Marine("marine2", 200);

    m1.state();
    m2.state();

    m1.attacked(30);
    m2.attacked(20);

    m1.state();
    m2.state();

    m1.levelup();
    m2.levelup();

    m1.state();
    m2.levelup();

    }
}
