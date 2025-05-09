import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
      System.out.print("Enter BinaryNum :- "); 
      int b_num = (int) new Scanner(System.in).nextInt();
      System.out.println("Binary Number is 0"+b_num);
      System.out.println("Correspoinding Decimal Num is "+convertBinaryToDecimal(b_num));
      // System.out.println("011 in Decimal :- "+convertBinaryToDecimal(011)); 
      
    }
    public static int convertBinaryToDecimal(int bin){
       int lastdigit = 0;
       int decimal = 0;
       int power = 0;
        
       while(bin>0){
         lastdigit = bin%10;
         decimal = decimal+ (lastdigit* (int)Math.pow(2, power));
         // System.out.println(decimal);
         power++;
         bin = bin/10;
       }
       return decimal;
    }
    
}
