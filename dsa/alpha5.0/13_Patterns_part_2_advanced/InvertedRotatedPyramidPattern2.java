import java.util.Scanner;

public class InvertedRotatedPyramidPattern2 {
    public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Numbers for Row and Columns  assuming same row and cols:-  ");
            int row = sc.nextInt();
            // int columns = row; //no use

            for(int i = 1;i<=row;i++){
                // spaces
                
                for(int j = 1;j<=row-i;j++){
                    System.out.print("   ");
                }
                // for stars
                for(int j = 1;j<=i;j++){
                    System.out.print(" * ");
                }
                System.out.println();
            }

          }
    }
}
