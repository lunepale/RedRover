package classes;

public class Employee {
    public String name;
    public String gender;
    public int age;
    public static int salary;

    public  boolean isSameName(Employee otherEmployee){
return this.name.equals (otherEmployee.name);
    }
}
