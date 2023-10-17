package classes;

public class House extends Housing{
  public  String ownersName;
   public int bedrooms;
    public int getCapacity(){
        return bedrooms*2;
    }
    public House(int id, String ownersName, int bedrooms){
        super(id);
        this.ownersName = ownersName;
        this.bedrooms = bedrooms;
    }
    public String getPrintable(){
        return id +"."+ ownersName + "'s house with capacity of "+getCapacity ();
    }
}
