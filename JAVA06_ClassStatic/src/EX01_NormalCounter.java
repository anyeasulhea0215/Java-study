class Normalcounter{
      int count=0;
     
     //생성자(?)-->기본생성자. class와 이름이 같음: public 클래스명(){}
     public Normalcounter(){
        count++;
     }
     public int getCount(){
        return count;
     }
}


public class EX01_NormalCounter {
    public static void main(String[] args) throws Exception {
        

        Normalcounter c1=new Normalcounter();
        Normalcounter c2=new Normalcounter();

        System.out.printf("c1's counter: %d\n",c1.getCount());
        System.out.printf("c2's counter: %d\n",c2.getCount());
    }
}
