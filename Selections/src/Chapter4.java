public class Chapter4 {

    public static void main(String[] args) {
        int y = 2;
        double z = 5.00;
//        double x = 4.5;
        char ch = 'c';

        System.out.println(Math.sin(Math.PI));
        System.out.println(Math.round(4.5));
        System.out.println(Math.ceil(3.6));
        System.out.println(Math.floor(3.6));
        System.out.println( 5 + (int)(Math.random() * 6));
        char x = 'b';
        System.out.println(--x);
        System.out.println((char)y);
        System.out.println('z' + 'a');
        System.out.println((ch >= 'a' && ch <= 'f'));
        System.out.println(Character.isLetter('0'));
//        System.out.println(isLetter(ch));
        System.out.println(Character.isLetterOrDigit(9));
        String s1 = "1";
        String s2 = "2";
        String s3 = "";
        String name = "Blair";
        System.out.println(name.charAt(name.length() - 1));
        System.out.println("java" + 1 + 2 + 3);
        char yellow = 'B';
        String lastName = "Zionz";
        System.out.println('A' + 1);
        System.out.println(yellow + 2);
        System.out.println(s1.equals("1"));
        System.out.println((s1.compareTo(s2) > 0));
        System.out.println((lastName.compareTo("Dexter") > 0));

        String s6 = "hello";
        String s7 = "world";
        String eight = "8";
        String ninety = "90.998";
        char c = s6.charAt(s6.length() - 1);
        char d =  s6.charAt(3);
        System.out.println(d);
        System.out.println(s6.equals(s7) == s7.equals(s6));
        System.out.println("abc".compareTo("aba"));
        System.out.println("SELECT".substring(0,0));
        System.out.println(Integer.parseInt(eight));
        System.out.println(Double.parseDouble(ninety));
//        System.out.printf("%8.2d", 5.2);
        System.out.printf("%3.0f", 1234.56);
        System.out.printf("%5d", 123456);

        String tb = """
                Java "" 
                Python \s
                C++""";


    }
}
