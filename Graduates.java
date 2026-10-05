import java.math.BigDecimal;

public class Graduates extends Student1 {

    private final double taHours;
    private final double researchGrant;

    public Graduates(String studentName, int studentId, int marks, double taHours, double researchGrant) {
        super(studentName, studentId, marks);
        this.taHours = taHours;
        this.researchGrant = researchGrant;
    }

    @Override
    public BigDecimal calculateMonthlyStipend() {

        BigDecimal stipend = new BigDecimal("1200"); // base

        stipend = stipend.add(
            new BigDecimal("25").multiply(BigDecimal.valueOf(taHours))
        ); // TA pay

        stipend = stipend.add(
            BigDecimal.valueOf(researchGrant).divide(new BigDecimal("12"))
        ); // research grant

        return stipend;
    }

    public static void main(String[] args) {

        Student1 amina = new Graduates("Amina", 1, 10, 80, 1200);
        Student1 brian = new Graduates("Brian", 2, 20, 40,  1200);

        System.out.println(amina.getStudentName() + ": $"
            + amina.calculateMonthlyStipend().setScale(2));

        System.out.println(brian.getStudentName() + ": $"
            + brian.calculateMonthlyStipend().setScale(2));
    }
}
