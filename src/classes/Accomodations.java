package classes;

public class Accomodations {
   public Hotel[] hotels;

    public int totalCapacity(){
        int sum = 0;
        for (int i = 0; i < hotels.length; i++) {
            Hotel h = hotels[i];
            sum += h.getCapacity();
        }
        return sum; }

    public void printAll(){
        for (int i = 0; i < hotels.length ; i++) {
            Hotel h = hotels[i];
            System.out.println (h.getPrintable ());
        }

    }
public Hotel findForNGroup(int groupSize){
    for (int i = 0; i < hotels.length; i++) {
        Hotel h = hotels[i];
        if (h.getCapacity () >= groupSize){
            return h;
        }
    }return null;
}
}
