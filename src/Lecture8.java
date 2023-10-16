import classes.Accomodations;
import classes.Hotel;

public class Lecture8 {
    public static void main (String[] args) {
        Hotel tourist = new Hotel ();
        tourist.name = "Turist";
        tourist.singleRooms = 10;
        tourist.doubleRooms = 30;
       // System.out.println (tourist.name + ": " +tourist.getCapacity ());
        Hotel hilton = new Hotel ();
        hilton.name = "Hilton";
        hilton.singleRooms = 100;
        hilton.doubleRooms = 100;
      //  System.out.println (hilton.name + ": " +hilton.getCapacity ());

        Hotel[] allHotels = new Hotel[] {tourist, hilton};
        Accomodations acc = new Accomodations ();
        acc.hotels = allHotels;
       // System.out.println (acc.totalCapacity ());
      //    acc.printAll();
        System.out.println (acc.findForNGroup (100).getPrintable ());
        System.out.println (acc.findForNGroup (100).getPrintable ());
        System.out.println (acc.findForNGroup (50).getPrintable ());
    }


}
