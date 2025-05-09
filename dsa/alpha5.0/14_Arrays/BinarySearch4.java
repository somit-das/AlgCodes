public class BinarySearch4 {
    
    public static int binarySearch(int number[],int key){
         
        int start = 0;
        int end = number.length-1;
        while(start<=end){

            int mid = (start+end) / 2;
            if(number[mid]==key){
                return mid;
            }
            else if(number[mid]<key){
                start = mid+1;
            }
            else if(number[mid]>key){
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 9, 10, 12, 14, 16, 18, 20 };
        int key = 18;
        int indexAt = binarySearch(numbers, key);
        if (indexAt > -1) {
            System.out.println("Key Found at Index :- " + indexAt + " and at Position :- " + (indexAt + 1));
        } else {
            System.out.println("No Key Found in Given Array");
        }


    }
}
