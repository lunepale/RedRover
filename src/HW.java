public class HW {
    public static void main (String[] args) {
    printThreeWords();
        checkSumSign ();
        printColor ();
        compareNumber ();
    }


    public static void printThreeWords(){
        String[] slova = {"Orange", "Banana", "Apple"};
        for (int i = 0; i < slova.length ; i++) {
            System.out.println (slova[i]);
        }
    }

    public static void checkSumSign(){
        int a = 5;
        int b = 5;
        if (a+b >= 0){
            System.out.println ("Summa polojitelnaya");
        }else {
            System.out.println ("Summa otricatelnaya");
        }
       // return (a + b) >= 0 ? a + b + " Summa polojitelnaya" : a + b + "Summa otricatelnaya";
    }
    public static void printColor(){
      int value = 0;
        if ( value <= 0){
            System.out.println ("Krasnyi");
        } else if (value <= 100) {
            System.out.println ("Jeltyi");
        } else{
            System.out.println ("Zelenyi");
        }
    }
    public static void compareNumber(){
        int a = 5;
        int b = 5;
        if(a >= b){
            System.out.println ("a >= b");
        }else{
            System.out.println ("a < b");
        }
    }
}




