public class animal {
    public void move(){
    
    }
    public void makeSound(){
        
    }
}
 
  
 class Elephants extends animal{
    
    @Override
    public void move(){
     System.out.println("코끼리가 천천히 걷습니다.");
    }

    @Override
    public void makeSound(){
     System.out.println("코끼리가 뿌웁~하고 울어요");
    }
}

class Lion extends animal{
    @Override
    public void move(){
        System.out.println("사자가 네발로 달려갑니다");
    }

    @Override
    public void makeSound(){
        System.out.println("사자가 포효합니다.");
    }
}

class Penguin extends animal{
    @Override
    public void move(){
        System.out.println("펭귄이 미끄러지듯 이동합니다");
    }

    @Override
    public void makeSound(){
        System.out.println("펭귄이 삐약삐약 울어요");
    }
    public void swim(){
        System.out.println("펭귄이 수영해요");
    }
}



