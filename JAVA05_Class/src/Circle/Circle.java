package Circle;
public class Circle {
    private Point point; 
    private int radius;

    public void setPoint(Point point){
        this.point=point;
    }

    public Point getPoint() {
        return this.point;
    }


    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public String toString(){
        String msg="원의 중점 좌표는 (%d ,%d)이고 반지름은 %d입니다\n";
        String result=String.format(msg,this.point.getX(),this.point.getY(),this.radius);
        return result;
    }

}
