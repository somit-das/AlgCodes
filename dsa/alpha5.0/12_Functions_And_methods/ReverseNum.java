import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        System.out.print("Enter Number :-");
        int num = new Scanner(System.in).nextInt();
        System.out.println("Reverse Num of : "+num+ " is :"+reverseNum(num));
    }
    public static int reverseNum(int num){
        int rev = 0;
        int rem = 0;
        while(num>0){
            rem = num%10;
            rev = rev*10+rem;
            num = num/10;
        }
        return rev;
    }
}
