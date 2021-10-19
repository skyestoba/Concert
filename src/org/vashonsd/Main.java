package org.vashonsd;

public class Main {

    /**
     * For now, use the main() method to print out the name of a show.
     * Create several Performers by giving them names and descriptions.
     * If you want a performer to have had one or more hit songs, use the performer's
     * .addHit() method along with the name of the hit.
     * Then print out the performers.
     */
    public static void main(String[] args) {

        Performer performer1 = new Performer("Super Jazz", "Real Jazzy");
        performer1.addHit("FreeForm Jazz: From Spoungebob");
        Performer performer2 = new Performer("Nationwide", "Jinggle");
        performer2.addHit("Nationwide Jinggle");
        Performer performer3 = new Performer("Spoungebob", "Yellow and Squishy");
        performer3.addHit("Goofy-Goober Rock");

//        System.out.println(performer1);
//        System.out.println(performer2);
//        System.out.println(performer3);

        Concert concert = new Concert("Sun Valley Music", "Festive Fun", "Nebraska");

        System.out.println(concert);
        System.out.println(performer1);
        System.out.println(performer2);
        System.out.println(performer3);
    }
}
