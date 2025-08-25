public class Vulture {
    private String name;
    private int hp;
 
    String getName(){
        return this.name;
    }

    void setName(String name){
        this.name=name;
    }

    int getHp(){
        return this.hp;
    }

    void setHp(int hp){
        if(hp<1){
            hp=1;
        }
        this.hp=hp;
    }
   
    //기본 생성자 
    public Vulture(String name,int hp){
       this.setName(name);
       this.setHp(hp);
       System.out.printf("[%s]bring it on!\n",this.name);
    }

    void state(){
        System.out.printf("[%s] hp:%d\n",this.getName(),this.getHp());
    }

    void levelup(){
        this.setHp(getHp()+5);
        System.out.printf("[%s]레벨업을 하여 체력 +5\n",this.getName());
    }


    void attacked(int enemy){
        this.setHp(getHp()-enemy);
        System.out.printf("[%s]의 공격을 받아 hp가 %d 감소\n",this.getName(),enemy);
    }
}
