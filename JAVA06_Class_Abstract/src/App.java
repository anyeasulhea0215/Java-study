public class App {
    public static void main(String[] args) throws Exception {
        
        Zilot z=new Zilot("zilot1", 150, 130, 100);
        z.move("jugmulti");
        z.attack("jugmul");
        System.out.println("------");

        Dragun d=new Dragun("dragun1", 170, 450, 30);
        d.move("jugmul");
        d.attack("jugmul");
        System.out.println("---------");

        Protoss p1=new Zilot("wilot1", 150, 30, 40);
        Protoss p2=new Dragun("dragu2", 30, 230, 40);

        p1.move("jugmul");
        p1.attack("uj");
        p2.move("fsd");
        p2.attack("frt");
    }
    
}
