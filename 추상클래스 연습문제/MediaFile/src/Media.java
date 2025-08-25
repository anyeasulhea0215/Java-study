class Audiofile extends MediaTest{
    public Audiofile(String filename){
        super(filename);
    }

    @Override
    public void play() {
       System.out.println("오디오파일을 재생합니다");
    }
}

class Imagefile extends MediaTest {
    public Imagefile(String filename){
        super(filename);
    }

    @Override
    public void play() {
       System.out.println("이미지 파일을 재생합니다");
    }
}

class Videofile extends MediaTest {
    public Videofile(String filename){
        super(filename);
    }

    @Override
    public void play() {
       System.out.println("비디오 파일을 재생합니다");
    }
    public void showSubtitles(){
        System.out.println("자막:영화자막을 표시합니다");
    }
}


abstract class MediaTest {
    private String filename;

    public MediaTest(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return this.filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void getInfo(){
     System.out.printf("파일명:%s\n",this.filename);
     //this.getFilename();
    }

    public abstract void play();
}

public class Media {
    public static void main(String[] args) {
      MediaTest m[]=new MediaTest[3];
      m[0]=new Audiofile("music mp3"); //자식 객체가 부모타입의 객체로 저장됨
      m[1]=new Videofile("movie.mp4");
      m[2]=new Imagefile("pictyure.jpg");

      for(int i=0;i<m.length;i++){
        m[i].getInfo();
        m[i].play();
        
        System.out.println();
}
      Videofile v=(Videofile)m[1];
      v.showSubtitles();
    }
}

