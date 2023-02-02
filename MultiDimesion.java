import java.util.Arrays;
import java.util.Scanner;
public class MultiDimesion {
    public static void main(String[] args) {
//        1 2 3
//        4 5 6
//        7 8 9
        Scanner in = new Scanner (System.in);
        //int[][] arr = new int[3][];
           //or
        int[][] arr = new int[4][3];
        System.out.println(arr.length); //no of rows

        //input

        for (int row = 0; row < arr.length; row++) {
            //for each col in every row
            for(int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        //output
//        for (int row = 0; row < arr.length; row++) {
//            //for each col in every row
//            for(int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            System.out.println(arr[row]);
//            }
///         //output enchanced for loop
            for(int row=0; row<arr.length; row++) {
                System.out.println(Arrays.toString(arr[row]));
        }
    }
}
