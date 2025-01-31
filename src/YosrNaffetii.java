import java.util.Scanner;

public class YosrNaffetii {
    // Méthode récursive pour calculer la factorielle
    public static long factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    // Méthode itérative pour calculer la factorielle
    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Méthode pour vérifier si un nombre est pair
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // Méthode pour vérifier si un nombre est premier
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre entier : ");
        int number = scanner.nextInt();

        System.out.println("Factorielle de " + number + " (récursif) : " + factorialRecursive(number));
        System.out.println("Factorielle de " + number + " (itératif) : " + factorialIterative(number));
        System.out.println("Le nombre " + number + " est " + (isEven(number) ? "pair" : "impair"));
        System.out.println("Le nombre " + number + " est " + (isPrime(number) ? "premier" : "non premier"));

        scanner.close();
    }
}