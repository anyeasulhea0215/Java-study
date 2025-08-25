class Staticcounter{
    //클래스와 별개로 공유자원
    static int count=0;
   
    public Staticcounter(){
        count++;
     }
     public int getCount(){
        return count;
     }
}




public class EX02_StaticCounter {
    public static void main(String[] args) {
        
        Staticcounter c1=new Staticcounter(); //count++->1
        Staticcounter c2=new Staticcounter(); //count++->2

        System.out.printf("c1's counter: %d\n",c1.getCount());
        System.out.printf("c2's counter: %d\n",c2.getCount());
    }
}
