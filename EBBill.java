import java.util.Scanner;

public class EBBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String type;
        int units;
        double amount = 0;

        System.out.print("Enter Connection Type: ");
        type = sc.nextLine();

        System.out.print("Enter Units Consumed: ");
        units = sc.nextInt();

        if (type.equalsIgnoreCase("Domestic")) {

            if (units <= 100)
                amount = 0;
            else if (units <= 200)
                amount = (units - 100) * 2;
            else if (units <= 500)
                amount = 200 + (units - 200) * 4;
            else
                amount = 1400 + (units - 500) * 6;

        } else {

            if (units <= 100)
                amount = units * 2;
            else if (units <= 200)
                amount = 200 + (units - 100) * 4;
            else if (units <= 500)
                amount = 600 + (units - 200) * 6;
            else
                amount = 2400 + (units - 500) * 7;

        }

        System.out.println("Amount to be Paid: Rs. " + amount);

        sc.close();
    }
}
