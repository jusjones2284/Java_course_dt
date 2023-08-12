public class RegexPractice2 {
    public static void main(String[] args) {
        System.out.println("doggy".matches("...."));
        System.out.println("doggy".matches(".*"));
        System.out.println("doggy".matches(".?"));
        System.out.println("doggy".matches(".+"));
        System.out.println("doggy".matches("[^abcd]")); //<- carrot means match any character that is not
        System.out.println("doggy".matches("^.....$")); //<- carrot means start at the beginning of any string $ means the end of the line
        System.out.println("cat".matches("\\W\\W\\W"));// opposite of words
        System.out.println("abc".matches("\\D\\D\\D"));//opposite of digits
    }
}
