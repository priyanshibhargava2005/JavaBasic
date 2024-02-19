import java.util.ArrayList;

class Student {
    int id;
    String name;
    char grade;

    public Student(int id, String name, char grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Grade: " + grade;
    }
}

public class StudentDatabase {
    private ArrayList<Student> students;

    public StudentDatabase() {
        students = new ArrayList<>();
    }

    public void addStudent(int id, String name, char grade) {
        students.add(new Student(id, name, grade));
    }

    public void removeStudent(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).id == id) {
                students.remove(i);
                System.out.println("Student with ID " + id + " removed successfully.");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the database.");
            return;
        }
        System.out.println("Student Database:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        StudentDatabase database = new StudentDatabase();

        // Adding students
        database.addStudent(1, "Alice", 'A');
        database.addStudent(2, "Bob", 'B');
        database.addStudent(3, "Charlie", 'C');

        // Displaying all students
        database.displayStudents();

        // Removing a student
        database.removeStudent(2);

        // Displaying all students after removal
        database.displayStudents();
    }
}

