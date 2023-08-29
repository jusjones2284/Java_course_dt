import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PeopleMatching {

    public static void main(String[] args) {

        String people = """
            Flinstone, Fred, 1/1/1900
            Rubble, Barney, 2/2/1905
            Flinstone, Wilma, 3/3/1910
            Rubble, Betty, 4/4/1915
            """;

        String regex = "(?<lastName>\\w+),\\s*(?<firstName>\\w+),\\s*(?<month>\\d{1,2})[/.](?<day>\\d{1,2})[/.](?<year>\\d{2,4})\\n";

        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(people);

//        if(mat.matches()){
//
//        }
//        mat.find();//<--finds any part of the string that matches
//        System.out.println(mat.group("firstName"));
//        System.out.println(mat.group("lastName"));
//        System.out.println(mat.group("month"));
//        System.out.println(mat.group("day"));
//        System.out.println(mat.group("year"));
//
//
//        mat.find();//<--finds any part of the string that matches
//        System.out.println(mat.group("firstName"));
//        System.out.println(mat.group("lastName"));
//        System.out.println(mat.group("month"));
//        System.out.println(mat.group("day"));
//        System.out.println(mat.group("year"));
//
//
//        mat.find();//<--finds any part of the string that matches
//        System.out.println(mat.group("firstName"));
//        System.out.println(mat.group("lastName"));
//        System.out.println(mat.group("month"));
//        System.out.println(mat.group("day"));
//        System.out.println(mat.group("year"));

//        mat.find(35);//<--finds any part of the string that matches
//        System.out.println(mat.group("firstName"));
//        System.out.println(mat.group("lastName"));
//        System.out.println(mat.group("month"));
//        System.out.println(mat.group("day"));
//        System.out.println(mat.group("year"));
//        System.out.println(mat.start());
//        System.out.println(mat.end());


        mat.find(35);//<--finds any part of the string that matches
        System.out.println(mat.group("firstName"));
        System.out.println(mat.group("lastName"));
        System.out.println(mat.group("month"));
        System.out.println(mat.start("day"));
        System.out.println(mat.end("year"));

    }
}
