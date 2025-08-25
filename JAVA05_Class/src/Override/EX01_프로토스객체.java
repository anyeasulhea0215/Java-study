package Override;
public class EX01_프로토스객체 {
    public static void main(String[] args) {

        Protess p1=new Protess("prove1", 100, 20, 10);
        
        p1.move("테란본진");
        p1.attack("테란본진");
        System.out.println(p1.toString());
        System.out.println("-------");

        Zilot z1=new Zilot("zilot1",500,300,10);
        z1.move("taaran");
        z1.attack("tera");
      z1.swardAttack("tera");
      System.out.println(z1.toString());
      System.out.println("-----");

    }
}
