package lect1.ex2;

public class Shape {
    private int length;
    private long height;
    public double square;
    public Shape(){

    }


    public int getLength () {
        return length;
    }

    public void setLength (int length) {
        this.length = length;
    }

    public long getHeight () {
        return height;
    }

    public void setHeight (long height) {
        this.height = height;
    }

    public void viewShape(){
        System.out.println ("Height: " + height);
        System.out.println ("Length: " + length);
    }
}
