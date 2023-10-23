import java.util.Arrays;

public class Row {
    public String getStudentName () {
        return studentName;
    }

    private String studentName;
  private  Integer[] grades;

  public Row(String studentName, int numberOfLessons){
      this.studentName = studentName;
      grades = new Integer[numberOfLessons];
  }
  public void giveGrade(int lessonNumber, Integer grade){
      grades[lessonNumber-1] = grade;

  }
public String printable(){
      return " " + studentName + Arrays.toString (grades);
}

}
