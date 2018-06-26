package org.blair.streams;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.counting;
/*
    GroupingBy
    The groupingBy method allows us to collect the results into a Map.
*/

public class WinnersGroupBy {

    // Grouping list of winners by the winners name.
    public void winnersGroupBy() {
        // Grouping by - make a map whose keys are names
        Map<String, List<Winner>> namesVsWinner = org.blair.streams.Winner.winners
                .stream()
                .collect(groupingBy(Winner::getName));
        // Names Vs. Winner - {Cadel Evans=[Cadel Evans], Greg LeMond=[Greg LeMond, Greg LeMond, Greg LeMond], Lucien Van Impe=[Lucien Van Impe],
        //                                  Óscar Pereiro=[Óscar Pereiro], Chris Froome=[Chris Froome, Chris Froome, Chris Froome, Chris Froome], Alberto Contador=[Alberto Contador,
        //                                  Alberto Contador], Jan Ullrich=[Jan Ullrich], Miguel Indurain=[Miguel Indurain, Miguel Indurain, Miguel Indurain, Miguel Indurain],
        //                                  Marco Pantani=[Marco Pantani], Eddy Merckx=[Eddy Merckx, Eddy Merckx, Eddy Merckx, Eddy Merckx], Luis Ocaña=[Luis Ocaña],
        //                                  Bradley Wiggins=[Bradley Wiggins], Carlos Sastre=[Carlos Sastre], Stephen Roche=[Stephen Roche], Laurent Fignon=[Laurent Fignon, Laurent Fignon],
        //                                  Bernard Thévenet=[Bernard Thévenet, Bernard Thévenet], Bjarne Riis=[Bjarne Riis], Andy Schleck=[Andy Schleck], Joop Zoetemelk=[Joop Zoetemelk],
        //                                  Pedro Delgado=[Pedro Delgado], Bernard Hinault=[Bernard Hinault, Bernard Hinault, Bernard Hinault, Bernard Hinault, Bernard Hinault],
        //                                  Vincenzo Nibali=[Vincenzo Nibali], iguel Indurain=[iguel Indurain]}
        System.out.println("Names Vs. Winner - " + namesVsWinner);


        // We can also collect winners to csv string - join strings
        String allTDFWinnersTeamsCSV = org.blair.streams.Winner.winners
                .stream()
                .map(Winner::getTeam)
                .collect(joining(", "));
        // All Winners Teams -  Faemino–Faema, Molteni, Molteni, Bic, Molteni, Peugeot–BP–Michelin, Gitane–Campagnolo, Peugeot–Esso–Michelin,
        //                      Renault–Gitane–Campagnolo, Renault–Gitane, TI–Raleigh–Creda, enault–Elf–Gitane, Renault–Elf–Gitane, Renault–Elf, Renault–Elf,
        //                      La Vie Claire, La Vie Claire, Carrera Jeans–Vagabond, Reynolds, AD Renting–W-Cup–Bottecchia, Z–Tomasso, Banesto, Banesto, Banesto,
        //                      Banesto, Banesto, Team Telekom, Team Telekom, Mercatone Uno–Bianchi, Caisse d'Epargne–Illes Balears, Discovery Channel, Team CSC,
        //                      Astana, Team Saxo Bank, BMC Racing Team, Team Sky, Team Sky, Astana, Team Sky, Team Sky, Team Sky
        System.out.println("All Winners Teams - " + allTDFWinnersTeamsCSV);


        // Group winners by Nationality
        Map<String, List<Winner>> winnersByNationality = org.blair.streams.Winner.winners
                .stream()
                .collect(groupingBy(Winner::getNationality));
        // winnersByNationality - {United States=[Greg LeMond, Greg LeMond, Greg LeMond], Ialy=[Marco Pantani],
        //                         Spain=[Luis Ocaña, Pedro Delgado, Miguel Indurain, Miguel Indurain, Miguel Indurain, iguel Indurain, Miguel Indurain, Óscar Pereiro, Alberto Contador, Carlos Sastre, Alberto Contador],
        //                         Great Britain=[Bradley Wiggins, Chris Froome, Chris Froome, Chris Froome, Chris Froome],
        //                         Netherlands=[Joop Zoetemelk], Belgium=[Eddy Merckx, Eddy Merckx, Eddy Merckx, Eddy Merckx, Lucien Van Impe],
        //                         Luxembourg=[Andy Schleck], Ireland=[Stephen Roche], Denmark=[Bjarne Riis], Italy=[Vincenzo Nibali], Australia=[Cadel Evans],
        //                         France=[Bernard Thévenet, Bernard Thévenet, Bernard Hinault, Bernard Hinault, Bernard Hinault, Bernard Hinault, Laurent Fignon, Laurent Fignon, Bernard Hinault],
        //                         Germany=[Jan Ullrich]}
        System.out.println("Winners By Nationality - " + winnersByNationality);


        // Group number of wins by Nationality
        Map<String, Long> winsByNationalityCounting = org.blair.streams.Winner.winners
                .stream()
                .collect(groupingBy(Winner::getNationality, counting()));
        // winsByNationalityCounting - {United States=3, Ialy=1, Spain=11, Great Britain=5, Netherlands=1, Belgium=5, Luxembourg=1, Ireland=1, Denmark=1, Italy=1, Australia=1, France=9, Germany=1}
        System.out.println("Number of Wins By Nationality - " + winsByNationalityCounting);
    }
}
