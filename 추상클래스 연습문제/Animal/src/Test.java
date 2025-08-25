public class Test {
    public static void main(String[] args) {
        animal []a=new animal[3];
        a[0]=new Lion();
        a[1]=new Elephants();
        a[2]=new Penguin();

        for(int i=0;i<a.length;i++){
            a[i].move();
            a[i].makeSound();
            
            if(a[i] instanceof Penguin){
                Penguin p=(Penguin)a[i];
                p.swim();
            }
        }
    }
}
