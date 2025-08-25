public class Food extends Product {
    @Override
    public void showinfo(){
        System.out.println("식품입니다. 유통기한을 확인하세요!");
    }

    public void checkExpiration(){
        System.out.println("checkexpiration");
    }
}
