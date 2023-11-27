import java.io.File;
import java.io.PrintWriter;

public class WriteData1 {

    public static void main(String[] args) throws Exception {

        File files = new File("/Users/justinjones/Desktop/newText.py");
        File test = new File("thirdTestFile");

//        if(files.exists()){
//            System.out.println("file already exist");
//            System.exit(0);
//        }

        if(test.exists()){
            System.out.println("files already exist");
            System.exit(0);
        }
        PrintWriter outputs = new PrintWriter(test);
        outputs.print("Gayle V Jones");
        outputs.println(245);
        outputs.print("Audrey Valentine");
        outputs.println(948);

        outputs.close();

    }
}
