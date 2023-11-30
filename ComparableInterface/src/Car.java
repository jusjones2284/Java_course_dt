import java.util.ArrayList;
import java.util.Collections;

public class Car implements Comparable <Car>{

    private String name;
    private int id;

    public Car(String name, int id){

        this.name = name;
        this.id = id;
    }

    public int getId(){
        return this.id;
    }


    @Override
    public int compareTo(Car o) {
        if(this.getId() == o.getId()) return 0;
        else if (this.getId() == o.getId()) {
            return 1;
        }
        else return  -1;
    }

    public static void main(String[] args) {
        Car c1 = new Car("BMW", 10);
        Car c2 = new Car("Mercedes", 33);
        Car c3 = new Car("Volvo", 5);
        Car c4 = new Car("fiat", 0);
        Car c5 = new Car("Tesla", 100);

        ArrayList<Car> arr = new ArrayList<>();
        arr.add(c1);
        arr.add(c2);
        arr.add(c3);
        arr.add(c4);
        arr.add(c5);

        Collections.sort(arr);

        for(Car c: arr){
            System.out.println(c.id);
        }






    }
}
