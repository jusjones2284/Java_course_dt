// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        EmployeeClass employee = new EmployeeClass("Jerry", 12345);
        System.out.println(employee.getName());

        EmployeeRecord employeeRecord = new EmployeeRecord("Justin", 1234);
        System.out.println(employeeRecord.name());
        System.out.println(employeeRecord.nameInUpperCase());

        EmployeeRecord.printWhatever();

    }

    //record objects cannot be changed immutable
    //instance fields isnt allowed in records
}