import java.math.BigDecimal;

public abstract class Student1 {
   private String studentName;
   private int studentId;

   protected Student1(String studentName, int studentId) {
         this .studentName =studentName;
         this.studentId=studentId;

   }
   public String getStudentName() {
      return studentName;
   }
   public int getStudentId() {
      return studentId;
   }
   public abstract BigDecimal calculateMonthlyStipend();

}
