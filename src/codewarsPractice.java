public class codewarsPractice {
    public static void main (String[] args) {
       // evenOrOdd (-7);
        System.out.println (hexToDec ("1"));
    }

    public static String evenOrOdd (int number) {
       if(number %2 ==0){
           return "Even";}
        else{
            return "Odd";
        }
    }

    public static int findSmallestInt(int[] args){
        int small = 0;
        for (int i=0; i < args.length;i++){
            if(args[i] < small){
                small = args[i];
            }
        }return small;
    }

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum = 0;
        for (int num : arr1) {
            sum += num;
        }
        for (int num : arr2) {
            sum += num;
        }
        return sum;

}
   /* public static int[] makeNegative(final int x) {

        if (x < 0) {
            return x;
        } else {
            return -x;
        }*/

       /* public static int[] countPositivesSumNegatives(int[] input){
            if (input == null || input.length == 0) {
                return new int[]{};
            }

            int countPositives = 0;
            int sumNegatives = 0;

            for (int num : input) {
                if (num > 0) {
                    countPositives++;
                } else if (num < 0) {
                    sumNegatives += num;
                }
            }

            return new int[]{countPositives, sumNegatives};
        }
    }*/
      /* public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
           int volume1 = 0;
           int volume2 = 0;
           for (int i = 0; i < firstCuboid.length; i++) {
               volume1 = volume1 * firstCuboid[i];
           }
           for (int j = 0; j < secondCuboid.length; j++) {
               volume2 = volume2 * secondCuboid[j];
           }
           return (volume1 > volume2) ? volume1 - volume2 : volume2 - volume1;
       }*/

    public static int hexToDec(final String hexString) {
        //как написать если ты сраный кретин
        String digits = "0123456789ABCDEF";
        String  hex = hexString.toUpperCase();
        int decimalValue = 0;
        boolean isNegative = false;
        if(hex.charAt(0)=='-'){
            isNegative = true;
            for (int i = 1; i < hex.length(); i++) {
                char c = hex.charAt(i);
                int d = digits.indexOf(c);
                decimalValue = 16 * decimalValue + d;
        }}else{
            for (int i = 0; i < hex.length(); i++) {
                char c = hex.charAt(i);
                int d = digits.indexOf(c);
                decimalValue = 16 * decimalValue + d;  }
                }

        return isNegative ? -decimalValue : decimalValue;
        //как написать если ты умный
       // return Integer.parseInt(hexString, 16); И ВСЁ БЛЯТЬ
    }
}










