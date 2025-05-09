public class Pattern1 {
    public static void main(String[] args) {
        System.out.print("\nEnter Lines :- ");

        int numLine = new java.util.Scanner(System.in).nextInt();
      
        System.out.println("Line :- "+ numLine);

        for( int line = 1; line <= numLine; line++){
            for(int star = 1;star<= line;star++){
                System.out.print(" * ");
            }
            System.out.println("\n");
        }
    }
}
