import java.util.Scanner;

public class SpecialRightTriangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the type of special right triangle:");
        System.out.println("1. 30-60-90 Triangle");
        System.out.println("2. 45-45-90 Triangle");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Enter the known side:");
            System.out.println("1. Shorter leg");
            System.out.println("2. Longer leg");
            System.out.println("3. Hypotenuse");
            int option = scanner.nextInt();
            
            System.out.print("Enter the value: ");
            double value = scanner.nextDouble();
            
            if (option == 1) { // Given shorter leg
                System.out.println("Longer leg: " + value + "√3 ≈ " + (value * Math.sqrt(3)));
                System.out.println("Hypotenuse: " + value * 2);
            } else if (option == 2) { // Given longer leg
                System.out.println("Shorter leg: " + value + "/√3 ≈ " + (value / Math.sqrt(3)));
                System.out.println("Hypotenuse: " + ((value / Math.sqrt(3)) * 2));
            } else if (option == 3) { // Given hypotenuse
                System.out.println("Shorter leg: " + value + "/2 ≈ " + (value / 2));
                System.out.println("Longer leg: " + value + "√3/2 ≈ " + ((value / 2) * Math.sqrt(3)));
            } else {
                System.out.println("Invalid option.");
            }
        } else if (choice == 2) {
            System.out.println("Enter the known side:");
            System.out.println("1. Leg");
            System.out.println("2. Hypotenuse");
            int option = scanner.nextInt();
            
            System.out.print("Enter the value: ");
            double value = scanner.nextDouble();
            
            if (option == 1) { // Given leg
                System.out.println("Other leg: " + value);
                System.out.println("Hypotenuse: " + value + "√2 ≈ " + (value * Math.sqrt(2)));
            } else if (option == 2) { // Given hypotenuse
                System.out.println("Legs: " + value + "/√2 ≈ " + (value / Math.sqrt(2)));
            } else {
                System.out.println("Invalid option.");
            }
        } else {
            System.out.println("Invalid choice.");
        }
        
        scanner.close();
    }
}
