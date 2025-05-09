import java.util.Scanner;

public class HollowRectanglePattern1 {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Numbers for Row and Columns :-  ");
            int row = sc.nextInt();
            int column= sc.nextInt();

            for(int i = 1;i<=row;i++){
                for(int j = 1; j<=column;j++){
                    if(i==1 || i==row || j==1 ||j==column){ // a Boundary Condition checking at edge and junction point to print stars 
                        System.out.print(" * ");
                    }
                    else{
                        System.out.print("   "); // putting space in other places (inner areas)
                    }
                }
                System.out.println(); // for each new line
            }
        }
    }
}
