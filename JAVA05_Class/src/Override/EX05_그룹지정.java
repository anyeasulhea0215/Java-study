package Override;
public class EX05_그룹지정 {
    public static void main(String[] args) {
        Protess []p=new Protess[5];

        //부모 객체 배열에 자식 객체를 담을수 있음->형변환
        p[0]=new Zilot("zil", 120,20, 234);
        p[1]=new Dragun("dra", 40,340, 450);
        p[2]=new Zilot("zul2", 540, 50, 30);
        p[3]=new Dragun("dra3",450, 30, 20);
        p[4]=new Zilot("zil4",34,67,12);
        System.out.println("-------");

    for(int i=0;i<p.length;i++){
     p[i].move("jug");
     p[i].attack("jug");

     //Protess타입의 p객체배열 원래 형태 검사
     if(p[i] instanceof Zilot){
        Zilot z=(Zilot)p[i];
         z.swardAttack("jug"); 
    }
     else if(p[i] instanceof Dragun){
        Dragun d=(Dragun)p[i];
        d.fireattack("jug");
     }
                              
   }
 }
}
