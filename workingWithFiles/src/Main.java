import java.io.File;

public class Main {

    public static void main(String[] args) {
        File file = new File("secert_message.txt");
        File files = new File("/Users/justinjones/Desktop/secert_message.txt");

//        if(file.exists()){
//            System.out.println("That file exists! :0!");
//            System.out.println(file.getPath());
//            System.out.println(file.getAbsoluteFile());
//        }else {
//            System.out.println("That file doesn't exists");
//        }

        if(files.exists()){
            System.out.println("That file exists! ");
            System.out.println(files.getAbsoluteFile());
//            files.delete();
        }
        else {
            System.out.println("That file doesnt exists");
        }
    }


}
