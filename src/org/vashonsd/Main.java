package org.vashonsd;

public class Main {

    public static void main(String[] args) {
        Performer gordy = new Performer("Gordy Ryan",
                "The legend of hot rhythms"
        );
        gordy.addHit("Owayoayo");
        gordy.addHit("Big Mambo Mama");
        System.out.println(gordy);
        Performer andre = new Performer("Andre 3000",
                "Tha kid from around tha block");
        andre.addHit("Hey Ya");
        System.out.println(andre);
        Performer moroni = new Performer("The Angel Moroni",
                "From the fields of The Great Alkali Plain");
        System.out.println(moroni);
    }
}
