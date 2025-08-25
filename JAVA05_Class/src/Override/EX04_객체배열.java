package Override;
public class EX04_객체배열 {
    public static void main(String[] args) {
        Zilot[]z=new Zilot[3];

        z[0]=new Zilot("zil1", 150,10, 120);
        z[1]=new Zilot("zilo2", 160, 90, 240);
        z[2]=new Zilot("zilot3", 140, 340, 450);

        for(int i=0;i<z.length;i++){
            z[i].move("tera");
            z[i].attack("tera");
            z[i].swardAttack("tera");

            if(i+1<z.length){
                System.out.println("--------");
            }
        }
        
    }
}
