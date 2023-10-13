import java.util.Arrays;

public class Lecture6 {
    public static void main (String[] args) {
        int[][] arr1 = {{1,2,3},
        {11,22,33},
        {111,222,333}};

        System.out.println (Arrays.toString (arr1[0]));
        System.out.println (arr1[0][1]);
int max = Integer.MIN_VALUE;
    for (int i=0; i<arr1.length; i++){
        for (int j=0; j<arr1[i].length; j++){
            if (arr1[i][j]>max){
                max = arr1[i][j];
            }
            System.out.print (arr1[i][j]);
            System.out.print (", ");
        }
        System.out.println ();

    }System.out.println (max);
    }
}
