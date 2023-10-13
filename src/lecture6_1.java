public class lecture6_1 {
    public static int sum (int a, int b) {
        int c = a + b;
        return c;
    }

    public static void printText (String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println (text);
        }
    }

    public static void main (String[] args) {
        String s = "vladyslav";
        printText (s, 3);
        System.out.println (sum (7, 15));
    }

    public static void evenOrOdd (int number) {
        if(number%2 == 0){
    System.out.println ("Even");}
    else{
        System.out.println ("Odd");
    }

}
    }



