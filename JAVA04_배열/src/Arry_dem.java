import java.util.Scanner;

//2차원 배열
public class Arry_dem {
    public static void main(String[] args) {
      
       
       
        /*
         Scanner sc=new Scanner(System.in);
        while(true){
         System.out.println("정수:\n");
         int num=sc.nextInt();
         int count=0;
          
        if(num>=3 && num%2==15){
          int [] arr=new int[num];  // 홀수 n개 배열 arr저장
        
          for(int i=0;i<arr.length;i++){ 
            if(i<=arr.length/2){  //arr 배열 중간칸까지 채워넣음.
                arr[i]=++count;
            }
            else{
                arr[i]=--count;
            }
          }

          for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ "");
          }
          break;
          
        }
        else{
            System.out.println("다시입력하세여\n");
        }
    } sc.close();
        ---------------*/

int [][]arr1;
arr1=new int[2][];

int []hello={10,20,30};
int []world={40,50,60};
arr1[0]=hello;
arr1[1]=world;

int [][]arr2;

arr2=new int[2][3];
arr2[0]=hello;
arr2[1]=world;

System.out.println(arr2[0][0]);
System.out.println(arr2[0][1]);
System.out.println(arr2[0][2]);
System.out.println(arr2[1][0]);
System.out.println(arr2[1][1]);
System.out.println(arr2[1][2]);
 System.out.println("------------");


int [][]arr3={{1,2,3},{10,20,30}};
for(int i=0;i<2;i++){
  for(int j=0;j<3;j++){
    System.out.println(arr3[i][j]);
  }
}


int []a={10,20,30};
int []b={100,200};

int [][]foo={a,b};
for(int i=0;i<foo.length;i++){
  for(int j=0;j<foo[i].length;j++){
    System.out.println(foo[i][j]);
  }
}

System.out.println("-------------");
int [][]bar=new int[][]{{1,2,3,4},{10,20}};

System.out.println(bar[0][0]);
System.out.println(bar[0][1]);
System.out.println(bar[0][2]);
System.out.println(bar[0][3]);
System.out.println(bar[1][0]);
System.out.println(bar[1][1]);


String []names={"철수","영희","민혁"};

int [][]grade={{92,81,76},
{ 72,95,84},
{80,86,98}};

int sum=0;
for(int i=0;i<grade.length;i++){
  int persum=0;
  for(int j=0;j<grade[i].length;j++){
    sum+=grade[i][j];
    persum+=grade[i][j];
  }
  int persumavg=persum/grade[i].length;

  System.out.printf("%d번째 행의 대한 %s의 합계: %d, 평균:%d\n",i,names[i],persum,persumavg);
}
System.out.printf("모든 원소에 대한 전체 합계:%d\n",sum);

 }
}
