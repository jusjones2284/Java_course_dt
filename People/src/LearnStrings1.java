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

//        String text1 = "this is my text1";
//        String text2 = "this is my text2";

//        System.out.println(text1.concat(" ".concat(text1)));
//
//        System.out.println("my string literal".concat(text1));

//        String finalString =  new StringBuilder()
//                .append(text1)
//                .append(" ")
//                .append(text2)
//                .toString();
//        System.out.println(finalString);
//
//        System.out.format("%s %n %s", text1, text2);
//
//
//
//    }

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
//        String myText = "for";
//        System.out.println(myText.length());
//        char [] chars = myText.toCharArray();
//        int index = 0;
////        if( index < myText.length()){
////            System.out.println(chars[index]);
////            System.out.println(index);
////            index ;
////        }
//        System.out.println(chars[index]);
//        String myText1 = "for";
//        String myText2 = "score";
//
//        StringBuilder builder = new StringBuilder(myText1.length() + myText2.length())
//                .append(myText1)
//                .append(myText2);
//        System.out.println(builder.toString());
//        String myText = "apple";
//        String firstPart = myText.substring(0, 1);
//        String lastPart = myText.substring(1);
//        String myNewText = firstPart.toUpperCase() + lastPart;
//        String myNewText1 = myNewText.substring(0,1).toUpperCase().concat(myText.substring(1));
//        System.out.println(myNewText);
//        String myNewText3 = new StringBuilder(myText)
//                .append(myNewText1)
//                .append(lastPart)
//                .append(firstPart)
//                .toString();

        String myText = "four score And B seven 9 years ago";
        String phoneNumber = "(234) 333-5551".strip();
        String areaCode = parseAreaCode(phoneNumber);
        System.out.println(areaCode);
        String exchange = parseExchange(phoneNumber);
        System.out.println(exchange);
        System.out.println(parseLineNumber(phoneNumber));
        String lineNumber = "";

        String myNewNumber = new StringBuilder(areaCode).append(" ")
                .append(exchange)
                .append(parseLineNumber(phoneNumber))
                .toString();
        System.out.println(myNewNumber);






//        System.out.println(myText.indexOf(57) + 23);

    }

    public static String parseAreaCode(String phoneNumber){
        int openParens = phoneNumber.indexOf("(");
        int closeParens = phoneNumber.indexOf(")");
       String areaCode = phoneNumber.substring(openParens + 1, closeParens );
       return areaCode;
    }

    public static String parseExchange(String phoneNumber){
        int spaceIndex = phoneNumber.indexOf(" ");
        int hyphenIdx = phoneNumber.indexOf("-");
        String exchanges = phoneNumber.substring(spaceIndex + 1, hyphenIdx );
        int beginExchange = phoneNumber.indexOf("3", 4);
        int endingExchange = phoneNumber.lastIndexOf("3");
        String exchange = phoneNumber.substring(beginExchange, beginExchange + 3);
        return exchanges;
    }

    public static String parseLineNumber(String phoneNumber){
        int hyphenIdx = phoneNumber.indexOf("-");

       return phoneNumber.substring(hyphenIdx );

    }
}
