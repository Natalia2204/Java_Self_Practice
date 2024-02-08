package day13_practice_Inheritance;

public class Virginia extends State {
    public Virginia(String name, String abbreviation, String politicalParty, String governor, String senator, int population) {
        super(name, abbreviation, politicalParty, governor, senator, population);
    }

    public static void main(String[] args) {
        Virginia virginia = new Virginia("Virginia", "VA", "Repablican", "Glenn Youngkin", " Mark Warner", 8631393);
        System.out.println(virginia.toString());
    }



}
