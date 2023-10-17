package classes;

public class Prison extends Housing{

  public int cells;
    public Prison(int id){
        super(id);
    }

    public int getCapacity(){
        return cells;
    }
    public String getPrintable(){
        return "im a prison for"+ getCapacity () +" inmates";
    }
}
