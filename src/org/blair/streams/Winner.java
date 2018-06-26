package org.blair.streams;

import java.time.Duration;
import java.util.*;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.*;
/*
    This data was taken from Wikipedia - https://en.wikipedia.org/wiki/List_of_Tour_de_France_general_classification_winners
 */
public class Winner {
    private int year;
    private String nationality;
    private String name;
    private String team;
    private int lengthKm;
    private Duration winningTime;
    private int stageWins;
    private int daysInYellow;

    public Winner(int year, String nationality, String name, String team, int lengthKm, Duration winningTime, int daysInYellow) {
        this.year = year;
        this.nationality = nationality;
        this.name = name;
        this.team = team;
        this.lengthKm = lengthKm;
        this.winningTime = winningTime;
        this.daysInYellow = daysInYellow;
    }

    public static final List<Winner> winners = Arrays.asList(
            new Winner(1970,"Belgium","Eddy Merckx","Faemino–Faema",4254,Duration.parse("PT119H31M49S"),17),
            new Winner(1971,"Belgium","Eddy Merckx","Molteni",3608,Duration.parse("PT96H45M14S"),17),
            new Winner(1972,"Belgium","Eddy Merckx","Molteni",3846,Duration.parse("PT108H17M18S"),15),
            new Winner(1973,"Spain","Luis Ocaña","Bic",4090,Duration.parse("PT122H25M34S"),14),
            new Winner(1974,"Belgium","Eddy Merckx","Molteni",4098,Duration.parse("PT116H16M58S"),18),
            new Winner(1975,"France","Bernard Thévenet","Peugeot–BP–Michelin",4000,Duration.parse("PT114H35M31S"),8),
            new Winner(1976,"Belgium","Lucien Van Impe","Gitane–Campagnolo",4017,Duration.parse("PT116H22M23S"),12),
            new Winner(1977,"France","Bernard Thévenet","Peugeot–Esso–Michelin",4096,Duration.parse("PT115H38M30S"),8),
            new Winner(1978,"France","Bernard Hinault","Renault–Gitane–Campagnolo",3908,Duration.parse("PT108H18M00S"),3),
            new Winner(1979,"France","Bernard Hinault","Renault–Gitane",3765,Duration.parse("PT103H06M50S"),17),
            new Winner(1980,"Netherlands","Joop Zoetemelk","TI–Raleigh–Creda",3842,Duration.parse("PT109H19M14S"),10),
            new Winner(1981,"France","Bernard Hinault","enault–Elf–Gitane",3753,Duration.parse("PT96H19M38S"),18),
            new Winner(1982,"France","Bernard Hinault","Renault–Elf–Gitane",3507,Duration.parse("PT92H08M46S"),12),
            new Winner(1983,"France","Laurent Fignon","Renault–Elf",3809,Duration.parse("PT105H07M52S"),6),
            new Winner(1984,"France","Laurent Fignon","Renault–Elf",4021,Duration.parse("PT112H03M40S"),7),
            new Winner(1985,"France","Bernard Hinault","La Vie Claire",4109,Duration.parse("PT113H24M23S"),16),
            new Winner(1986,"United States","Greg LeMond","La Vie Claire",4094,Duration.parse("PT110H35M19S"),7),
            new Winner(1987,"Ireland","Stephen Roche","Carrera Jeans–Vagabond",4231,Duration.parse("PT115H27M42S"),3),
            new Winner(1988,"Spain","Pedro Delgado","Reynolds",3286,Duration.parse("PT84H27M53S"),11),
            new Winner(1989,"United States","Greg LeMond","AD Renting–W-Cup–Bottecchia",3285,Duration.parse("PT87H38M35S"),8),
            new Winner(1990,"United States","Greg LeMond","Z–Tomasso",3504,Duration.parse("PT90H43M20S"),2),
            new Winner(1991,"Spain","Miguel Indurain","Banesto",3914,Duration.parse("PT101H01M20S"),10),
            new Winner(1992,"Spain","Miguel Indurain","Banesto",3983,Duration.parse("PT100H49M30S"),10),
            new Winner(1993,"Spain","Miguel Indurain","Banesto",3714,Duration.parse("PT95H57M09S"),14),
            new Winner(1994,"Spain","iguel Indurain","Banesto",3978,Duration.parse("PT103H38M38S"),13),
            new Winner(1995,"Spain","Miguel Indurain","Banesto",3635,Duration.parse("PT92H44M59S"),13),
            new Winner(1996,"Denmark","Bjarne Riis","Team Telekom",3765,Duration.parse("PT95H57M16S"),13),
            new Winner(1997,"Germany","Jan Ullrich","Team Telekom",3950,Duration.parse("PT100H30M35S"),12),
            new Winner(1998,"Ialy","Marco Pantani","Mercatone Uno–Bianchi",3875,Duration.parse("PT92H49M46S"),7),
            new Winner(2006, "Spain", "Óscar Pereiro", "Caisse d'Epargne–Illes Balears", 3657, Duration.parse("PT89H40M27S"), 8),
            new Winner(2007, "Spain", "Alberto Contador", "Discovery Channel", 3570, Duration.parse("PT91H00M26S"), 4),
            new Winner(2008, "Spain", "Carlos Sastre", "Team CSC", 3559, Duration.parse("PT87H52M52S"), 5),
            new Winner(2009, "Spain", "Alberto Contador", "Astana", 3459, Duration.parse("PT85H48M35S"), 7),
            new Winner(2010, "Luxembourg", "Andy Schleck", "Team Saxo Bank", 3642, Duration.parse("PT91H59M27S"), 12),
            new Winner(2011, "Australia", "Cadel Evans", "BMC Racing Team", 3430, Duration.parse("PT86H12M22S"), 2),
            new Winner(2012, "Great Britain", "Bradley Wiggins", "Team Sky", 3496, Duration.parse("PT87H34M47S"), 14),
            new Winner(2013, "Great Britain", "Chris Froome", "Team Sky", 3404, Duration.parse("PT83H56M20S"), 14),
            new Winner(2014, "Italy", "Vincenzo Nibali", "Astana", 3661, Duration.parse("PT89H59M06S"), 19),
            new Winner(2015, "Great Britain", "Chris Froome", "Team Sky", 3360, Duration.parse("PT84H46M14S"), 16),
            new Winner(2016, "Great Britain", "Chris Froome", "Team Sky", 3529, Duration.parse("PT89H04M48S"), 14 ),
            new Winner(2016, "Great Britain", "Chris Froome", "Team Sky", 3540, Duration.parse("PT86H20M55S"), 15 ));

    public double getAveSpeed() {
        return (getLengthKm() / (getWinningTime().getSeconds() / 3600) );
    }

    public int getYear() {

        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String getNationality() {

        return nationality;
    }
    public void setNationality(String nationality) {

        this.nationality = nationality;
    }
    public String getName() {

        return name;
    }
    public void setName(String name) {

        this.name = name;
    }
    public String getTeam() {
        return team;
    }
    public void setTeam(String team) {

        this.team = team;
    }
    public int getLengthKm() {

        return lengthKm;
    }
    public void setLengthKm(int lengthKm) {

        this.lengthKm = lengthKm;
    }
    public Duration getWinningTime() {

        return winningTime;
    }
    public void setWinningTime(Duration winningTime) {

        this.winningTime = winningTime;
    }

    public int getStageWins() {

        return stageWins;
    }
    public void setStageWins(int stageWins) {

        this.stageWins = stageWins;
    }
    public int getDaysInYellow() {

        return daysInYellow;
    }
    public void setDaysInYellow(int daysInYellow) {

        this.daysInYellow = daysInYellow;
    }

    @Override
    public String toString() {

        return name;
    }

}