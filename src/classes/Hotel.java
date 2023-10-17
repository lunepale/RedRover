package classes;

public class Hotel extends Housing {
  public  int singleRooms;
  public  int doubleRooms;
  public  String name;
  public Hotel(int id){
      super(id);
  }
  public int getCapacity(){
        return singleRooms + doubleRooms*2;
    }
    public String getPrintable(){
        return id +"."+ "HOtel "+ name + " with capacity of "+ getCapacity ();
    }
}
