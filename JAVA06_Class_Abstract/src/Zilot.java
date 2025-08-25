public  class Zilot  extends Protoss{

    public Zilot(String name, int hp, int speed, int dps) {
        super(name, hp, speed, dps);
    
    }

    @Override
    public void attack(String target) {
        System.out.printf("[Zilot]%s가 %s를 칼로 지름>> 데미지:%d\n",
        this.getName(),target,this.getDps());
    }
    //무조건 부모 클래스의 추상 메서드를 재정의해야함.

    @Override
    public void move(String position) {
     System.out.printf("[Zilot]%s %s까지 빠른속도로 이동합니다\n",
      this.getName(),position);
    }
   
    
}
