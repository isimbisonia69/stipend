import java.math.BigDecimal;

public class Undergraduates extends Student1 {

    private final double gpa;

    public Undergraduates(String studentName, int studentId, int marks, double gpa) {
        super(studentName, studentId, marks);
        this.gpa = gpa;
    }

    @Override
    public BigDecimal calculateMonthlyStipend() {
        BigDecimal stipend = new BigDecimal("500");
        if (gpa > 3.5) {
            stipend = stipend.add(new BigDecimal("150"));
        }
        return stipend;
    }

    public static void main(String[] args) {
        Student1 amina = new Undergraduates("Amina", 1, 80, 3.8);
        Student1 brian = new Undergraduates("Brian", 2, 70, 3.5);

        System.out.println(amina.getStudentName() + ": $"
                + amina.calculateMonthlyStipend().setScale(2));
        System.out.println(brian.getStudentName() + ": $"
                + brian.calculateMonthlyStipend().setScale(2));
    }
}