// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Animal jen =  new Lion();
        jen.sleep();

        //casting the reference variable to lion - pointing at lion type object
        ((Lion)jen).roar();

        Lion suzie = (Lion)jen;  //downcasting

    }
}