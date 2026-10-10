import java.util.*;
public class Main {
 public static <T extends Comparable<T>> T findMax(T[] array) {
 T maximum = array[0];
 for (int i = 1; i < array.length; i++) {
 if (array[i].compareTo(maximum) > 0) {
 maximum = array[i];
 }
 }
 return maximum;
 }
 public static void main(String[] args) {
 Integer[] integers = {10, 25, 8, 40, 15};
 Double[] doubles = {12.5, 45.8, 33.2, 67.1, 29.4};
 Character[] characters = {'A', 'M', 'Z', 'D', 'K'};
 String[] strings = {"Apple", "Mango", "Banana", "Zebra"};
 System.out.println("TEST CASE 1 - INTEGER VALUES");
 System.out.println("Elements: " + Arrays.toString(integers));
 System.out.println("Maximum Element = " + findMax(integers));
 System.out.println();
 System.out.println("TEST CASE 2 - DOUBLE VALUES");
 System.out.println("Elements: " + Arrays.toString(doubles));
 System.out.println("Maximum Element = " + findMax(doubles));
 System.out.println();
 System.out.println("TEST CASE 3 - CHARACTER VALUES");
 System.out.println("Elements: " + Arrays.toString(characters));
 System.out.println("Maximum Element = " + findMax(characters));
 System.out.println();
 System.out.println("TEST CASE 4 - STRING VALUES");
 System.out.println("Elements: " + Arrays.toString(strings));
 System.out.println("Maximum Element = " + findMax(strings));
 }
}
