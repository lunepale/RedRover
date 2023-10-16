package classes;

public class Hotel {
  public  int singleRooms;
  public  int doubleRooms;
  public  String name;
    public int getCapacity(){
        return singleRooms + doubleRooms*2;
    }
    public String getPrintable(){
        return "HOtel "+ name + " with capacity of "+ getCapacity ();
    }
}
