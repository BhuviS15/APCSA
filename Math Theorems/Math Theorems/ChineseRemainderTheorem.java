import java.util.Scanner;

public class ChineseRemainderTheorem {

    // Function to compute the modular inverse using the Extended Euclidean Algorithm
    static int modInverse(int a, int m) {
        int m0 = m, t, q;
        int x0 = 0, x1 = 1;

        if (m == 1)
            return 0;

        while (a > 1) {
            q = a / m;
            t = m;
            m = a % m;
            a = t;
            t = x0;
            x0 = x1 - q * x0;
            x1 = t;
        }

        if (x1 < 0)
            x1 += m0;

        return x1;
    }

    // Function to solve the system using the Chinese Remainder Theorem
    static int chineseRemainder(int[] a, int[] m, int n) {
        int product = 1;  // Compute the product of all moduli
        for (int i = 0; i < n; i++)
            product *= m[i];

        int result = 0;

        for (int i = 0; i < n; i++) {
            int Mi = product / m[i];  // Compute the partial product
            int inverse = modInverse(Mi, m[i]);  // Compute the modular inverse
            result += a[i] * Mi * inverse;
        }

        return result % product;  // Ensure result is the smallest non-negative solution
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of congruences
        System.out.print("Enter the number of equations: ");
        int n = scanner.nextInt();

        int[] a = new int[n];  // Array for remainders
        int[] m = new int[n];  // Array for moduli

        // Get user input for remainders and moduli
        for (int i = 0; i < n; i++) {
            System.out.print("Enter remainder a[" + (i + 1) + "]: ");
            a[i] = scanner.nextInt();
            System.out.print("Enter modulus m[" + (i + 1) + "]: ");
            m[i] = scanner.nextInt();
        }

        scanner.close(); // Close scanner

        // Compute and display the solution
        int result = chineseRemainder(a, m, n);
        System.out.println("The smallest x satisfying all equations is: " + result);
    }
}