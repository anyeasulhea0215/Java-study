import com.megastudy.javasample.functions.IMove;
import com.megastudy.javasample.functions.impl.Monster;

class Mymonster extends Monster{

    public Mymonster(String name, int hp, int speed, int dps) {
        super(name, hp, speed, dps);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void attack() {
        System.out.println("mons");
    }

}

class boss extends Monster implements IMove{
    public boss(String name, int hp, int speed, int dps) {
        super(name, hp, speed, dps);
        //TODO Auto-generated constructor stub
    }
}

public class App {
    public static void main(String[] args) throws Exception {
       Monster m=new Mymonster("몬스터", 0, 0, 0);
       m.attack();

    }
}


