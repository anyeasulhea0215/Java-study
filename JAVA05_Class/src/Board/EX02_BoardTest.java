package Board;
public class EX02_BoardTest {
    public static void main(String[] args) {
        NoticeBoard nb=new NoticeBoard();
        
        nb.setNum(1);
        nb.setSubject("공지사항입니다");
        nb.setContent("공지사항의 내용 입니다.");
        nb.setWriter("관리자");   
        nb.setFile("첨부파일");
        System.out.println(nb.getFile());
        

       QnaBoard qna=new QnaBoard();
      qna.setNum(2);
      qna.setSubject("질문답변");
      qna.setContent("질문답변의 내용입니다");
      qna.setWriter("회원1");
      qna.setVote(123);
      System.out.println(qna.getWriter());

        FreeBoard fb=new FreeBoard();
        fb.setNum(3);
        fb.setSubject("자유");
        fb.setContent("자유 내용");
        fb.setWriter("회원 2");
        fb.setScrap(456);
       System.out.print(fb.getScrap());
    }
}
