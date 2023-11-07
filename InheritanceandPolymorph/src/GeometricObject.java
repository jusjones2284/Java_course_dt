import javax.xml.crypto.Data;
import java.util.Date;

public class GeometricObject {
    private String color;
    private boolean filled;
    Date date;

    public GeometricObject() {
        date = new Date();

    }
    public GeometricObject(String color, boolean filled){
        date = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public Date getDateCreated(){
        return date = new Date();
    }

    public String toString(){
        return "created on " + date + "\ncolor: " + color + " and filled: " + filled;
    }

    public static void main(String[] args) {

        GeometricObject jus = new GeometricObject("red", false);
        System.out.println(jus.date);
        Circle4 fatBoy = new Circle4(499, "blues", true);
//        System.out.println(fatBoy.sumRadius());


//        fatBoy.setColor("white");
//        System.out.println(fatBoy.getColor() + fatBoy.date);;

    }
}
