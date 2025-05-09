
public class LinearSearch1 {
    
    public static int linearSearch(int number[],int key){
        for(int i = 0 ; i< number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,9,10,12,14,16,18,20};
        int key = 12;
        int indexAt = linearSearch(numbers, key);
        if(indexAt> -1){
            System.out.println("Key Found at Index :- "+indexAt+" and at Position :- "+(indexAt+1));
        }
        else{
            System.out.println("No Key Found in Given Array");
        }
    }
}
