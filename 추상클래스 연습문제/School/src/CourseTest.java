class OnlineCourse extends Course{

public OnlineCourse(String coursename, String teachername) {
        super(coursename, teachername);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void startClass() {
       System.out.println("Zoom링크를 통해 온라인 수업을 시작합니다");
    }
    
}

class OfflineCourse extends Course{
    public OfflineCourse(String coursename,String teachername){
        super(coursename, teachername);
    }

    @Override
    public void startClass() {
        System.out.println("지정된 강의실에서 대면 수업을 시작합니다");
    }
}

class HybridCourse extends Course{
    public HybridCourse(String coursename,String teachername){
        super(coursename, teachername);
    }

    @Override
    public void startClass() {
        System.out.println("온라인 수업과 오프라인 수업을 병행합니다");
        
    }
    public void switchMode(String mode){
        System.out.printf("현재수업 모드를 %s로 변경합니다\n",mode);
    }
}

//부모 class 
 abstract class Course {
    private String coursename;
    private String teachername;

    public Course(String coursename, String teachername) {
        this.coursename = coursename;
        this.teachername = teachername;
    }

    public String getCoursename() {
        return this.coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getTeachername() {
        return this.teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }


    public void showInfo(){
        System.out.printf("수업명:%s /교사:%s\n",this.getCoursename(),this.getTeachername());
    }
    //추상메서드
   public abstract void startClass();
    
}


public class CourseTest {
    public static void main(String[] args) throws Exception {
       Course []c=new Course[3];
       c[0]=new OnlineCourse("자바프로그래밍","김교수");
       c[1]=new OfflineCourse("자료구조", "이교수");
       c[2]=new HybridCourse("AI프로젝트", "박교수");

       for(int i=0;i<c.length;i++){
        c[i].showInfo();
        c[i].startClass();
        if(c[i] instanceof HybridCourse){
            System.out.println();
            HybridCourse h=(HybridCourse)c[i];
            h.switchMode("실시간화상");
        }
        System.out.println();
       }
    }
}
