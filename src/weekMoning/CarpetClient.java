package weekMoning;

public class CarpetClient {
    public static void main(String[] args) {

       Carpet carpet1 = new Carpet();
       carpet1.carpetInfo(2,3,100,true);

        System.out.println(carpet1.calcCost());



    }
}
