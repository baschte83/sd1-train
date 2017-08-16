/**
 * Organisation: University of applied sciences Munich, faculty 07
 * Project: lab to class software developement 1 Mrs. Prof. Dr. Hammerschall, WS 2016/2017
 * Author: Sebastian Baumann, sebastian_baumann@gmx.net
 * Study group: IF3A
 * Date: 09. December 2016
 * Purpose: solution to lab Train
 */
public class Train {

    /**
     * Private variable to store the reference to the engine of this Train object.
     */
    private final Wagon engine;

    /**
     * Private variable to store the reference to the dining wagon of this Train object.
     */
    private final Wagon bistro;


    /**
     * Default constructor of this Train object.
     * This constructor generates a train just with engine and dining wagon without any
     * wagons of first or second class. To do this, it uses the next constructor.
     */
    public Train() {
        this(0, 0);
    }

    // Konstruktor initialisiert einen neuen Zug bestehend aus Lok, Bistro,
    // sowie first Wagen der ersten Klasse und secons Wagen der zweiten Klasse

    /**
     * Constructor to generate a Train object which needs the amount of first and second class
     * wagons as parameters.
     * @param first - amount of first class wagons.
     * @param second - amount of second class wagons.
     */
    public Train(int first, int second) {

        this.engine = new Wagon(Type.ENGINE);
        this.bistro = new Wagon(Type.BISTRO);

        add(engine, bistro, first, Type.FIRST);
        add(bistro, null, second, Type.SECOND);

        // Now the numeration of the whole train has to be adjusted.
        setNumbers();

    }

    /**
     * Method to extend this Train object with first and second class wagons.
     * @param first - number of first class wagons which should be added.
     * @param second - number of second class wagons which should be added.
     */
    void extend(int first, int second) {

        add(this.engine, this.engine.getNext(), first, Type.FIRST);
        add(this.bistro, this.bistro.getNext(), second, Type.SECOND);

        // Now the numeration of the whole train has to be adjusted.
        setNumbers();

    }

    /**
     * Method to shorten this Train object by an amount of first and second class wagons.
     * @param first - number of first class wagons which should be added.
     * @param second - number of second class wagons which should be added.
     */
    void shorten(int first, int second) {

        if (first >= 0 && this.engine.getNext() != this.bistro) {
            remove(this.engine, this.bistro, first);
        }

        if (second >= 0 && this.bistro.getNext() != null) {
            remove(this.bistro, null, second);
        }

        // Now the numeration of the whole train has to be adjusted.
        setNumbers();

    }

    /**
     * Method to add an amount of wagons of a certain type between two wagons.
     * @param start - last wagon before the new added ones.
     * @param end - first wagon after the new added ones.
     * @param number - number of wagons which should be added.
     * @param type - type of the wagons which should be added.
     */
    void add(Wagon start, Wagon end, int number, Type type) {
        /*
         * currentWagon represents the wagon the loop points at the moment. First currentWagon
         * is the start of the train, what means it is the engine. The loop generates a new successor
         * wagon using the method setNext() and bonds it with the wagon currentWagon points to.
         * The loop does this 'number' times.
         */
        Wagon currentWagon = start;
        for (int i = 0; i < number; i++) {
            currentWagon.setNext(new Wagon(type));
            currentWagon = currentWagon.getNext();
        }
        currentWagon.setNext(end);

    }

    /**
     * Method to remove a certain amount of wagons between the start and end wagon.
     * @param start - the wagon after which wagons have to be removed.
     * @param end - the wagon before which wagons have to be removed.
     * @param number - amount of wagons which have to be removed.
     */
    void remove(Wagon start, Wagon end, int number) {
        /*
         * currentWagon is the wagon the loop points to at the moment. The Wagons are not
         * deleted, but the next pointers of the wagons is adjusted, so that the next pointer of
         * start wagon points to the end wagon and pointers to any wagon in between are lost.
         */
        Wagon currentWagon = start;
        int counter = number;
        while (currentWagon.getNext() != end && counter > 0) {
            currentWagon = currentWagon.getNext();
            counter--;
        }
        start.setNext(currentWagon.getNext());

        // Now the numeration of the whole train has to be adjusted.
        setNumbers();

    }

    /**
     * Method to adjust the numeration of the whole train.
     * This method iterates through the whole train and every wagon gets
     * number which corresponds its position in the train, beginning with
     * the engine by number 1.
     */
    void setNumbers() {
        Wagon currentWagon = this.engine;
        int counter = 1;
        while (currentWagon != null) {

            currentWagon.setNumber(counter);
            counter++;
            currentWagon = currentWagon.getNext();

        }
    }

    /**
     * Method to generate and return a string representation of the whole train.
     * @return - returns a string representation of the whole train.
     */
    public String toString() {
        String train = "";
        Wagon currentWagon = this.engine;
        while (currentWagon != null) {

            train += currentWagon.toString();
            currentWagon = currentWagon.getNext();

        }

        return train;

    }
}
