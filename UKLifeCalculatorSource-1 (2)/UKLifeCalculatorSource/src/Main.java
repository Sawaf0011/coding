import java.util.Scanner;

public class Main {
    public static void pointsCalculator() {
        //Complete this method
        int limit=0;
        double speed=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter speed limit " );
        limit = scanner.nextInt();

        System.out.println("Enter speed "  );
        speed = scanner.nextInt();


        SpeedingPoints speedingPoints = new SpeedingPoints();
        speedingPoints.checkTolerance(speed, limit);
        speedingPoints.checkPoints(speed, limit);
        speedingPoints.getOutcomeStr(speed, limit);
        speedingPoints.getSpeedingPoints();
        speedingPoints.setSpeedingPoints(0);
    }




    public static void taxCalculator() {

        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.getTax();
        taxCalculator.calcTax(13000);
        //Should return £86 (you also pay £143 NI)
        System.out.println(taxCalculator.getTax());

        taxCalculator.calcTax(40000);
        //Should return £5486 (you also pay £3496 NI)
        System.out.println(taxCalculator.getTax());

        taxCalculator.calcTax(60000);
        //Should return £11,432 (you also pay £5,006 NI)
        System.out.println(taxCalculator.getTax());

        taxCalculator.calcTax(160000);
        //Should return £56,960  (you also pay  £7,423 NI)
        System.out.println(taxCalculator.getTax());
    }



    public static void main(String[] args) {
        taxCalculator();
        pointsCalculator();
    }
}