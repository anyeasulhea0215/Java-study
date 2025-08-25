package 파일및폴더기능;
import java.io.File;

public class EX02_File2 {
    public static void main(String[] args) {
        File f2=new File("a/b/c/target");
        System.out.println("isFile:"+f2.isFile()); //전달된 경로가 파일인지

        System.out.println("isDirectory:"+f2.isDirectory());
        System.out.println("isHidden"+f2.isHidden());
        System.out.println("절대경로: "+f2.getAbsolutePath());
        System.out.println("존재여부: "+f2.exists());

         /*
         * 경로에 따른 디렉터리 생성  
         * ->최종폴더만 생성하려고함
         * ->중간 폴더가 없기 때문에 생성실패-->false
         * System.out.println(f2.mkdir());
         */

        f2.mkdirs(); // 땅굴파기

        System.out.println(f2.getName()); //마지막 '/'이후단어를 리턴

        System.out.println(f2.getParent()); //처음부터 마지막 '/'직전까지 리턴

        System.out.println("--------------");

        /* boolean del_ok=f2.delete();
        System.out.println("삭제성공여부:"+del_ok); */
       
    }
}
