public class testObject {
    private int address;
    public static void main(String[] args) {
        testObject test = new testObject();
        System.out.println(test);

        System.out.println(red + "," + green + "," + blue);
    }


    public String toString() {
        return "#(" + red + "," + green + "," + blue + ")";
    }


    public class  HighSchoolStudent extends Student{
        public HighSchoolStudent(String x){
            super(x);
        }
        public String toString(){
            return "high school" +super.toString();
        }
    }
}
