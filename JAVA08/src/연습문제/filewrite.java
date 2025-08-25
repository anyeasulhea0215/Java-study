package 연습문제;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.OutputStream;



public class filewrite{
    public static void main(String[] args) {

        //저장할 파일의 경로
        String filePath="./info.txt";
        //파일에 저장할 내용
        Scanner scanner = new Scanner(System.in);

        // 각 항목별 입력 받기
        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.print("연락처를 입력하세요: ");
        String contact = scanner.nextLine();

        System.out.print("나이를 입력하세요: ");
        String age = scanner.nextLine();

        System.out.print("키를 입력하세요: ");
        String height = scanner.nextLine();

        scanner.close();

        
        String content = "이름: " + name + "\n" +
                         "연락처: " + contact + "\n" +
                         "나이: " + age + "\n" +
                         "키: " + height;

        byte[]buffer=null; //저장할 내용을 스트림(이진수모음)으로 변환

        try {
            buffer=content.getBytes("utf-8"); //파라미터로 인코딩방식 지정-->getBytes메서드 사용
        } 
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        
        //파일 쓰기
        OutputStream os=null;  //부모 객체로선언

        try {
            os=new FileOutputStream(filePath); //자식타입으로 할당함
            os.write(buffer); //buffer에 저장된 내용을 write.
        
        } catch (FileNotFoundException e) {
            System.err.println("[error]"+e.getMessage());
            System.err.println("---------");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("[error]"+e.getMessage());
            System.err.println("=========");
            e.printStackTrace();
        }
        //모든 에러의 최상위 클레스
        catch(Exception e){
            System.err.println("[error]"+e.getMessage());
            System.err.println("---------");
            e.printStackTrace();
        } finally{

            //사용한 스트림은 에러 발생 여부와 상관없이 닫아야 한다
            if(os!=null){

                //throws나는 위치에 try~catch구현
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}