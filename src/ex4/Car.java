package ex4;

public class Car {

    private String model;
    private int maxSpeed;
    private int year;
    private int speed;

    public Car(){   //создаем конструктор без параметров

    }

    public Car(String model, int maxSpeed, int year, int speed){ //создаем конструктор с 4 параметрами
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.speed = speed;
    }

    public int getMaxSpeed () {return maxSpeed;} // геттер для приватного поля

    public void setMaxSpeed(int maxSpeed) {this.maxSpeed = maxSpeed;} // сеттер для приватного поля

    public String getModel () {
        return model;
    }

    public int getYear () {
        return year;
    }

    public int getSpeed () {
        return speed;
    }
}
