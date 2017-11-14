package recursivefunction;

import java.util.Scanner;

public class RecursiveFunction {

    public static void main(String[] args) {

        
        System.out.println("Please enter the increment");    
        Scanner scan = new Scanner(System.in);
        int inc = scan.nextInt();
        System.out.println("Please enter the end point");
        int end = scan.nextInt();
        int sum = calculation(inc,0,0,end);
        System.out.println("The sum is "+sum);
       
    }
    public static int calculation(int inc,int count,int sum,int end){
        
        if (count>end){
            
            return sum;
        }
        else{
            sum = sum+count;
            count = count+inc;
            return calculation(inc,count,sum,end);
        }
    }
    }
    


