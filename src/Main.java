/**
 * Organisation: University of applied sciences Munich, faculty 07
 * Project: lab to class software developement 1 Mrs. Prof. Dr. Hammerschall, WS 2016/2017
 * Author: Sebastian Baumann, sebastian_baumann@gmx.net
 * Study group: IF3A
 * Date: 09. December 2016
 * Purpose: solution to lab Train
 */
public class Main {

    /**
     * Main method with simple tests to test class Train, Type and Wagon.
     * @param args - variable number of arguments from the terminal.
     */
    public static void main(String[] args) {

        /*Train train = new Train();
        System.out.println("Test Train() sollt ergeben:\n1,engine,1\n2,bistro,30\n");
        System.out.println("Ist:\n" + train.toString());
        train.extend(2,0);
        System.out.println("Test extend(2,0) sollt ergeben:\n1,engine,1\n2,first class,20\n3,first class,20\n4,bistro,30\n");
        System.out.println("Ist:\n" + train.toString());
        train.extend(2,2);
        System.out.println("Test extend(2,2) sollt ergeben:\n1,engine,1\n2,first class,20\n3,first class,20\n4,first class,20\n5,first class,20\n6,bistro,30\n7,second class,50\n8,second class,50\n");
        System.out.println("Ist:\n" + train.toString());
        train.remove(train.getEngine(), train.getBistro(), 1);
        System.out.println("Test remove(train.getEngine(), train.getBistro(), 1) sollt ergeben:\n1,engine,1\n2,first class,20\n3,first class,20\n4,first class,20\n5,bistro,30\n6,second class,50\n7,second class,50\n");
        System.out.println("Ist:\n" + train.toString());
        train.remove(train.getEngine(), train.getBistro(), 1);
        System.out.println("Test remove(train.getEngine(), train.getBistro(), 1) sollte ergeben:\n1,engine,1\n2,first class,20\n3,first class,20\n4,bistro,30\n5,second class,50\n6,second class,50\n");
        System.out.println("Ist:\n" + train.toString());
        train.remove(train.getEngine(), train.getBistro(), 1);
        System.out.println("Test remove(train.getEngine(), train.getBistro(), 1) sollte ergeben:\n1,engine,1\n2,first class,20\n3,bistro,30\n4,second class,50\n5,second class,50\n");
        System.out.println("Ist:\n" + train.toString());
        train.remove(train.getEngine(), train.getBistro(), 1);
        System.out.println("Test remove(train.getEngine(), train.getBistro(), 1) sollte ergeben:\n1,engine,1\n3,bistro,30\n4,second class,50\n5,second class,50\n");
        System.out.println("Ist:\n" + train.toString());
        train.remove(train.getEngine(), train.getBistro(), 1);
        System.out.println("Test remove(train.getEngine(), train.getBistro(), 1) sollte ergeben:\n1,engine,1\n3,bistro,30\n4,second class,50\n5,second class,50\n");
        System.out.println("Ist:\n" + train.toString());*/

        /*Train train = new Train(5,5);
        System.out.println("Test Train(5,5) sollt ergeben:\n1,engine,1\n2,first class,20\n3,first class,20\n4,first class,20\n5,first class,20\n6,first class,20\n7,bistro,30\n8,second class,50\n9,second class,50\n10,second class,50\n11,second class,50\n12,second class,50\n");
        System.out.println("Ist:\n" + train.toString());
        train.remove(train.getEngine(), train.getBistro(), 2);
        System.out.println("Test remove(train.getEngine(), train.getBistro(), 2) sollt ergeben:\n1,engine,1\n2,first class,20\n3,first class,20\n4,first class,20\n5,bistro,30\n6,second class,50\n7,second class,50\n8,second class,50\n9,second class,50\n10,second class,50\n");
        System.out.println("Ist:\n" + train.toString());
        train.remove(train.getEngine(), train.getBistro(), 3);
        System.out.println("Test remove(train.getEngine(), train.getBistro(), 3) sollt ergeben:\n1,engine,1\n2,bistro,30\n3,second class,50\n4,second class,50\n5,second class,50\n6,second class,50\n7,second class,50\n");
        System.out.println("Ist:\n" + train.toString());
        train.remove(train.getEngine(), train.getBistro(), 3);
        System.out.println("Test remove(train.getEngine(), train.getBistro(), 3) sollt ergeben:\n1,engine,1\n2,bistro,30\n3,second class,50\n4,second class,50\n5,second class,50\n6,second class,50\n7,second class,50\n");
        System.out.println("Ist:\n" + train.toString());
        train.remove(train.getBistro(), train.getBistro().getNext().getNext(), 3);
        System.out.println("Test remove(train.getBistro(), train.getBistro().getNext().getNext(), 3) sollt ergeben:\n1,engine,1\n2,bistro,30\n3,second class,50\n4,second class,50\n5,second class,50\n6,second class,50\n");
        System.out.println("Ist:\n" + train.toString());
        train.remove(train.getBistro(), train.getBistro().getNext().getNext().getNext().getNext().getNext(), 4);
        System.out.println("Test remove(train.getBistro(), train.getBistro().getNext().getNext().getNext().getNext().getNext(), 4) sollt ergeben:\n1,engine,1\n2,bistro,30\n");
        System.out.println("Ist:\n" + train.toString());*/

        /*Train train = new Train(3,3);
        System.out.println("Test Train(3,3) sollt ergeben:\n1,engine,1\n2,first class,20\n3,first class,20\n4,first class,20\n5,bistro,30\n6,second class,50\n7,second class,50\n8,second class,50\n");
        System.out.println("Ist:\n" + train.toString());
        train.shorten(2,2);
        System.out.println("Test shorten(2,2) sollt ergeben:\n1,engine,1\n2,first class,20\n3,bistro,30\n4,second class,50\n");
        System.out.println("Ist:\n" + train.toString());*/

        Train train = new Train();
        System.out.println("Test Train() sollt ergeben:\n1,engine,1\n2,bistro,30\n");
        System.out.println(train);

        /*Wagon wagon = new Wagon(Type.BISTRO);
        System.out.println(wagon.toString());*/

    }
}
