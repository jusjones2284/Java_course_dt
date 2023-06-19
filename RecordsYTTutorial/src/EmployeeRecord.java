public record EmployeeRecord(String name, int employeeNumber) {

    //record is a special type of class
    //final fields by default
    //public getter methods

    public String nameInUpperCase(){
        return name.toUpperCase();
    }

    public static void printWhatever(){
        System.out.println("Whatever");
    }

}
