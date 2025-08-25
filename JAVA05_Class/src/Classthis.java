class User{
    String userId;

    void setUserId(String userId){
        this.userId=userId;
    } //getter

    String getUserId(){
        return this.userId;
    } //setter
}


public class Classthis {
    public static void main(String[] args) {
        User user=new User();

        user.setUserId("helloworld");  //userId="helloworld"
        String myid=user.getUserId(); //myid="helloworld"
        System.out.printf(myid);       
    }
}
