package 연습문제;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public class fileread {
    public static void main(String[] args) {
        //읽어올 파일의 경로
        String filePath="./info.txt"; //현재 열고 있는 프로젝트 기준, "./" 생략가능

        byte[]buffer=null; ///읽어올 내용이 저장될 스트림

        String content=null; //읽어온 내용이 저장되어 있는 스트림이 저장될 문자열
  
        //파일읽기
        InputStream is=null;  
        
        try {
            is=new FileInputStream(filePath);

            //파일 용량만큼 byte[]의 사이즈를 생성
            buffer=new byte[is.available()];

            //파일 내용을 버퍼에 담음
              is.read(buffer);
        
        } catch (FileNotFoundException e) {
            System.err.println("[error]"+e.getMessage());
            System.err.println("---------");
            e.printStackTrace();
        }
        catch (IOException e) {
            System.err.println("[error]"+e.getMessage());
            System.err.println("---------");
            e.printStackTrace();
        }
        catch (Exception e){
            System.err.println("[error]"+e.getMessage());
            System.err.println("---------");
            e.printStackTrace();
        }

        finally{
            if(is!=null){
                try{
                    is.close();

                }
                catch(IOException e){
                     e.printStackTrace();
                }
            }
        }
        /*
         * 읽은 내용을 문자열로 변환
         * buffer 배열에 내요이 있다면?
         */
        
        if(buffer!=null){
            try{
                content=new String(buffer, "utf-8");
                System.out.println(content);
            }
            catch(UnsupportedEncodingException e){
            System.out.println("[Error] 인코딩 지정에러");
            e.printStackTrace();
            }
        }

    }
}
