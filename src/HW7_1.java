import classes.Employee;
import classes.Person;
import classes.Salary;

public class HW7_1 {

       public static void main (String[] args) {
           System.out.println (Person.getName("Vlad","female",26));
          Employee employee1 = new Employee ();
          employee1.name="Vlad";
          employee1.gender="male";
          employee1.age=26;
          employee1.salary=1000;

           Employee employee2 = new Employee ();
           employee2.name="Vlad";
           employee2.gender="male";
           employee2.age=26;
           employee2.salary=1000;
           System.out.println (employee1.isSameName (employee2));
           Employee[] employees = new Employee[] {employee1, employee2};
           System.out.println (Salary.getSum (employees));

    }
}