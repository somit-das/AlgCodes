import java.util.Scanner;

public class InvertedHalfPyramidPattern3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Numbers for Row \nassuming same row and cols:-  ");
            int row = sc.nextInt();
            // int columns = row; //no use
            for (int i = 1; i <= row; i++) {
               
                for (int j = 1; j <= row - i + 1; j++) {
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }
    }
}
