class Person{
   private  String name;
   private   String level;

    public Person(String name, String level) {
        this.name = name;
        this.level = level;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return this.level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
   
    public void display(){
        System.out.println();
    }
}

class Employee extends Person{

    public Employee(String name,String level){
        super(name, level);
    }

    @Override
    public void display() {
      System.out.printf("%s%s\n",this.getName(),this.getLevel());
    }
    
}
    
public class prac {
    public static void main(String[] args) {
      
        
    }
}

