public class TestCourse {

    public static void main(String[] args) {

        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        course1.addStudent("Peter Jones");
        course1.addStudent("Chandra Singh");
        course1.addStudent("Jessica Wang");

        course2.addStudent("Peter Jones");
        course2.addStudent("Kim Wallace");

        System.out.println("Number of Students in course1: "
        + course1.getNumberOfStudents()
        );
        String [] students = course1.getStudents();
        System.out.println();

        for(int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.println(students[i] + ", ");

        System.out.println();

        System.out.println("Number of students in course2: " + course2.getNumberOfStudents());

    }


}
