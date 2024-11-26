interface Resizeable{
    void resizeWidth(int width);
    void resizeHeight(int height);
}
class Rectangle1 implements Resizeable{
    int width,height;
    Rectangle1(int width,int height){
        this.width = width;
        this.height = height;
    }
    public void resizeWidth(int width){
        if(width>0){
            this.width = width;
        }else{
            System.out.println("Invalid Width");
        }
    }
    public void resizeHeight(int height){
        if(height>0){
            this.height = height;
        }else{
            System.out.println("Invalid Height");
        }
    }
    void display(){
        System.out.println("Width: "+width);
        System.out.println("Height: "+height);
    }
}
public class Interface {

    public static void main(String[] args) {
        Rectangle1 r = new Rectangle1(9, 10);
        System.out.println("Before Resizing: ");
        r.display();
        System.out.println("After Resizing: ");
        r.resizeHeight(18);
        r.resizeWidth(23);
        r.display();
    }
}