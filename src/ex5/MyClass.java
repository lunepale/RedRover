package ex5;

import ex4.Car;

public class MyClass {
    public static void main (String[] args) {
        String st1 = null; // можно стрингу присвоить null
        Car car1 = null; // можно экземпляру класса присвоить null
//        int i = null;  //нельзя в примитивных тип впихнуть null

        String str2 = (String) null; // null поддаётся кастованию в другие типы
        Car car2 = (Car) null;

        System.out.println (null == null);  //true
        System.out.println (car1 == null); //true
//        System.out.println (str2.equals (null));     //NullPointerException

        car1.getMaxSpeed ();  //NullPointerException

    }
}