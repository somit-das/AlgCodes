public class PairsInArray {

    public static void printPairs(int numbers[]){
        System.out.println("PAIRS:- ");
        int tp=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + numbers[i] + "," + numbers[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs : "+tp);
    }
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 9, 10};
        printPairs(numbers);
    }

    // 6 nums :- 5+4+3+2+1  = n*(n-1)/2
}
