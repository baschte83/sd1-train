/*
 * Organisation: Hochschule Muenchen, Fakultaet 07
 * Project: Praktikum Softwareentwicklung 1 Frau Prof. Dr. Hammerschall, WS 2016/2017
 * Author: Sebastian Baumann, bauman21@hm.edu
 * Study group: IF3A
 * Date: 09. Dezember 2016
 * Purpose: Loesung Praktikumseinheit 06: Train
 * Software: Oracle Java SE JDK 1.8.0_101, Windows 10 x86_64
 * Hardware: Intel Core i5-6300 @ 2.40 GHz 2.50 GHz, 2 Cores, 4096 MB RAM
 */

public class Train {

    /*
     * Hinweise:
     * - Eingabewerte muessen nicht auf Gueltigkeit getestet werden.
     * - Keiner der Methodenruempfe sollte laenger als 7 Zeilen sein (inkl. Klammern)
     */


    // Definition der benoetigten Variablen --------------------------------
    private final Wagon engine;     // speichert die Referenz auf die Lok des Zugs
    private final Wagon bistro;     // speichert die Referenz auf das Bistro des Zugs


    // Konstruktoren -------------------------------------------------------
    // Konstruktor initialisiert einen neuen Zug bestehend aus Lok und Bistro
    Train() {
        this(0, 0);
    }

    // Konstruktor initialisiert einen neuen Zug bestehend aus Lok, Bistro,
    // sowie first Wagen der ersten Klasse und secons Wagen der zweiten Klasse
    Train(int first, int second) {

        this.engine = new Wagon(Type.ENGINE);
        this.bistro = new Wagon(Type.BISTRO);

        // per add werden neue first-class-Wagen erzeugt. Der Anfang ist dabei
        // die Lok, das Ende ist der Bistrowagen
        add(engine, bistro, first, Type.FIRST);
        // per add werden neue second-class-Wagen erzeugt. Der Anfang ist dabei
        // der Bistrowagen, das Ende ist null, da der letzte second-class-Wagen
        // keinen Nachfolgerwagen mehr hat und daher auf null zeigen muss.
        add(bistro, null, second, Type.SECOND);

        // Jetzt muss die Nummerierung des Zugs aktualisiert werden
        setNumbers();

    }


    // Methoden ------------------------------------------------------------
    // Erweitert den Zug um first neue Wagen der ersten und second neue Wagen
    // der zweiten Klasse
    void extend(int first, int second) {

        // Die "first class"-Wagen werden zwischen der Lok und dem der Lok nachfolgenden Wagen eingefuegt
        add(this.engine, this.engine.getNext(), first, Type.FIRST);
        // Die "second class"-Wagen werden zwischen dem Bistro und dem dem Bistro nachfolgenden Wagen eingefuegt
        add(this.bistro, this.bistro.getNext(), second, Type.SECOND);
        // Aktualisierung der Zugnummerierung
        setNumbers();

    }

    // Verkuerzt den Zug um first Wagen der ersten und second Wagen der zweiten
    // Klasse, wenn moeglich, sonst um so viele wie vorhanden.
    void shorten(int first, int second) {
        /*
         * Zuerst wird nachgesehen, ob first uns second nicht negativ sind. Ist first oder second negativ,
         * so wird kein Wagen der ersten oder der zweiten Klasse entfernt. Ist first positiv oder 0, so wird
         * remove mit dem Anfangspunkt Lok und dem Endpunkt Bistro und dem Zahlenwert von first aufgerufen.
         * Ist second positiv oder 0, so wird remove mit dem Anfangspunkt Bistro und dem Endpunkt null und
         * dem Zahlenwert von second aufgerufen.
         */
        if (first >= 0 && this.engine.getNext() != this.bistro) {
            remove(this.engine, this.bistro, first);
        }

        if (second >= 0 && this.bistro.getNext() != null) {
            remove(this.bistro, null, second);
        }
        // Aktualisierung der Zugnummerierung
        setNumbers();

    }

