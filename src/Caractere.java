public class Caractere {


    private char unCar;

    /**
     * Constructeur
     *
     * @param unCar
     */
    public Caractere(char unCar) {
        this.unCar = unCar;
    }

    /**
     * Affiche le caractere dans la console
     */
    public void affiche() {
        System.out.print(unCar);
    }


    /**
     * Getter
     *
     * @return char
     */
    public char getUnCar() {
        return unCar;
    }

    /**
     * Setter
     *
     * @param unCar
     */
    public void setUnCar(char unCar) {
        this.unCar = unCar;
    }
}
