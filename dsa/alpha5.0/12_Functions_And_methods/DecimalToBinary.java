import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.print("Enter Decimal Number :- "); 
        int d_num = (int) new Scanner(System.in).nextInt();
        System.out.println("Decimal Number is  "+d_num);
        System.out.println("Correspoinding Binary Num is 0"+convertDecimalToBinary(d_num));
        // System.out.println("011 in Decimal :- "+convertBinaryToDecimal(011)); 
      

    }
    public static int convertDecimalToBinary(int decimal){
        int binary = 0;
        int rem = 0;
        int power = 0;
        while(decimal>0){
            rem = decimal % 2;
            
            binary = binary+rem*(int)Math.pow(10, power);
            power++;
            decimal = decimal/2;
        }
        return binary;
    }
}
