package 파일입출력helper;



import kr.anyeasulhea.helpers.FileHelper;

public class EX02_Helper테스트2 {
   public static void main(String[] args) {
    
    String filepath="./helper테스트2.txt";
    String content="이것은 테스트 2";

   try{
    FileHelper.getInstance().writeString(filepath,content);
   }
   catch(Exception e){
    System.out.println(e.getMessage());
     }

     try {
        String read=FileHelper.getInstance().readString(filepath);
        System.out.println(read);
    } catch (Exception e) {
       System.out.println(e.getLocalizedMessage());
    }

   }
}
