public class Array5{
public static void main(String[] args) {
    int []work={7,5,5,5,5,10,7};
int pay=0;

//4-(1)
for(int i=0;i<work.length;i++){
    if(i<4){
        pay+=work[i]*4500;
    }
    else{
        pay+=work[i]*5200;
    }
}

//4-(2)
for(int i=0;i<work.length;i++){
    pay+=work[i]*(i<4?4500:5200);
}

//pay=sum+sum2;

System.out.println("일주일간의 총 급여" +pay+"원");
}
}