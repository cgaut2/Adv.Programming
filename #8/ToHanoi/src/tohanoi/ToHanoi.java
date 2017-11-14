package tohanoi;


import java.lang.Math;
import java.util.ArrayList;
import java.util.Scanner;

public class ToHanoi {

    public static void main(String[] args) {
      ArrayList<Integer> A = new ArrayList ();
      
       ArrayList<Integer> B = new ArrayList ();
       ArrayList<Integer> C = new ArrayList ();
        System.out.println("Please enter the amount of disks");    
        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt();
        for (int x = 1;x<=amount;x++){
            A.add(x);
        }
        System.out.println(A);
        int minimum = move(amount,A,B,C);
        System.out.println(minimum);
        
       
        
    }
public static int move (int n, ArrayList<Integer>source, ArrayList<Integer>target,  ArrayList<Integer> aux){
    if (n>0){
        
        move(n - 1, source, aux, target);
        target.add(source.remove(source.size() - 1));
        move(n - 1, aux, target, source);
        
    }
    return(int) (Math.pow(2,n)-1);
    }
    
}

