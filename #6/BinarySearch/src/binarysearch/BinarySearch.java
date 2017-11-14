package binarysearch;

import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       double[] array = {2,5,8,13,18};
       boolean agian = true;
       while (agian == true){
       System.out.println("What number?");
       int number = scan.nextInt();
       boolean binary = seacrh(array,number);
       if (binary == true){
           System.out.println("This is in the array");
           agian = false;
       }
       if (binary == false){
           System.out.println("This isnt in the array, try again");
           
       }
       
       }
    }

    private static boolean seacrh(double[] array,int b) {
          if (array.length == 0) {
            return false;
        }
        int low = 0;
        int high = array.length-1;

        while(low <= high ) {
            int middle = (low+high) /2;
            if (b> array[middle] ){
                low = middle +1;
            } else if (b< array[middle]){
                high = middle -1;
            } else { // The element has been found
                return true;
                }
        
    }
        return false;
         
}
}