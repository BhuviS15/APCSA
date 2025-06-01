import java.util.Scanner;

public class PolygonAngles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for number of sides
        System.out.print("Enter the number of sides (n) of the polygon: ");
        int n = scanner.nextInt();

        if (n < 3) {
            System.out.println("A polygon must have at least 3 sides.");
        } else {
            // Calculate angles
            double sumInteriorAngles = (n - 2) * 180.0;
            double eachInteriorAngle = sumInteriorAngles / n;
            double eachExteriorAngle = 360.0 / n;

            // Display results
            System.out.println("\nPolygon Angle Data:");
            System.out.println("Sum of Interior Angles: " + sumInteriorAngles + " degrees");
            System.out.println("Each Interior Angle (for regular polygon): " + eachInteriorAngle + " degrees");
            System.out.println("Each Exterior Angle (for regular polygon): " + eachExteriorAngle + " degrees");
            System.out.println("Sum of Exterior Angles: 360 degrees");
        }

        scanner.close();
    }
}