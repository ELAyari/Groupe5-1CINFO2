public class Wael {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; // Example array

        int sum = calculateSum(numbers);
        double average = calculateAverage(numbers);

        System.out.println("Somme du tableau : " + sum);
        System.out.println("Moyenne du tableau : " + average);
    }

    // Méthode pour calculer la somme
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // Méthode pour calculer la moyenne
    public static double calculateAverage(int[] array) {
        if (array.length == 0) return 0; // Éviter la division par zéro
        int sum = calculateSum(array); // Appel de la méthode calculateSum
        return (double) sum / array.length;
    }
}
