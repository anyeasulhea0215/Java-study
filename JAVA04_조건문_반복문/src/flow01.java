import java.util.Scanner;

public class flow01 {
    public static void main(String[] args) {
        
        /*
        Scanner sc=new Scanner(System.in);
        System.out.println("입력");

    int num=sc.nextInt();
  sc.close();


int even=0;
int odd=0;

for(int i=1;i<=num;i++){
    if(i%2==0){
        even+=i;
    }
    else{
        odd+=i;
    }
}

System.out.printf("evensum:%d oddsum:%d\n",even,odd);

------------
for(int i=0;i<3;i++){
    System.out.printf("%d에 대한 반복문 시작\n",i);
    for(int j=0;j<5;j++){
        System.out.printf("i=%d j=%d\n",i,j);
    }
System.out.printf("%d에 대한 반복문 수행 종료",i);
}

int x=2;
int y=3;
for(int i=1;i<100;i++){
    if(i%x==0&&i%y==0){
   System.out.printf("%d는 공배수\n",i);
    }
}

for(int i=0;i<5;i++){
    for(int j=0;j<=i;j++){
        System.out.printf("i=%d ,j=%d\n",i,j);
    }

    if(i+1<5){
        System.out.println("-----");
    }

}

int num=1;

for(int i=0;i<5;i++){
    for(int j=0;j<i;j++){
     System.out.print(" "); //i행의 공백 칸
    }
    for(int k=num;k>0;k--){
        System.out.print("*");
        }
        num=num-2;
        System.out.println(); //i행 종료 후 줄바꿈
*/
  for(int i=0;i<5;i++){
      for(int j=0;j<5-i;j++){
         System.out.print("*");
       }
      System.out.println();
    }
 }
}
