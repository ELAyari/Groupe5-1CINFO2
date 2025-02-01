public class MalekHamdi {

    public String inverserChaine(String chaine) {
        // Vérifier si la chaîne est nulle ou vide
        if (chaine == null || chaine.isEmpty()) {
            return chaine;
        }

        // Utiliser un StringBuilder pour inverser la chaîne
        StringBuilder sb = new StringBuilder(chaine);
        return sb.reverse().toString();
    }

    public double calculerPuissance(double base, int exposant) {
        // Cas où l'exposant est 0
        if (exposant == 0) {
            return 1;
        }

        // Cas où l'exposant est négatif
        if (exposant < 0) {
            base = 1 / base;
            exposant = -exposant;
        }

        double resultat = 1;
        for (int i = 0; i < exposant; i++) {
            resultat *= base;
        }

        return resultat;
    }
}
