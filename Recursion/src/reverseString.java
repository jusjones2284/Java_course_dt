public class reverseString {
    public static void main(String[] args) {

        String word = "hello";
//        System.out.println(word.substring(1));
//        ;
//        System.out.println(word.charAt(0));
//        String input = "hello";
//        for(int i = 0; i <= 3; i++){
//            System.out.println(reverseString(input));
//        }

        for (int i = 0; i <= word.length(); i++) {
            System.out.println(reverseString(word));
            ;

        }


    }
    public static String reverseString (String input){
        if (input.equals("")) {
            return "";
        } else {
            return reverseString(input.substring(1));
        }


    }
}