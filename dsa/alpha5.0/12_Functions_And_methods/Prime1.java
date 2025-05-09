import java.util.Scanner;

public class Prime1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        System.out.print("n:- ");
        int n = sc.nextInt();
        // first way (time :- n*n)
        String output1 = (isPrime(n)==true)?"is Prime Number":"is not Prime Number";
        System.out.println(n +" is "+output1);
        // second way 
        String output2 = (isPrimeOptimized(n)==true)?"is Prime Number":"is not Prime Number";
        System.out.println(n +" is "+output2);
    }

    public static Boolean isPrime(int n){
      
        if(n==1 || n==0) return false;
        // else if(n==2) return true;
        for(int i = 2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static Boolean isPrimeOptimized(int n){
        if(n==1 || n==0) return false;
        for(int i = 2; i<= Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
