import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class student {
    private String name;
    private LocalDate dateOfBirth;

    public student(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    public void displayStudentInfo() {
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(dateOfBirth, currentDate).getYears();
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

    public static void main(String[] args) {
        student student = new student("John Doe", "15-04-2000");
        student.displayStudentInfo();
    }
}
