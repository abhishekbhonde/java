package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class twod {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
        }

      /*  for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.println(arr[row][col] + " ");
            }
           System.out.println();
        }*/
        /*for (int row = 0; row < arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }*/
        for(int [] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
