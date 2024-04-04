package lect1.ex4;

public class Main {
    public static void main (String[] args) {
        Car car1 = new Car ("BMW", 200, 2007, 100);
        Car car2 = new Car ();
        System.out.println (car1.getMaxSpeed ());
        System.out.println (car1.getModel ());
        System.out.println (car1.getSpeed ());
        System.out.println (car1.getYear ());

        car1.setMaxSpeed (140);//вызываем метода класса Car через объект car1
        int speed = car1.getMaxSpeed ();
        System.out.println (speed);

        //вызываем метода класса Car через объект car2
        // car2.maxSpeed; // к приватным не имее доступа из других классов
        car2.setMaxSpeed (150);
        System.out.println (car2.getMaxSpeed ());
    }
}
