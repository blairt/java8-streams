package org.blair.streams;

import java.util.List;

import static java.util.stream.Collectors.toList;

/*
    Limit, Distinct and Skip

    limit the number of records to be returned.
    distinct - only return distinct records.
    skip - skip every (n)th records.
 */

public class WinnersLimitDistinctSkip {

    public void winnersLimitDistinctSkip() {

        // Here we use a lambda function - for less than and limit to first 2 Winner Objects
        List<Winner> winnerObjectsOfToursLessThan3500kmLimit2 = org.blair.streams.Winner.winners
                .stream()
                .filter(d -> d.getLengthKm() < 3500)
                .limit(2)
                .collect(toList());
        // Winners Of Tours Less Than 3500km - Limit2 [Pedro Delgado, Greg LeMond]
        System.out.println("Winner Objects Of Tours Less Than 3500km Limit2 " + winnerObjectsOfToursLessThan3500kmLimit2);


        // Here we use lambdas functions for less than and limit to 2 - String Array of Winner Objects
        List<String> firstTwoWinnersOfToursLessThan3500km = org.blair.streams.Winner.winners
                .stream()
                .filter(d -> d.getLengthKm() < 3500)
                .map(Winner::getName)
                .limit(2)
                .collect(toList());
        // First Two Winners Of Tours Less Than 3500km - [Pedro Delgado, Greg LeMond]
        System.out.println("First Two Winners Less Than 3500km - " + firstTwoWinnersOfToursLessThan3500km);


        // Here we use a lambda function to return the distinct winners - String Array of Winner Objects
        List<String> distinctTDFWinners = org.blair.streams.Winner.winners
                .stream()
                .map(Winner::getName)
                .distinct()
                .collect(toList());
        // Distinct Winners - [Eddy Merckx, Luis Ocaña, Bernard Thévenet, Lucien Van Impe, Bernard Hinault, Joop Zoetemelk,
        //                     Laurent Fignon, Greg LeMond, Stephen Roche, Pedro Delgado, Miguel Indurain, iguel Indurain,
        //                     Bjarne Riis, Jan Ullrich, Marco Pantani, Óscar Pereiro, Alberto Contador, Carlos Sastre,
        //                     Andy Schleck, Cadel Evans, Bradley Wiggins, Chris Froome, Vincenzo Nibali]
        System.out.println("Distinct Winners - " + distinctTDFWinners);


        // Here we use a lambda function to return the number distinct winners
        long numberOfDistinceWinners = org.blair.streams.Winner.winners
                .stream()
                .map(Winner::getName)
                .distinct()
                .count();
        // Number Of Distinct Winners - 23
        System.out.println("Number Of Distinct Winners - " + numberOfDistinceWinners);

        // Skip every other Winner records - No Lambda!
        List<Winner> skipEveryOtherWinner = org.blair.streams.Winner.winners
                .stream()
                .skip(2)
                .collect(toList());
        // Skip Every Other Winner - [Eddy Merckx, Luis Ocaña, Eddy Merckx, Bernard Thévenet, Lucien Van Impe, Bernard Thévenet,
        //                            Bernard Hinault, Bernard Hinault, Joop Zoetemelk, Bernard Hinault, Bernard Hinault, Laurent Fignon,
        //                            Laurent Fignon, Bernard Hinault, Greg LeMond, Stephen Roche, Pedro Delgado, Greg LeMond, Greg LeMond,
        //                            Miguel Indurain, Miguel Indurain, Miguel Indurain, iguel Indurain, Miguel Indurain, Bjarne Riis,
        //                            Jan Ullrich, Marco Pantani, Óscar Pereiro, Alberto Contador, Carlos Sastre, Alberto Contador,
        //                            Andy Schleck, Cadel Evans, Bradley Wiggins, Chris Froome, Vincenzo Nibali, Chris Froome,
        //                            Chris Froome, Chris Froome]
        System.out.println("Skip Every Other Winner - " + skipEveryOtherWinner);
    }
}
