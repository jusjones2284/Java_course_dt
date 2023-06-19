import java.util.Locale;

public class Item {

    private String type;
    private String name;
    private double price;
    private String size = "MEDIUM";

    public Item(String type, String name, double price){
        this.type = type.toUpperCase();
        this.name = type.toUpperCase();
        this.price = price;
    }

    public String getName(){
        if(type.equals("SIDE") || type.equals("DRINK")){
            return size + " " + name;
        }
        return name;
    }

    public double getBasePrice(){
        return price;
    }
}
