public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        x=0;
        y=0;
    }

    public MyPoint(int x,int y) {
        this.x=x;
        this.y=y;
    }

    public void SetXY(int x,int y) {
        this.x=x;
        this.y=y;
    }

    public int[] GetXY(int x,int y) {
        return new int[] {this.x,this.y};
    }

    public String toString() {
        return "("+this.x+","+this.y+")";
    }

    public double Distance(int x,int y) {
        int dx = this.x-x;
        int dy = this.y-y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    public double Distance(MyPoint another) {
        return Distance(another.x,another.y);
    }

    public double Distance() {
        return Distance(0,0);
    }

    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(3,4);
        MyPoint point2 = new MyPoint(7,9);
        System.out.println("Point 1:"+point1.toString());
        System.out.println("Point 2:"+point2.toString());
        System.out.println("Distance from point 1 to origin :"+point1.Distance());
        System.out.println("Distance from point 1 to point 2: "+point1.Distance(point2));
        System.out.println("Distance from point 1 to (6,8): "+point1.Distance(6, 8));
    }
}