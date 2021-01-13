import java.util.Scanner;

public class UtilPile {

    public static void main(String args[]) {

        Scanner clavier = new Scanner(System.in);
        String valeur;

        /// CARACTERE ///
        Pile<Caractere> pile = new Pile<>();
        int taille = 0;

        System.out.println("Entrez un mot : ");
        valeur = clavier.nextLine();


        for (int i = 0; i <= valeur.length() - 1; i++) {
            pile.empliler(new Caractere(valeur.charAt(i)));
        }

        taille = pile.taillePile();
        System.out.println(pile.taillePile());
        for (int i = 0; i <= taille - 1; i++) {
            pile.depiler().affiche();
        }

        /// FIN CARACTERE ///

        /// POINT ///
        Pile<Point> pile2 = new Pile<>();
        pile2.empliler(new Point(1, 1));
        pile2.empliler(new Point(2, 2));
        pile2.empliler(new Point(3, 3));
        pile2.empliler(new Point(4, 4));
        pile2.empliler(new Point(5, 5));
        pile2.empliler(new Point(6, 6));
        pile2.empliler(new Point(7, 7));
        pile2.empliler(new Point(8, 8));
        pile2.empliler(new Point(9, 9));
        pile2.empliler(new Point(10, 10));
        int taille2 = pile2.taillePile();

        System.out.println("\nVoici la liste des objets instancies");
        for (int i = pile2.taillePile() - 1; i >= 0; i--) {
            pile2.getList().get(i).affiche();
        }

        System.out.println("");
        for (int i = 0; i <= taille2 - 1; i++) {
            pile2.depiler().affiche();
        }

        /// FIN POINT ///
    }
}
