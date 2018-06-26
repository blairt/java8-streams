package org.blair.streams;

import java.util.Optional;

/*
  MATCHING
  Matching allows you to apply a filter, then select which result to return.
  In this example we return any result that meets our filter criteria using the findAny method.
*/
public class WinnersMatching {

    public void winnersMatching() {
        // Here we use a lambda function to return matching winners
        Optional<Winner> winner2012 = org.blair.streams.Winner.winners
                .stream()
                .filter(w -> w.getName().contains("Wiggins") )
                .findAny();
        // Winner 2012 - Bradley Wiggins
        System.out.println("Winner 2012 matching 'Wiggins' - " + winner2012.get());

        // Here we use lambdas functions to matching winners on year 2014
        Optional<Integer> winnerYear2014 = org.blair.streams.Winner.winners
                .stream()
                .map(Winner::getYear)
                .filter(w -> w == 2014)
                .findFirst();
        // Winner Year 2014
        System.out.println("Winner Year matching '2014' - " + winnerYear2014.get());
    }
}
