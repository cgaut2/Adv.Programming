package divideby0;
import java.util.Scanner;
public class DivideBy0 {

    public static void main(String[] args) {
        int y = 10;
        System.out.println("What integer should we divide 10 by");
        try{
        Scanner scan = new Scanner (System.in);
        int x = scan.nextInt();
        y = y/x;
        System.out.println(y);
        }
        catch(ArithmeticException z){
            System.out.println("Dont divide by 0 "+ z);
        }
        
    }
}