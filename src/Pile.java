import java.util.LinkedList;

/**
 * Classe générique représentant une pile
 * @param <T>
 */
public class Pile<T> {

    private LinkedList<T> list;


    /**
     * Constructeur
     */
    public Pile() {
        list = new LinkedList<>();
    }


    /**
     * Ajoute à la pile
     * @param valeur
     */
    public void empliler(T valeur) {
        list.addFirst(valeur);
    }

    /**
     * Depile le <T> la plus haut de la pile
     * @return
     */
    public T depiler() {
        T valeur = list.getFirst();
        list.remove();
        return valeur;
    }


    /**
     * renvoi si la pile est vide ou non
     * @return boolean
     */
    public boolean pileVide() {
        return list.isEmpty();
    }

    /**
     * renvoi la taille de la pile
     * @return taille de la pile
     */
    public int taillePile() {
        return list.size();
    }

    /**
     * renvoi l'objet linkedList
     * @return list
     */
    public LinkedList<T> getList() {
        return list;
    }
}
