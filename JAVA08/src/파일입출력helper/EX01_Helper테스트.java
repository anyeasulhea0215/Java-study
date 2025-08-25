package 파일입출력helper;

import kr.anyeasulhea.helpers.FileHelper;
import java.io.UnsupportedEncodingException;

public class EX01_Helper테스트 {
    public static void main(String[] args) {
        String filepath="./helper테스트.txt";
        String content="이것은 테스트";

        byte[]data=null;
        try{
          data=content.getBytes("utf-8");
        }
        catch( UnsupportedEncodingException e){
          e.printStackTrace();
        }
       /*   저장 테스트 */
        try{
            FileHelper.getInstance().write(filepath, data);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        //읽기 테스트
        try {
            byte[] read=FileHelper.getInstance().read(filepath);
            System.out.println(new String(read,"utf-8"));
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }

    }
}
