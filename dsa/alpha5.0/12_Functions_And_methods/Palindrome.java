import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Numbers ");
        System.out.print("X:- ");
        int num1 = sc.nextInt();
        System.out.print("Y:- ");
        int num2 = sc.nextInt();
        String result = isPalindrome(num1, num2)?"are Palindrome":"are not Palindrome";
        System.out.println(num1+ " "+num2 + " "+result);
    }
    public static Boolean  isPalindrome(int num1 , int num2){
        int rev1 = 0;
        int rev2 = 0;
        int rem1 = 0;
        int rem2 = 0;
        int n1 = num1;
        int n2 = num2;
        while(n1>0){
            rem1 = n1%10;
            rev1 = rev1*10+rem1;
            n1 = n1/10;
        }
        while(n2>0){
            rem2 = n2%10;
            rev2 = rev2*10+rem2;
            n2 = n2/10;
        }
        if(rev1 == num2 || rev2 == num1 ) return true;
        return false;
    }
}
