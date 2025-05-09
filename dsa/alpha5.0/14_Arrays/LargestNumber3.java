
public class LargestNumber3 {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest :- "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 9, 10, 12, 14, 16, 18, 20 };
        int largest = getLargest(numbers);
        
        System.out.println("Largest :- "+largest);
    }
}
