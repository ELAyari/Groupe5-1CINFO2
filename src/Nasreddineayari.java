public class Nasreddineayari {

    // 14. Calculer la racine carrée d’un nombre
    public static double calculerRacineCarree(double nombre) {
        return Math.sqrt(nombre);
    }

    // 15. Convertir une chaine en majuscule
    public static String convertirEnMajuscule(String chaine) {
        return chaine.toUpperCase();
    }

    // 16. Calculer la longueur d’une chaine
    public static int calculerLongueurChaine(String chaine) {
        return chaine.length();
    }

    public static void main(String[] args) {
        double nombre = 25;
        String chaine = "Bonjour";

        System.out.println("Racine carrée de " + nombre + " : " + calculerRacineCarree(nombre));
        System.out.println("Chaine en majuscule : " + convertirEnMajuscule(chaine));
        System.out.println("Longueur de la chaine : " + calculerLongueurChaine(chaine));
    }
}
