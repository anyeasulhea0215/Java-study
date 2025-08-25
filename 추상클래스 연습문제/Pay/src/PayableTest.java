public class PayableTest {
    public static void main(String[] args) throws Exception {
       Payable[]p=new Payable[3];
       p[0]=new CreditCard();
       p[1]=new Cash();
       p[2]=new MobilePay();

       for(int i=0;i<p.length;i++){
        p[i].pay(10000);
        if(p[i] instanceof MobilePay){
            MobilePay m=(MobilePay)p[i];
            //((MobilePay)p[i]).useBiometrics;
            m.useBiometrics();
        }
       }
    }
}
