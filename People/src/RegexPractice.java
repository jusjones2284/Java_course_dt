public class RegexPractice {
    public static void main(String[] args) {
        System.out.println("cat".matches("[cC]at"));
        System.out.println("Bat".toLowerCase().matches("[a-f]at"));
        System.out.println("lat".matches("[^l]at"));
        System.out.println("lat".matches("[^m-z]at"));
    }
}
