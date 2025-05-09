import java.util.Scanner;

public class DiamondPattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers for Row \nassuming upper row n and lower n-1:-  ");
        int row = sc.nextInt();
        // int row = 4;

        //Upper Part
        for(int i = 1;i<=row;i++){
            // Spaces
            for (int j = 1; j <= row - i; j++) {
                System.out.print("   ");
            }
            // Stars
            for (int j = 1; j <= 2*(i)-1; j++) {
                System.out.print(" * ");
            }
            // spaces //not needed
            // for (int j = 1; j <= row - i; j++) {
            //     System.out.print(" ");
            // }
            System.out.println();

        }
        // lower part
        for (int i = row-1; i >=1; i--) {
            // Spaces
            for (int j = 1; j <= row - i; j++) {
                System.out.print("   ");
            }
            // stars
            for (int j = 1; j <= 2 * (i) - 1; j++) {
                System.out.print(" * ");
            }
            
            System.out.println();

        }

    }
}
