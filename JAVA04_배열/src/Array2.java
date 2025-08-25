public class Array2 {
 public static void main(String[] args) {
    int []data={2,6,3,1,5};

    for(int i=0;i<data.length/2;i++){
        int k=data.length-i-1;
          int temp=data[i];
          data[i]=data[k];
          data[k]=temp;
    }

    for(int i=0;i<data.length;i++){
        System.out.print(data[i]+"\t");
    }

 }   
}
