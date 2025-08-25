package kr.anyeasulhea.helpers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class FileHelper {

    private static FileHelper current=null;

    public static FileHelper getInstance(){
        if(current==null){
            current=new FileHelper();
        }
        return current;
    }

    public static void freeInstance(){
        current=null;
    }
    private FileHelper(){
        super();
    }  //->> 싱글톤 객체


   /**
    *  file에 데이터 쓰는 메서드
    * @param filepath  파일경로
    * @param data    저장할 데이터
    * @throws Exception   파일 입출력 예외
    */
    public void write(String filepath,byte[] data) throws Exception{
         OutputStream os=null;  //부모 객체로선언

        try {
            os=new FileOutputStream(filepath); //저장할 파일 스트림 생성
            os.write(data); //buffer에 저장된 내용을 write.
        
        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
            throw e;
        } catch (IOException e) {
           
            e.printStackTrace();
            throw e;
        }
        //모든 에러의 최상위 클레스
        catch(Exception e){
            e.printStackTrace();
             throw e;
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

    
    /**
     * 
     * @param filePath
     * @return
     * @throws Exception
     */

    public byte[] read(String filePath) throws Exception{
        byte[] buffer=null;
        InputStream is=null;

               try {
            is=new FileInputStream(filePath);

            //파일 용량만큼 byte[]의 사이즈를 생성
            buffer=new byte[is.available()];

            //파일 내용을 버퍼에 담음
              is.read(buffer);
        
        } catch (FileNotFoundException e) {
          e.printStackTrace();
          throw e;
        }
        catch (IOException e) {
          
            e.printStackTrace();
            throw e;
        }
        catch (Exception e){
        
            e.printStackTrace();
            throw e;
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
        return buffer;
    }

    public void writeString(String filepath,String content)throws Exception{
       
    try{
        this.write(filepath, content.getBytes("utf-8"));
    }

    catch(UnsupportedEncodingException e){
    e.printStackTrace();
    throw e;    
    } catch (Exception e){
    e.printStackTrace();
    throw e;
      }

    }


     public String readString (String filepath)throws Exception{
        String content=null;

    try{
        byte[] data=read(filepath);
        content=new String(data,"utf-8");
    } catch (Exception e){
        e.printStackTrace();
        throw e;
    }

       return content;
     }




}
