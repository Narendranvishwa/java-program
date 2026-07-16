import java.util.ArrayList;

public class CityOperations {
    public static void main(String[] args) {

        // TEST CASE 1 - APPEND OPERATION
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Chennai");
        list1.add("Madurai");
        list1.add("Trichy");
        list1.add("Coimbatore");

        System.out.println("TEST CASE 1 - APPEND OPERATION");
        System.out.println("Updated List: " + list1);

        // TEST CASE 2 - INSERT AT INDEX
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Chennai");
        list2.add("Madurai");
        list2.add("Trichy");
        list2.add(1, "Salem");

        System.out.println("\nTEST CASE 2 - INSERT AT INDEX");
        System.out.println("Updated List: " + list2);

        // TEST CASE 3 - SEARCH OPERATION
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Chennai");
        list3.add("Madurai");
        list3.add("Trichy");
        list3.add("Coimbatore");

        int index = list3.indexOf("Madurai");

        System.out.println("\nTEST CASE 3 - SEARCH OPERATION");
        if (index != -1) {
            System.out.println("City Found at Index: " + index);
        } else {
            System.out.println("City Not Found");
        }

        // TEST CASE 4 - DISPLAY CITIES STARTING WITH C
        ArrayList<String> list4 = new ArrayList<>();
        list4.add("Chennai");
        list4.add("Coimbatore");
        list4.add("Madurai");
        list4.add("Cuddalore");

        char letter = 'C';

        System.out.println("\nTEST CASE 4 - DISPLAY CITIES STARTING WITH C");
        System.out.print("Cities Starting with C: ");

        for (String city : list4) {
            if (city.startsWith(String.valueOf(letter))) {
                System.out.print(city + " ");
            }
        }

        System.out.println();
        System.out.println("=== Code Execution Successful ===");
    }
}