    // Fuegt zwischen dem Wagen start und dem Wagen end number neue Wagen vom Typ type ein
    void add(Wagon start, Wagon end, int number, Type type) {
        /*
         * currentWagon repraesentiert den Wagen, auf den die Schleife aktuell zeigt.
         * Zuerst ist currentWagon der start-Wagen. In der Schleife wird mit setNext() ein
         * neuer Nachfolger zu currentWagon erzeugt und currentWagon damit verbunden.
         * Nachdem number neue Wagen erzeugt und miteinander verbunden worden sind,
         * wird nach der Schleife noch der letzte neu erzeugte Wagen mit dem end-Wagen
         * ueber setNext() verbunden.
         */
        Wagon currentWagon = start;
        for (int i = 0; i < number; i++) {
            currentWagon.setNext(new Wagon(type));
            currentWagon = currentWagon.getNext();
        }
        currentWagon.setNext(end);

    }

    // Entfernt zwischen dem Wagen start und dem Wagen end number Wagen,
    // falls vorhanden, sonst so viele, wie vorhanden sind.
    void remove(Wagon start, Wagon end, int number) {
        /*
         * currentWagon repraesentiert den Wagen, auf den die Schleife aktuell zeigt.
         * Um einen Wagen zu loeschen, wird der next-Zeiger des Wagens start auf den
         * naechsten nicht geloeschten Wagen gesetzt. Es werden aber nur Wagen geloescht,
         * solange noch Wagen zwischen start und end vorhanden sind. Wird waehrend dem
         * durchlaufen der Schleife festgestellt, dass der next-Zeiger des currentWagon
         * gleich dem Wagen end ist, so wird die Schleife verlassen. Es sind nun alle
         * Wagen zwischen start und end verschwunden.
         */
        Wagon currentWagon = start;
        int counter = number;
        while (currentWagon.getNext() != end && counter > 0) {
            currentWagon = currentWagon.getNext();
            counter--;
        }
        start.setNext(currentWagon.getNext());
        // Aktualisierung der Zugnummerierung
        setNumbers();

    }

    // Setzt die Nummerierung im Zug neu
    void setNumbers() {
        /*
         * currentWagon repraesentiert den Wagen, auf den die Schleife aktuell zeigt.
         * Um nun alle Wagen des Zugs neu zu nummerieren, wird ein counter eingefuehrt
         * und mit 1 initialisiert. Jedem currentWagon, beginnend bei der Lok, wird
         * als neue number der aktuelle Wert von counter zugewiesen. Anschliessend wird
         * der counter um 1 erhoeht und der currentWagon auf den naechsten Wagen des
         * Zuges gesetzt. Das geschieht so lange, bis der currentWagon null ist, also
         * bis es keinen currentWagon mehr gibt.
         */
        Wagon currentWagon = this.engine;
        int counter = 1;
        while (currentWagon != null) {

            currentWagon.setNumber(counter);
            counter++;
            currentWagon = currentWagon.getNext();

        }
    }

    // Gibt die aktuelle Reihenfolge des Zugs aus
    public String toString() {
        /*
         * currentWagon repraesentiert den Wagen, auf den die Schleife aktuell zeigt.
         * Um nun alle Wagen des Zugs auszugeben, wird ein neuer String train erzeugt
         * und mit "" initialisiert. Danach wird die Methode toString jedes currentWagens
         * aufgerufen (beginnend bei der Lok) und dem String train hinzugefuegt. Anschliessend
         * wird currentWagon auf den naechsten Wagen des Zuges gesetzt. Das geschieht so lange,
         * bis der currentWagon null ist, also bis es keinen currentWagon mehr gibt.
         */
        String train = "";
        Wagon currentWagon = this.engine;
        while (currentWagon != null) {

            train += currentWagon.toString();
            currentWagon = currentWagon.getNext();

        }

        return train;

    }
}
