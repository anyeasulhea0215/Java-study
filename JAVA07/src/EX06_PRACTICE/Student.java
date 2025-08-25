package EX06_PRACTICE;
public class Student {
    private String name;
    private int kor;
    private int math;


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return this.kor;
    }

 //throws->에러 발생시 에러발생한 메서드 호출한 부분으로 try,catch 떠넘김
    public void setKor(int kor) throws MyKoreaException{
        if(kor<0||kor>100){
            /*
             *  이라인에서 에러를 강제로 발생시킴
             * throws명령은 try~catch 구문으로 감싸지거나
             * throws명령을 사용하는 메서드는 throws를 통해 강제로 발생하는 에러에 대한 처리를 호출하는 위치로 떠넘겨야 한다
             */
            throw new MyKoreaException();
        }
        
        this.kor = kor;
    }

    public int getMath() {
        return this.math;
    }

    public void setMath(int math) throws MyMathException {
       if(math<0){
        throw new MyMathException("수학 점수가 0보다 작음");
       }
       if(math>100){
        throw new MyMathException("수학 점수가 100보다 큼");
       }
        this.math = math;
    }
    
    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", kor='" + getKor() + "'" +
            ", math='" + getMath() + "'" +
            "}";
    }
}
