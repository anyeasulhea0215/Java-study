package Override;
public class EX03_객체형변환 {
    public static void main(String[] args) {
        //부모 클래스로 p0 객체 생성
        Protess p0=new Protess("prove1", 50, 30, 2);
         //자식 객체로 선언 후, 부모 객체에 참조
        Zilot z=new Zilot("질럿1호",300,150,120);
        Protess p1=z;
        //선언은 부모 객체->자식 객체 할당
        Protess p2=new Dragun("드라군 1호", 280, 120, 170);

        //p1.swardAttack("jug");->error

        p0.move("저그본진");
        p0.attack("jug");
        System.out.println("----");

        p1.move("jugbon");
        p1.attack("jug");
        System.out.println("----");
     
        p2.move("저그본진");
        p2.attack("jug");
        System.out.println("-----");

        Zilot rz=(Zilot)p1; //부모객체 p1을 zilot으로 형변환
        Dragun rd=(Dragun)p2;

        rz.swardAttack("jug");
        rd.fireattack("jug");


    }
    
}
