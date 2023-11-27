import java.io.File;
import java.io.PrintWriter;

public class WriteDataWithAutoClose {
    public static void main(String[] args) throws Exception{

        File file = new File("sources2.py");

        if(file.exists()){
            System.out.println("File already exist");
            System.exit(1);
        }

        try(PrintWriter output = new PrintWriter(file)){

            output.print("John T. Perez");
            output.println(90);
            output.print("Jamal K. Johnson");
            output.println(90);




        }

    }
}
