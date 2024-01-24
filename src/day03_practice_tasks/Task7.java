package day03_practice_tasks;

public class Task7 {
    public static void main(String[] args) {
       /* double ageMike = 15.5;
        String licenseMike = "yes";
        double ageMary = 17;
        String licenceMary = "yes";

        boolean resolt1 = ageMike >= 15.5 & licenseMike == "yes";
        System.out.println(" Is Mike eligible to drive? " + resolt1);
        boolean resolt2 = ageMary >= 15.5 & licenceMary == "yes";
        System.out.println(" Is Mary eligible to drive? " + resolt2);
*/
        double age = 20;
        boolean hasLearningPermit = true;
        boolean hasDriverLicense = false;

        boolean result = (age >=18 && hasDriverLicense) || (age >= 15.5 && hasLearningPermit);
        System.out.println(" Is Mary eligible to drive? " + result);







    }
}
