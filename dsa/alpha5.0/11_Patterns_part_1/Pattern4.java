public class Pattern4 {
    public static void main(String[] args) {
        System.out.print("\nEnter Lines :- ");

        int numLine = new java.util.Scanner(System.in).nextInt();

        System.out.println("Line :- " + numLine);
        char charact='A';
        for( int line = 1 ; line<= numLine; line++){
            for( int print = 1; print <=line;print++ ){
                System.out.print(" "+charact+" ");
                charact++;
            }
            System.out.println("\n");
        }
    }
}
