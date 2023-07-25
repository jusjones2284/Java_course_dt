import java.net.StandardSocketOptions;
import java.sql.SQLOutput;
import java.util.Locale;

public class LearnStrings1 {
    public static void main(String[] args) {

//        String myText = "here's my awesome firf text";
//        System.out.println(myText.toUpperCase().replace("F", "J").toLowerCase());
//        String firstName = "  Justin  ";
//            String firstName = """
//                        First line here
//                                    Second line here
//                        third line here
//
//                    """;
//        System.out.format("'%s'", firstName.strip());
//        String theStrip = strip("  Justin  ");
//        System.out.println(theStrip);
//        String firstName = " Jason ";
//        System.out.format("%s", split(firstName) );

//        String myText = "Apples";
//        int length = myText.length();
//        if (length > 9){
//            System.out.println(myText.charAt(5));
//        }

//        String firstWord = "Apple";
//        String secondWord = "ae";
//        System.out.println(compareToIgnoreCase(firstWord, secondWord));
//        System.out.println(firstWord.compareTo(secondWord));

//        String myText = "Four score and seven years ago";
//        System.out.println(myText.contains("seven"));

        String text1 = "this is my text1";
        String text2 = "this is my text2";

//        System.out.println(text1.concat(" ".concat(text1)));
//
//        System.out.println("my string literal".concat(text1));

        String finalString =  new StringBuilder()
                .append(text1)
                .append(" ")
                .append(text2)
                .toString();
        System.out.println(finalString);

        System.out.format("%s %n %s", text1, text2);



    }

//    public static int compareToIgnoreCase(String text1, String text2){
//        String lowerText1 = text1.toLowerCase();
//        String lowerText2 = text2.toLowerCase();
//        return lowerText1.compareTo(lowerText2);
//    }

//    public static String strip(String text){
//
//       return text.strip();
//    }
//
//    public static String split(String text){
//        return text.replace(" Jason ", "Justin");
//    }
}
