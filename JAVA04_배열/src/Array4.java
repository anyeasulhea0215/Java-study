public class Array4 {
 public static void main(String[] args) {
    int [] arry=new int[100];
    
    for(int i=0;i<arry.length;i++){
        if(arry[i]%3==0 && arry[i]%5==0){
            System.out.printf("3과5의 배수:%d \n",arry[i]);
        }
    }

    for(int i=1;i<101;i++){
        if(i%3==0 && i%5==0){
            System.out.println(i);
        }
    }
   
    int []arr={1,9,4,2,5};

    int []copy=new int[arr.length];

    for(int i=0;i<arr.length;i++){
        copy[i]=arr[i];
      System.out.printf("copy[%d]=%d\n",i,copy[i]);
    }
    
 }    
}
