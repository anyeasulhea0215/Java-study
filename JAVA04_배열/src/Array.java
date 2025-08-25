public class Array {

  // (4)
  /*
   * public static int compare (int []arr1,int []arr2){
   * int count=0;
   * for(int i=0;i<arr1.length;i++){
   * System.out.println(arr[i]);
   * for(int j=0;j<arr2.length;j++){
   * System.out.println(arr2[j]);
   * if(arr2[j]==arr1[i]){
   * count++;
   * break;
   * }
   * }
   * }
   * return count;
   * }
   */

  /*
   * (3) Arry출력 메서드
   * public static void printArry(int [] n){
   * for(int i=0;i<n.length;i++){
   * System.out.printf("arr[%d]:\n",n[i]);
   * }
   * }
   */

  public static void main(String[] args) {
    int[] arry = new int[100];

    for (int i = 0; i < arry.length; i++) {
      arry[i] = i + 1;
    }

  }
}
