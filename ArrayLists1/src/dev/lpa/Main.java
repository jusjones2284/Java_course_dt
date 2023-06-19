package dev.lpa;
import java.util.ArrayList;
import java.util.Arrays;
// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
record GroceryItem(String name, String type, int count){

    //constructor
    public GroceryItem(String name){
        this(name, "Dairy", 1);
    }
    @Override
    public String toString(){
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}

record GroceryItems(String name, String type, int count){
   public GroceryItems(String name){
       this(name, "produce", 9);
   }

}
public class Main {


    public static void main(String[] args) {

        GroceryItem [] groceryItem = new GroceryItem[4];
        groceryItem[0] = new GroceryItem("milk");
        groceryItem[1] = new GroceryItem("Apples", "produce", 4);
        System.out.println(Arrays.toString(groceryItem));

        Object [] groceryItems = new Object[5];
        GroceryItems[] groceryItems0 = new GroceryItems[4];
        groceryItems0[0] = new GroceryItems("bacon", "meat", 3);

        GroceryItems[] groceryItems2 = new GroceryItems[3];
        groceryItems2[2] = new GroceryItems("eggs");

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("butter"));
        objectList.add("Yogurt");

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Yogurt", "snack", 2));
        groceryList.add(new GroceryItem("water"));
        groceryList.add(new GroceryItem("apples", "produce", 3));
        groceryList.add(0,
                new GroceryItem("chips")
        );
        groceryList.set(2, new GroceryItem("apple juice"));
        groceryList.remove(3);
        System.out.println(groceryList);




    }
}