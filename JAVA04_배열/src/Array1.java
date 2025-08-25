//최대값 구하기

public class Array1 {
    public static void main(String[] args) {
         int []data={5,2,7,9,2};

      int max=data[0];

      for(int i=1;i<data.length;i++){
        if(max<data[i]){
            max=data[i];
        }
      }

      System.out.println("max="+max);
    }
}
