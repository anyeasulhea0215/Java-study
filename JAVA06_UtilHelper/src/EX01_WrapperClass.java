public class EX01_WrapperClass {
    public static void main(String[] args) {
        
        int num=100;
        Integer a=num;
        System.out.printf("a=%d\n",a);

        Integer b=new Integer(num);
        System.out.printf("b=%d\n", b);

        int c=100;
        System.out.println(a+c);

        String s1="20";
        String s2="3.14";
   
        //특정 데이터형의 모양을 하는 문자열을 실제 데이터형으로 변환해준다
        int num_a=Integer.parseInt(s1);
        float num_b=Float.parseFloat(s2);

        int v1=num_a+500;
        float v2=num_b+500;
        System.out.println("v1="+v1);
        System.out.println("v2="+v2);

    }
}
