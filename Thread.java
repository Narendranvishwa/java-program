class NumberGenerator extends Thread {
    public void run() {
        Random random = new Random();

        while (true) {
            int number = random.nextInt(100) + 1;

            System.out.println("\nGenerated Number: " + number);

            if (number % 2 == 0) {
                SquareThread square = new SquareThread(number);
                square.start();
            } else {
                CubeThread cube = new CubeThread(number);
                cube.start();
            }

            try {
                Thread.sleep(1000); // Wait for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Thread to calculate square of an even number
class SquareThread extends Thread {
    int number;

    SquareThread(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Square of " + number + " = " +
                (number * number));
    }
}

// Thread to calculate cube of an odd number
class CubeThread extends Thread {
    int number;

    CubeThread(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Cube of " + number + " = " +
                (number * number * number));
    }
}

// Main class
public class MultiThreadedNumberProcessing {
    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();
        generator.start();
    }
}
