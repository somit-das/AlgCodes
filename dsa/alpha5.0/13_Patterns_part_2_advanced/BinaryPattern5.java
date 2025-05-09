import java.util.Scanner;

public class BinaryPattern5 {
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Numbers for Row \nassuming same row and cols:-  ");
            int row = sc.nextInt();

            for(int i = 1;i<=row;i++){
                for(int j = 1; j<=i;j++){
                    if((i+j)%2==0){
                        System.out.print("1 "); // where i+j is even 
                    }
                    else{
                        System.out.print("0 "); // where i+j is odd 
                    }
                }
                System.out.println();
            }
    }

}
}
