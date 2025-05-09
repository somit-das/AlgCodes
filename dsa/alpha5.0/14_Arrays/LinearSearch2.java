
public class LinearSearch2 {
    public static int linearSearch(String menu[], String key) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String menu[] = { "dosa", "panipuri", "biriyani", "upama", "noodles", "burger", "cake", "curd rice", "pao","pulao", "pizza" };
        String key = "cake";
        int indexAt = linearSearch(menu, key);
        if (indexAt > -1) {
            System.out.println("Key Found at Index :- " + indexAt + " and at Position :- " + (indexAt + 1));
        } else {
            System.out.println("No Key Found in Given Array");
        }
    }
}
