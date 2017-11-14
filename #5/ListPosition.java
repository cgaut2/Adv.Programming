
package listposition;

import java.util.ArrayList;
import java.util.Scanner;

public class ListPosition {




    public static void main(String[] args) {
    ArrayList<String> Colours = new ArrayList<>();
    Colours.add("green");
    Colours.add("blue");
    Colours.add("yellow");
    Colours.add("red");
    System.out.println("What are you trying to find");
    Scanner scan = new Scanner(System.in);
    boolean restart = true;
    while (restart){
        String position = scan.next();
        if (Colours.indexOf(position)== -1) {
            System.out.println("This does not appear in the list");
    }   
        else {
            System.out.println("It is position number "+Colours.indexOf(position));
    }
        System.out.println("Would you like to try again");
        String again = scan.next();
        if ("no".equals(again)){
            restart = false;
        }
    }
    

    }

    
}
