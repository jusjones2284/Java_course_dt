package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count){

    public GroceryItem(String name){
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString(){
        return String.format("%d %s in %s", count, name.toUpperCase(), type);

    }
}
public class Main {

    public static void main(String[] args) {
        Object[] groceryArray = new Object[3];
        Object[] wholeFoods = new Object[5];
        GroceryItem[] walmartArray = new GroceryItem[4];

        groceryArray[0] = new GroceryItem("Milk");
        groceryArray[1] = new GroceryItem("apples", "Product", 5);
        groceryArray[2] = "5 oranges";
        System.out.println(Arrays.toString(groceryArray));


        walmartArray[0] = new GroceryItem("waffels");
        walmartArray[1] = new GroceryItem("blueberries", "fruit", 2);

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("milk"));
        groceryList.add(new GroceryItem("oranges", "PRODUCE", 5));
        groceryList.add(0,
                new GroceryItem("apples", "PRODUCE", 6));
        System.out.println(groceryList);
        groceryList.set(1,
                new GroceryItem("bananas", "fruit",1 ));
        groceryList.remove(2);
        System.out.println(groceryList);




    }
}
