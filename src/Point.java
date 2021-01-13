public class Point {

    private int x;
    private int y;

    /**
     * Constructeur
     * @param x
     * @param y
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    /**
     * Getter X
     * @return
     */
    public int getX() {
        return x;
    }

    /**
     * Setter X
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Getter Y
     * @return
     */
    public int getY() {
        return y;
    }

    /**
     * Setter Y
     * @param y
     */
    public void setY(int y) {
        this.y = y;
    }


    /**
     * Affiche les coordonnées dans la console
     */
    public void affiche() {
        System.out.println("Je suis un point de coordonnees " + x + " " + y);
    }
}
