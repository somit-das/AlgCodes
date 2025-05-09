package Array.ContainsDuplicate;

public class ContainsDuplicate2 {
    public static boolean duplicateContain(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] sampleArray = { 3, 4, 5, 5 };

        System.out.println(duplicateContain(sampleArray));

    }
}
