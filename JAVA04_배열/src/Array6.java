public class Array6 {
public static void main(String[] args) {
    int[]price={38000,20000,17900,17900};
int[]qty={6,4,3,5};
int total=0;
int freecount=0; //30000원 이상 무료배송항목
int max=price[0]*qty[0];  //최대값

for(int i=0;i<price.length;i++){
    
    total=total+price[i]*qty[i];
  
    int each=price[i]*qty[i];
   
    if(max<each){
    max=each;
   }

   if(each>=80000){
    freecount++;
   }
}
System.out.println("전체금액"+total+"원");
System.out.printf("가장비쌈:%d\n",max);
System.out.printf("무료배송:%d",freecount);
}    
}
