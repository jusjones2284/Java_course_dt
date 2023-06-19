public class EmployeeClass {

    private final String name;
    private final int employeeNumber;

    public EmployeeClass(String name, int employeeNumber){
        this.name = name;
        this.employeeNumber = employeeNumber;
    }

    public String getName(){
        return name;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    @Override
    public String toString() {
        return "EmployeeClass{" +
                "name='" + name + '\'' +
                ", employeeNumber=" + employeeNumber +
                '}';
    }
}
