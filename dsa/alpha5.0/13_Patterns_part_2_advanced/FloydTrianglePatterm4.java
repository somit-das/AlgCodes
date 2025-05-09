import java.util.Scanner;

public class FloydTrianglePatterm4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Numbers for Row \nassuming same row and cols:-  ");
            int row = sc.nextInt();
            // int columns = row; //no use
            int count = 1;
            for(int i = 1; i<=row ; i++){
                
                for (int j = 1;j<=i;j++){
                    System.out.print(count+" ");
                    count++;
                }
                System.out.println();
            }
        }
    }
}
