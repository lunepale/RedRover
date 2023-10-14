package classes;

public class soldo {
    public static void main(String[] args) {
        int lancers = 120;
        int doppelsoldner = 30;
        int leut = 2;
        int capitan = 1;
        int baseSalary = 4;

        System.out.println(lancers*baseSalary+
                doppelsoldner*2*baseSalary
                +leut*10*baseSalary
                +capitan*100*baseSalary);
    }
}
