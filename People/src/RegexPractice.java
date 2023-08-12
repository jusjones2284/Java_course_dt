import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice {
    public static void main(String[] args) {
        System.out.println("cat".matches("[cC]at"));
        System.out.println("Bat".toLowerCase().matches("[a-f]at"));
        System.out.println("lat".matches("[^l]at"));
        System.out.println("lat".matches("[^m-z]at"));

        System.out.println("Lat".matches("\\wat"));
        System.out.println("___".matches("\\w\\w\\w"));
        System.out.println("123".matches("\\d"));

        System.out.println("321-333-7652".matches("\\d{3}-\\d{3}-\\d{4}"));

        System.out.println("321.333.7652".matches("\\d{3}[-.,]+\\d{3}[-.,]+\\d{4}")); //one or more
        System.out.println("3213337652".matches("\\d{3}[-.,\\s]*\\d{3}[-.,\\s]*\\d{4}"));//0 or more
        System.out.println("321337652".matches("\\d{3}[-.,\\s]?\\d{3}[-.,\\s]?\\d{3,4}")); //0 or 1 match
        System.out.println("1.3213377652".matches("\\d{3}[,-.]?\\d{3}[-.,\\s]?\\d{4}"));
        String regex = """
        #This is my regex to parse the parts of a phone number
        (?:(?<countryCode>\\d{1,2})[-.,\\s]?)? #Get's country code
        (?:\\(?(?<areaCode>\\d{3})\\)?[-.,\\s]?) #Get's area code
        (?:(?<exchange>\\d{3})[-.,\\s]?) #Get's exchange
        (?<LineNumber>\\d{4}) #Get's Line number
                """;
        String phoneNumber = "1.(321) 333 2365";
        System.out.println(phoneNumber.matches(regex));//? is 0 or more

        Pattern pat = Pattern.compile(regex, Pattern.COMMENTS);
        Matcher mat = pat.matcher(phoneNumber);




        if(mat.matches()){
            System.out.println(mat.group("countryCode"));
            System.out.println(mat.group("areaCode"));
            System.out.println(mat.group("exchange"));
            System.out.println(mat.group("LineNumber"));
        }


    }
}
