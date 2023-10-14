public class codewarsPractice {
    public static void main (String[] args) {
        evenOrOdd (-7);
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

    }







