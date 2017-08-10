/*
 * Organisation: Hochschule Muenchen, Fakultaet 07
 * Project: Praktikum Softwareentwicklung 1 Frau Prof. Dr. Hammerschall, WS 2016/2017
 * Author: Sebastian Baumann, bauman21@hm.edu
 * Study group: IF3A
 * Date: 09. Dezember 2016
 * Purpose: Loesung Praktikumseinheit 06: Type
 * Software: Oracle Java SE JDK 1.8.0_101, Windows 10 x86_64
 * Hardware: Intel Core i5-6300 @ 2.40 GHz 2.50 GHz, 2 Cores, 4096 MB RAM
 */

public enum Type {

    // Definition der benoetigten Objektvariablen --------------------------
    ENGINE(1, "engine"),            // Typ fuer eine Lok, fasst 1 Person
    BISTRO(30, "bistro"),           // Typ fuer ein Bistro, fasst 30 Personen
    FIRST(20, "first class"),       // Typ fuer einen Wagen der ersten Klasse, fasst 20 Personen
    SECOND(50, "second class");     // Typ fuer einen Wagen der zweiten Klasse, fasst 50 Personen

    private final int capacity;     // Anzahl erlaubter Personen
    private final String name;      // Repraesentiert den Namen des Typs


    // Konstruktoren -------------------------------------------------------
    // Mit diesem Konstruktor wird die capacity passend zum Typ des
    // Zug-Elements gesetzt.
    Type(int capacity, String n) {

        this.capacity = capacity;
        this.name = n;

    }

    // Methoden ------------------------------------------------------------
    // Gibt den Namen des Typs als String aus
    public String getName() {

        return name;

    }

    // Gibt die anzahl erlaubter Personen eines Wagen-Typs aus
    public int getCapacity() {

        return capacity;

    }
}

