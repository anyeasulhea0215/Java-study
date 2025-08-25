class Dragon{
    int speed;
    int hp;
    int attack;
    int defense;
}

class Calc{
    int sum(int x,int y){
        return x+y;
    }

    int minus(int x,int y){
        return x-y;
    }

    int all(int x,int y){
        return this.sum(x, y)*this.minus(x, y);
    }
}

class Probe{
    void move(int x,int y){
        System.out.printf("좌표 (%d %d)로 이동 합니다.\n",x,y);
    }
int mineral(){
    System.out.println("광물을 채집합니다.(+10)");
    return 10;
}
int gas(){
    System.out.println("가스를 채집합니다 +10\n");
    return 5;
 }
}

public class DragonTest {
    public static void main(String[] args)  {
/*        Dragon dg1=new Dragon();

       dg1.speed=10;
       dg1.hp=30;
       dg1.attack=20;
       dg1.defense=5;
       String tpl="speed:%d,hp:%d,attack:%d, defense:%d\n";

       System.out.printf(tpl,dg1.speed,dg1.hp,dg1.attack,dg1.defense);

       dg1.speed+=1;
       dg1.hp+=10;
       dg1.attack+=2;
       dg1.defense+=1;

       dg1.hp-=10;
       System.out.printf(tpl,dg1.speed,dg1.hp,dg1.attack,dg1.defense);

       Dragon dg2=new Dragon();

       dg2.speed=12;
       dg2.hp=120;
       dg2.attack=22;
       dg2.defense=7;

       System.out.printf(tpl,dg2.speed,dg2.hp,dg2.attack,dg2.defense);

--------------------
Calc cal1=new Calc();
int a=cal1.sum(3,4);

Calc cal2=new Calc();
int b=cal2.sum(200,300);
*/

Probe pb1=new Probe();
pb1.move(3, 10);

int min=0;
min+=pb1.mineral();
min+=pb1.mineral();



int gas=0;
gas+=pb1.gas();
gas+=pb1.gas();

System.out.printf("채집된 광물:%d,채집된 가스:%d,\n",min,gas);
}
}
