/*
 * Organisation: Hochschule Muenchen, Fakultaet 07
 * Project: Praktikum Softwareentwicklung 1 Frau Prof. Dr. Hammerschall, WS 2016/2017
 * Author: Sebastian Baumann, bauman21@hm.edu
 * Study group: IF3A
 * Date: 09. Dezember 2016
 * Purpose: Loesung Praktikumseinheit 06: Wagon
 * Software: Oracle Java SE JDK 1.8.0_101, Windows 10 x86_64
 * Hardware: Intel Core i5-6300 @ 2.40 GHz 2.50 GHz, 2 Cores, 4096 MB RAM
 */


public class Wagon {

    // Definition der benoetigten Variablen --------------------------------
    private int number = -1;    // Waggennnummer
    private Type type;          // speichert den Typ des Wagens
    private Wagon next;         // Pointer auf den naechsten Wagen


    // Konstruktoren -------------------------------------------------------
    // Custom-Konstruktor, der den Typ des Waggons je nach Parameter setzt
    Wagon(Type t) {

        this.type = t;      // Initialisiert den Typ dieses Wagen

    }


    // Methoden ------------------------------------------------------------
    // Liefert den Typ des Wagens
    Type getType() {

        return type;

    }

    // Setzt die Wagennummer neu
    void setNumber(int n) {

        this.number = n;

    }

    // Liefert den nachfolgenden Wagen zurueck
    Wagon getNext() {

        return next;

    }

    // Haengt den Wagen next an diesen Wagen an
    void setNext(Wagon wagon) {

        this.next = wagon;

    }

    // Liefert eine String-Repraesentation des Wagens in der Form <Nummer>,<Typname>,<Kapazitaet> zurueck
    public String toString() {

        return String.format("%d,%s,%d", this.number, this.getType().getName(), this.getType().getCapacity()) + "\n";

    }
}
