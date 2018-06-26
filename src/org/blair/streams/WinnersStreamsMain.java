package org.blair.streams;

/*
Streams in Java 8 provide a declarative approach to Collections. The simplest analogy is that your Collection (list)
is a water collection barrel, and when you turn the valve you create a stream which you can then process.

The advantages of Streams are –
    1) Declarative
    2) Parallelizable - Able to be made parallel
    3) Reduced Boilerplate – internal iteration

The Stream operations are either –
    1) Intermediate – return streams
    2) Terminal – produce result

    The final point is that streams can only be traversed once

    NOTE: The ideas for this came from a blog by Martin Farrell.
 */
public class WinnersStreamsMain {

    public static void main(String args[]) {

        WinnersOfToursGreaterOrLessThan3500km wotgl3500 = new WinnersOfToursGreaterOrLessThan3500km();
        System.out.println("\n### Winners greater than or less than 3500km.");
        wotgl3500.winnersOfToursGreaterOrLessThan3500km();

        WinnersLimitDistinctSkip wlds = new WinnersLimitDistinctSkip();
        System.out.println("\n### Winners that are limited, distinct, and skipped.");
        wlds.winnersLimitDistinctSkip();

        WinnersMatching wm = new WinnersMatching();
        System.out.println("\n### Winners that matched to criteria.");
        wm.winnersMatching();

        WinnersReducing wr = new WinnersReducing();
        System.out.println("\n### Winners that have been reduced to a single object.");
        wr.winnersReducing();

        WinnersGroupBy wgb = new WinnersGroupBy();
        System.out.println("\n### Winners that are grouped by criteria.");
        wgb.winnersGroupBy();

    }
}
