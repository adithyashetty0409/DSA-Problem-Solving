import java.util.*;
public class largest_element {
    public static int largest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]) {
                largest = numbers[i];
            }

                if(smallest>numbers[i]) {
                         smallest = numbers[i];
                }
            }
            System.out.println("Smallest value is: " + smallest);
            return largest;
        }
        public static void main(String[] args) {
            int numbers[] = {33,5,6,7,4,6,3,6};
            System.out.println("Largest value is: " + largest(numbers));
        }
    }

