package org.vashonsd;

public class Main {

    public static void main(String[] args) {
      Performer john = new Performer("John Blue", "is a country singer");
        john.addHit("Country Roads");
        john.addHit("Feeling Blue");
        Performer sarah = new Performer("Sarah dern" , "is a opera singer");
        sarah.addHit("la la la");
        sarah.addHit("ohhhhh");
        Concert fest = new Concert("Seattle WA" , "Crazy concert with great performers", "Seattle Concert Fest");
        fest.addPerformers("Sarah");
        fest.addPerformers("John");
        System.out.println(fest);
        System.out.println(john);
        System.out.println(sarah);

        /**
             * For now, use the main() method to print out the name of a show.
             * Create several Performers by giving them names and descriptions.
             * If you want a performer to have had one or more hit songs, use the performer's
             * .addHit() method along with the name of the hit.
             * Then print out the performers.
             */


            }
        }


