package day13_practice_Inheritance;

public class StateClients {
    public static void main(String[] args) {

        Virginia virginia = new Virginia("Virginia", "VA", " Democrat", "Ralph Northam",
                "Mark Warner",  8650000 );
        System.out.println(virginia);

        California california = new California("California","CA", "Democrat", "Gavin Newsom",
                "Dianne Feinstein", 39500000);
        System.out.println(california);

        Texas texas = new Texas("Texas", "TX", "Republican", "Greg Abbott", "John Cornyn",
                29360000);
        System.out.println(texas);
        Florida florida = new Florida("Florida", "FL", "Republican", "Ron DeSantis",
                "Marco Rubio", 22160000);
        System.out.println(florida);

    }
}
/*

   - Create multiple objects representing different states.
   - Test the methods and variables of each object.
         name: String
       - abbreviation: String
       - politicalParty: String
       - Governor: String
       - senator: String
       - population: int
 */