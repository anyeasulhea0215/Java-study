public class FoodOrder {
    public static void main(String[] args) {
        
        MenuItem[] m=new MenuItem[3];
         m[0]=new Burger("치즈버거", 10000); //MenuItem을 상속받은 Burger객체 생성! ->Override된 Tostring,addOption함수는 새로 쓰여진 Burger메서드를 따른다!
        m[1]=new Pizza("페페로니피자", 5000);
        m[2]=new Salad("그린 샐러드", 4000);


           int sum=0;
        for(int i=0;i<m.length;i++){
            System.out.printf("%s\n",m[i].toString());
           sum+=m[i].getPrice();
        }
       
       System.out.printf("총가격:%d\n",sum);
       System.out.println("옵션적용:");

        for(int i=0;i<m.length;i++){
             System.out.printf("%s-> %s\n",m[i].getName(),m[i].addOption());
        }
   
 }
}
