public class TextLearning {

    public static void main(String[] args) {
//       String text =  """
//               Smith,Fred,1/1/79,1111 ABC St.,Apple,CA
//               McGuire,Jerry,1/2/80,2222 DEF St.,Orange,NV
//               Flintstone,Fred,1/3/81,3333 GHI St.,Pear,MO
//               Rubble,Barney,4/4/82,4444 JKL St.,Pineapple,IL
//               Jetson,George,5/5/83,5555 MNO St.,Grapefruit,NY
//                """;
//
//        String[] people = text.split("\n");
//        System.out.println(people.length);
//        String[] george = people[4].split(",");
//        System.out.println(george[3]);

        String filename = "   myfile.txt".strip();

        System.out.println(filename.endsWith("txt"));
        System.out.println(filename.startsWith("myfi"));
    }


}
