public class LearnStrings {
    public static void main(String[] args) {
        String fruit = "apple";
        String anotherFruit = "apple";
        String vegetable = new String("broccoli");
        String anotherVegetable = new String("broccoli");
        boolean answer = fruit == vegetable;
        System.out.println(answer ? "yes": "no");

        String myText = " ";
        System.out.println(myText.isEmpty());
        System.out.println((myText.isBlank()));
    }
}
