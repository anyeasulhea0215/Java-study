public interface Payable {
    public void pay(int amount);
}

class CreditCard implements Payable{

    @Override
    public void pay(int amount) {
        System.out.printf("신용카드로 %d원 결재합니다\n",amount);
    }

}

class Cash implements Payable{

    @Override
    public void pay(int amount) {
        System.out.printf("현금으로 %d원 결재합니다\n",amount);
    }

}

class MobilePay implements Payable{

    @Override
    public void pay(int amount) {
        System.out.printf("모바일 결재로 %d원 결재합니다\n",amount);
    }

    public void useBiometrics(){
        System.out.println("생체인증으로 모바일 결재를 시작합니다");
    }
    
}
