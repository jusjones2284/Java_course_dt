import java.awt.*;

public class Circle4 extends GeometricObject{

    private double radius;

    public Circle4(){

    }

    public Circle4(double radius){
        super();
        this.radius = radius;
    }


    public Circle4(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

   public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    public void printCircle(){
        System.out.println(toString() + "The circle is created " + getDateCreated() +
                "and the radius is " + radius);
    }

    public String toString(){
        return "Circle WWW " + getColor() + super.toString();
        Math.abs(5);
    }




}
