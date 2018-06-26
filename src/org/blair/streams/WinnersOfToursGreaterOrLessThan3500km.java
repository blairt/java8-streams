package org.blair.streams;

import java.util.List;
import static java.util.stream.Collectors.toList;

/*
    Filter And Map
    There are 3 steps in converting the winners list to a list of winners of tours greater than or less than 3500km
 */

public class WinnersOfToursGreaterOrLessThan3500km {

    public void winnersOfToursGreaterOrLessThan3500km() {

        // Here we use a lambdas - for less than: - String Array of Winner Objects
        List<String> winnersOfToursLessThan3500km = org.blair.streams.Winner.winners
                .stream()
                .filter(d -> d.getLengthKm() < 3500) // Separate out Tours less than 3500km
                .map(Winner::getName) // Get names of winners
                .collect(toList()); // Return a list

        // Winners of Tours Less than 3500km - [Pedro Delgado, Greg LeMond, Alberto Contador, Cadel Evans, Bradley Wiggins, Chris Froome, Chris Froome]
        System.out.println("Winners of Tours Less than 3500km - " + winnersOfToursLessThan3500km);


        //Here we use a lambdas - for greater than or Equal - String Array of Winner Objects
        List<String> winnersOfToursGreaterThan3500km = org.blair.streams.Winner.winners
                .stream()
                .filter(d -> d.getLengthKm() >= 3500)
                .map(Winner::getName)
                .collect(toList());
        // Winners of Tours Greater than or Equal 3500km - [Eddy Merckx, Eddy Merckx, Eddy Merckx, Luis Ocaña, Eddy Merckx, Bernard Thévenet, Lucien Van Impe, Bernard Thévenet, Bernard Hinault,
        //                                                  Bernard Hinault, Joop Zoetemelk, Bernard Hinault, Bernard Hinault, Laurent Fignon, Laurent Fignon, Bernard Hinault, Greg LeMond,
        //                                                  Stephen Roche, Greg LeMond, Miguel Indurain, Miguel Indurain, Miguel Indurain, iguel Indurain, Miguel Indurain, Bjarne Riis, Jan Ullrich,
        //                                                  Marco Pantani, Óscar Pereiro, Alberto Contador, Carlos Sastre, Andy Schleck, Vincenzo Nibali, Chris Froome, Chris Froome]
        System.out.println("Winners of Tours Greater than 3500km - " + winnersOfToursGreaterThan3500km);
    }
}
