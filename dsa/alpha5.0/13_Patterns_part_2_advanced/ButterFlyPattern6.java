import java.util.Scanner;

public class ButterFlyPattern6 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Numbers for Row \nassuming same row and cols:-  ");
            int row = sc.nextInt();
            // upperpart
            for(int i = 1 ; i<= row; i++){
                //for printing Left Side Stars
                for(int j = 1;j<=i ; j++){
                    System.out.print(" "+j+" ");
                }
                //for printing Spaces 
                for(int j = 1;j<=2*(row-i);j++){
                    System.out.print("   ");
                }
                //for printing Right Side Stars
                for(int j = 1;j<=i;j++){
                    System.out.print(" "+j+" ");
                }
                System.out.println();
            }
            //lower part
            for (int i = row; i >= 1; i--) {
                
                // for printing Left Side Stars
                for (int j = 1; j <= i; j++) {
                    System.out.print(" " + j + " ");
                }
                // for printing Spaces
                for (int j = 1; j <= 2 * (row - i); j++) {
                    System.out.print("   ");
                }
                // for printing Right Side Stars
                for (int j = 1; j <= i; j++) {
                    System.out.print(" " + j + " ");
                }
                System.out.println();
            }
        }
    }
}
