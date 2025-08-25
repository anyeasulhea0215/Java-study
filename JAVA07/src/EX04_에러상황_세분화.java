public class EX04_에러상황_세분화 {
    public static void main(String[] args) {
        int []data={100,200,300};

        try{
            for(int i=2;i>=-1;i--){
                /*
                 * 에러 발생상황:
                 * 1)배열의 인덱스 초과
                 * 2)0으로 나눈경우
                 */
                int k=i!=0?data[i]/i:i;

                System.out.println(k);
            }
        }
        //catch블록을 발생할 수 있는 에러의 경우의 수에 따라 여러개를 정의.
        catch(ArrayIndexOutOfBoundsException e1){
            System.out.println("배열의 인덱스 초과");
        }
        catch(ArithmeticException e2){
            System.out.println("잘못된 연산입니다");
        }catch (Exception e){
            System.out.println("알수 없는 에러가 발생했습니다");
        }
      /*   Exception클래스는 java의 모든 예외 클레스에 대한 최상위 클래스
        catch 블록에서 Exception 블록을 선언하면 모든 에러 상황들이 Exception형태로 암묵정 형변환 된다.
        Exception에 대한 catch블록은 도믄 예외사항에 대응한 후 마지막에 알수없는 에러에 대한 대비책으로 명시해둘수 있다 */
    }
}
