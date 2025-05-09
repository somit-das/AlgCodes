import java.util.Scanner;

public class SolidRhombusPattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers for Row \nassuming same row and cols:-  ");
        int row = sc.nextInt();
        for(int i = 1;i<=row;i++){
            //spaces
            for(int j=1;j<=row-i;j++){
                System.out.print("  ");
            }
            //stars
            for(int j=1;j<=row;j++){  // previous pattern no2 where i used a condition j<=i for printing star that depending on i but here to make rhombus like structure we have to 
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
