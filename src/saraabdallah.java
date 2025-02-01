public class saraabdallah {
        // Vérifier si une chaîne est un palindrome
        public static boolean isPalindrome(String str) {
            str = str.replaceAll("\\s+", "").toLowerCase(); // Supprimer les espaces et mettre en minuscules
            int left = 0, right = str.length() - 1;
            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }

        // Rechercher l’élément maximal dans un tableau
        public static int findMax(int[] array) {
            if (array.length == 0) {
                throw new IllegalArgumentException("Le tableau est vide");
            }
            int max = array[0];
            for (int num : array) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        }

        // Concaténer deux tableaux
        public static int[] concatenateArrays(int[] array1, int[] array2) {
            int[] result = new int[array1.length + array2.length];
            System.arraycopy(array1, 0, result, 0, array1.length);
            System.arraycopy(array2, 0, result, array1.length, array2.length);
            return result;
        }

        public static void main(String[] args) {
            // Test du palindrome
            String testPalindrome = "radar";
            System.out.println(testPalindrome + " est un palindrome ? " + isPalindrome(testPalindrome));

            // Test de la recherche du max
            int[] numbers = {1, 5, 8, 2, 9, 3};
            System.out.println("L'élément maximal est : " + findMax(numbers));

            // Test de la concaténation des tableaux
            int[] array1 = {1, 2, 3};
            int[] array2 = {4, 5, 6};
            int[] concatenated = concatenateArrays(array1, array2);
            System.out.print("Tableau concaténé : ");
            for (int num : concatenated) {
                System.out.print(num + " ");
            }
        }
    }

