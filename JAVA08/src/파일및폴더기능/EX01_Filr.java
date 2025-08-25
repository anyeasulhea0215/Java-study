package 파일및폴더기능;
import java.io.File;

public class EX01_Filr {
    public static void main(String[] args) {
        /*
         * 절대경로나 상태경로를 생성자 파라미터로 전달
         * 상대경로 경우, 현재 프로젝트 폴더가 기준이 됨
         */
        File f1=new File("./text.txt");

        boolean is_file=f1.isFile();    //전달된 경로가 파일인지 검사
        System.out.println("isFile="+is_file);

        boolean is_dir=f1.isDirectory();   //전달된 경로가 디렉터리인지 검사
        System.out.println("isDirectory="+ is_dir);
      
        boolean is_hidden=f1.isHidden();    //전달된 경로가 숨김형태인지 검사
        System.out.println("isHidden="+is_hidden);

        String abs=f1.getAbsolutePath();   //절대경로 값을 추출
        System.out.println("절대경로"+abs);

        boolean is_exit=f1.exists();    //생성자에 전달된 파일이나 디렉토리가 물리적으로 존재하는지 검사
        System.out.println("존재여부:"+is_exit);

    }
}
