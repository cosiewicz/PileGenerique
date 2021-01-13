import java.util.Scanner;

public class UtilPileEntiers {

    public static Pile<Integer> pile = new Pile<>();
    public static Scanner clavier = new Scanner(System.in);

    public static void main(String args[]) {

        String in = "";
        boolean estFini = false;

        while (!estFini) {
            afficheMenu();
            in = clavier.nextLine();

            switch (in) {
                case "1":
                    voirLaPile();
                    break;

                case "2":
                    emplier();
                    break;

                case "3":
                    depiler();
                    break;

                case "4":
                    info();

                    break;

                case "5":
                    estFini = true;

                    break;
            }
        }
    }

    /**
     * Affiche dans la console les valeurs dans la pile
     */
    public static void voirLaPile() {
        if (pile.pileVide()) {
            System.out.println("La pile est vide\n");
        } else {
            for (int i = 0; i <= pile.taillePile() - 1; i++) {
                System.out.println("------------");
                System.out.println(pile.getList().get(i));
            }
            System.out.println("------------\n");
        }
    }

    /**
     * Affiche dans la console le menu
     */
    public static void afficheMenu() {
        System.out.println("1. Voir la pile");
        System.out.println("2. Empiler");
        System.out.println("3. Depiler");
        System.out.println("4. Info sur la pile");
        System.out.println("5. Quitter");
        System.out.println("Que voulez vous faire? : ");
    }


    /**
     * Permet d'empiler une valeur
     */
    public static void emplier() {
        System.out.println("Entrez la valeur");
        try {
            int valeur = Integer.parseInt(clavier.nextLine());
            pile.empliler(valeur);
        } catch (Exception e) {
            System.out.println("Merci d'entrer une valeur...");
        }
    }

    /**
     * Permet d'empiler une valeur
     */
    public static void depiler() {
        if (pile.pileVide()) {
            System.out.println("La pile est vide...\n");
        } else {
            int valeur = pile.depiler();
            System.out.println("Vous avez dépilé la valeur " + valeur);
        }
    }

    /**
     * Information de la pile
     */
    public static void info() {
        if (pile.pileVide()) {
            System.out.println("La pîle est vide...");
        } else {
            System.out.println("La pile contient " + pile.taillePile() + " élément(s)");
        }
    }
}