/**
 * Organisation: University of applied sciences Munich, faculty 07
 * Project: lab to class software developement 1 Mrs. Prof. Dr. Hammerschall, WS 2016/2017
 * Author: Sebastian Baumann, sebastian_baumann@gmx.net
 * Study group: IF3A
 * Date: 09. December 2016
 * Purpose: solution to lab Train
 */
public enum Type {

    /**
     * Enum to represent the engine of a train which has place for 1 person.
     */
    ENGINE(1, "engine"),

    /**
     * Enum to represent the dining wagon of a train which has place for 30 persons.
     */
    BISTRO(30, "bistro"),

    /**
     * Enum to represent a first class wagon of a train which has place for 20 persons.
     */
    FIRST(20, "first class"),

    /**
     * Enum to represent a second class wagon of a train which has place for 50 persons.
     */
    SECOND(50, "second class");

    /**
     * Private final variable to store the capacity of allowed persons in a certain wagon.
     */
    private final int capacity;

    /**
     * Private final variable to store the string representation of a certain wagon.
     */
    private final String name;

    /**
     * Constructor to generate a new wagon with a certain amount of persons allowed in it and a string as name.
     * @param capacity - certain amount of persons allowed in a wagon.
     * @param n - string representation of the type of a certain wagon.
     */
    Type(int capacity, String n) {

        this.capacity = capacity;
        this.name = n;

    }

    /**
     * Method to return the name of a certain wagon as a string.
     * @return - returns the name of a certain wagon as a sring.
     */
    public String getName() {

        return name;

    }

    /**
     * Method to return the capacity of a certain wagon.
     * @return - returns the capacity of a certain wagon as an integer value.
     */
    public int getCapacity() {

        return capacity;

    }
}