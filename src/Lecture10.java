public class Lecture10 {
    public static void main (String[] args) {
        SubjectRegister bio = new SubjectRegister (new String[]{
        "Ivanov",
        "Petrov",
        "Sidorov"}, 20);


       // System.out.println (bio.getNumberOfStudents ());
        bio.unlock ();
        bio.giveGrade ("Ivanov",1,new Grade (5));
        bio.giveGrade ("Ivanov",2,new Grade (7));
        bio.giveGrade ("Ivanov",3,new Grade (2));
        bio.giveGrade ("Sidorov",5,new Grade (-1));
        bio.giveGrade ("Petrov", 20,new Grade (0));
        bio.print ();

        System.out.println (bio.getFinalGrade ("Ivanov"));








}
}
