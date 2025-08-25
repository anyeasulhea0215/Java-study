public class MenuItem {
    private String name;
    private int price;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
  

    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString(){
       return" 이름:메뉴 설명";
    }

    public String addOption(){
        return "옵션추가";
     }

}
//Burger
class Burger extends MenuItem {
    public Burger(String name,int price){
        super(name,price);
    }

    @Override
    public String toString(){
        return this.getName()+"패티와 빵이 조화를 이루는 메뉴";
    }

    @Override
    public String addOption(){
        //return getname()+"->치즈추가";
        return "치즈추가";
    }

}
//Pizza
class Pizza extends MenuItem{
   
    public Pizza(String name, int price) {
            super(name, price);
          }
    

        @Override
    public String toString(){
       return this.getName()+":치즈듬뿍";
        // return" 치즈 듬뿍, 모두의 인기 메뉴";
    }

    @Override
    public String addOption(){
        // return getName()+"->엣지변경 치즈크러스트";
        return "엣지변경:치즈 크러스트";
    }
    
}

//Salad
class Salad extends MenuItem{
    //부모 객체의 생성자를 상속받음..
    public Salad(String name,int price){
        super(name, price);
    }  
    //부모 객체 메서드 재정의->@Override
    @Override
    public String toString(){
        return this.getName()+"신선한 채소로 만든 건강식";
    }

    @Override
    public String addOption(){
        //return getName()+"->발사믹";
      return "발사믹";    
    
    }
    
}
