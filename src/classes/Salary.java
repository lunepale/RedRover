package classes;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Salary {


    public static int getSum(Employee[] employeeArray){
        int sum = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            sum += Employee.salary;
        }return sum;
    }
}
