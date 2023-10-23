public class TestCircle {
    public static void main(String[] args) {

        Circle circle1 = new Circle();




        Circle circle2 = new Circle(21.22);
        System.out.println(circle2.getArea());;
    }

}
class Circle{

    double radius;

    Circle(){
        radius = 1;
    }

    Circle(double newRadius){
        radius = newRadius;
    }

    double getArea(){
        return radius * radius * Math.PI;
    }

    double getPerimeter(){
        return 2 * radius * Math.PI;
    }

}