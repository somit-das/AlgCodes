import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Start Number ");
        int start = sc.nextInt();
        System.out.println("Enter End Number: ");
        int end = sc.nextInt();
        primeInRange(start, end);
    }
    public static Boolean isPrime(int n){
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primeInRange(int start, int end){
         if(start<2){
            start = 2;
         }
         for(;start <= end;start++ ){
            if(isPrime(start)){
                System.out.println(start + " is Prime Number");
            }
         }
    }
}
