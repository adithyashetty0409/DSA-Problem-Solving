import java.util.*;

public class linear_search {

    public static int linearsearch(int numbers[], int key) {
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int numbers[] = {23, 45, 67, 8, 75, 4, 3, 44};
        int key = 67;

        int index = linearsearch(numbers, key);

        if(index == -1) {
            System.out.println("Key is not found");
        } else {
            System.out.println("Key is at the index: " + index);
        }
    }
}