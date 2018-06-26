package org.blair.streams;

import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalDouble;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.*;
/*
    Reducing
    Reducing takes a stream of values and outputs a single value.
 */

public class WinnersReducing {

    public void winnersReducing() {

        // Return the total distance of all winners. The summation is done using reduce(0, Integer::sum)
        int totalDistance = org.blair.streams.Winner.winners
                .stream()
                .map(Winner::getLengthKm)
                .reduce(0, Integer::sum);
        // Total Distance - 154244
        System.out.println("Total Distance - " + totalDistance);

        // Return the shortest tour length of all winners.
        Optional<Integer> shortestLength = org.blair.streams.Winner.winners
                .stream()
                .map(Winner::getLengthKm)
                .reduce(Integer::min);
        // shortestLength - 3285
        System.out.println("Shortest Length - " + shortestLength.get());

        // Return the longest tour length of all winners.
        Optional<Integer> longestLength = org.blair.streams.Winner.winners
                .stream()
                .map(Winner::getLengthKm)
                .reduce(Integer::max);
        // longestLength - 4254
        System.out.println("Longest Length - " + longestLength.get());

        //Here a Comparator is used to compare average speeds to determine the fastest
        Optional<Winner> fastestWinner = org.blair.streams.Winner.winners
                .stream()
                .min(Comparator.comparingDouble(Winner::getAveSpeed));
        // Luis Ocaña
        System.out.println("Fastest winner speed - " + fastestWinner.get());

        // Shorthand of above
        OptionalDouble fastestWinnerSpeed = org.blair.streams.Winner.winners
                .stream()
                .mapToDouble(Winner::getAveSpeed).min();
        // Average winner speed - 33.0
        System.out.println("Fastest winner speed - " + fastestWinnerSpeed.getAsDouble());
    }
}
