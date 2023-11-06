public class Rectangle1 extends GeometricObject{

    private double width;
    private double height;

    public Rectangle1(){

    }

    public Rectangle1(double width, double height){
        this.width = width;
        this.height = height;

    }

    public Rectangle1(double width, double height, String color, boolean filled){
        this.width = width;
        this.height = height;
        setColor("yellow");
        setFilled(filled);

    }

    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }

    // methods
    public double getArea(){
        double area = 0;
       return area = height * width;
    }

    public double getPerimeter(){
        return 2 * width + height;
    }
}
