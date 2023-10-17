import classes.*;

public class Lecture8 {
    public static void main (String[] args) {
        Hotel tourist = new Hotel (1);
        tourist.name = "Turist";
                tourist.singleRooms = 10;
        tourist.doubleRooms = 30;
       // System.out.println (tourist.name + ": " +tourist.getCapacity ());
        Hotel hilton = new Hotel (2);
        hilton.name = "Hilton";
        hilton.singleRooms = 100;
        hilton.doubleRooms = 100;
      //  System.out.println (hilton.name + ": " +hilton.getCapacity ());

        House jacks = new House(15, "Jack", 10);


        Prison singSing = new Prison(10);
        singSing.cells=100;

        Accomodations acc = new Accomodations ();
        acc.housings = new Housing[] {tourist, hilton, jacks};
       // System.out.println (acc.totalCapacity ());
      //    acc.printAll();
        System.out.println (acc.findForNGroup (100).getPrintable ());
        System.out.println (acc.findForNGroup (100).getPrintable ());
        System.out.println (acc.findForNGroup (50).getPrintable ());
    acc.printAll ();
    }


}
