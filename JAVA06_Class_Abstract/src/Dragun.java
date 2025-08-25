public class Dragun extends Protoss{

    //Protoss를 상속

    public Dragun(String name, int hp, int speed, int dps) {
        super(name, hp, speed, dps); //부모상속 생성자-->super
       }

    @Override   //부모 클래스의 추상 메서드는 반드시 재정의해야함.
    public void attack(String target) {
       System.out.printf("[Dragun]%s가 %s에 포탄을 발사합니다>> 데미지:%d\n",
        this.getName(),target,this.getDps());
    }

    @Override
    public void move(String position) {
        System.out.printf("[Dragun]%s이 %s까지 빠른속도로 이동합니다\n",
      this.getName(),position);
    }
    
}
