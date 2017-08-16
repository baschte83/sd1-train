/**
 * Organisation: University of applied sciences Munich, faculty 07
 * Project: lab to class software developement 1 Mrs. Prof. Dr. Hammerschall, WS 2016/2017
 * Author: Sebastian Baumann, sebastian_baumann@gmx.net
 * Study group: IF3A
 * Date: 09. December 2016
 * Purpose: solution to lab Train
 */
public class Wagon {

    /**
     * Private variable to store the number of this wagon object.
     */
    private int number = -1;

    /**
     * Private variable to store the type of this wagon object.
     */
    private Type type;

    /**
     * Private variable to store the successor of this wagon object.
     */
    private Wagon next;

    /**
     * Constructor of a wagon object which needs the type of the wagon to be generated as parameter.
     * @param t - the type of the wagon to be generated as an object of class Type.
     */
    Wagon(Type t) {

        this.type = t;

    }

    /**
     * Method to return the type of this wagon object.
     * @return - returns the type of this wagon object as an object of class Type.
     */
    Type getType() {

        return type;

    }

    /**
     * Method to set the number of this wagon object.
     * @param n - number this wagon object should have now.
     */
    void setNumber(int n) {

        this.number = n;

    }

    /**
     * Method to return the successor wagon of this wagon object.
     * @return - returns the successor of this wagon object as an object of class Wagon.
     */
    Wagon getNext() {

        return next;

    }

    /**
     * Method to set the successor of this wagon object.
     * @param wagon - new successor wagon the variable next of this wagon object should point to.
     */
    void setNext(Wagon wagon) {

        this.next = wagon;

    }

    // Liefert eine String-Repraesentation des Wagens in der Form <Nummer>,<Typname>,<Kapazitaet> zurueck

    /**
     * Method to generate and return a string representation of this wagon object.
     * The String representation looks like this: number,type,name
     * @return - returns a string representation of this wagon object.
     */
    public String toString() {

        return String.format("%d,%s,%d", this.number, this.getType().getName(), this.getType().getCapacity()) + "\n";

    }
}
