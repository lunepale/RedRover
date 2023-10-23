public class Lecture10 {
    public static void main (String[] args) {
        SubjectRegister bio = new SubjectRegister (new String[]{
        "Ivanov",
        "Petrov",
        "Sidorov"}, 20);


       // System.out.println (bio.getNumberOfStudents ());
        bio.giveGrade ("Ivanov",1,4);
        bio.unlock ();
        bio.giveGrade ("Sidorov",5,2);
        bio.print ();









}
}
