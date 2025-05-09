import java.util.Scanner;

public class HollowRhombusPattern8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers for Row \nassuming same row and cols:-  ");
        int row = sc.nextInt();

        for(int i = 1;i<=row;i++){
            //spaces
            for(int j = 1; j<=row-i;j++){
                System.out.print("  ");
            }
            //stars
            for(int j = 1; j<=row;j++){
                if(i==1||j==1||j==row||i==row){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
            
        }
       
    }
}
