public class Student extends Person{
    private int studentId;

    public boolean equals(Object obj){
        Student s = (Student) obj;

        if(this.studentId != s.studentId)
            return false;
        if(!s.getName().equals(this.getName()))
            return false;
        if(this.getAge() != s.getAge())
            return false;

        return true;
    }
    public Student(){
        super();
        studentId = 0;
    }

    public Student(String name, int age, int studentId){
        super(name, age);
        this.studentId = studentId;
    }
}
