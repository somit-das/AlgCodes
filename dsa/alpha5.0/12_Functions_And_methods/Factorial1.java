import java.util.*;
public class Factorial1{
    public static void main(String[] args){
    System.out.print("Enter Number :- ");
    int a = new Scanner(System.in).nextInt();
    System.out.println("Number is "+a);
    System.out.println("It's Factorial is "+factorial(a));
}
public static int factorial(int num){
    int fact=1;
    for(int i = 1; i <=num; i++){
        fact = fact*i;
        
    }
    return fact;
}
}