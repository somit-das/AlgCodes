import java.util.Scanner;

public class Binomial1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        System.out.print("n:- ");
        int n = sc.nextInt();
        System.out.print("r:- ");
        int r = sc.nextInt();

        double bc = binomialCoefficient(n, r);
        System.out.println("Binomial Coefficient :- "+bc);
    }
    public static int factorial(int num){
        int fact = 1;
        for(int i = 1; i<=num; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static double binomialCoefficient(int n,int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);

        int fact_n_r = factorial(n-r);

        return fact_n/(fact_r*fact_n_r);
    }
}
