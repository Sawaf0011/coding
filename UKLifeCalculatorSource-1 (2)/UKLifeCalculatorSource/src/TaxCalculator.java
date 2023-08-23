

public class TaxCalculator {
    //these are variables that are going to be used in the method calcTax so it can be easier for us instead of typing down the numbers
    private double tax;
    private final int LOWER_LIMIT = 12570;
    private final int BASIC_RATE = 50270;
    private final int HIGHER_RATE = 150000;
//this is a method that is used to return the resukt of the tax the one has to pay according to their salary
    public double getTax() {
        return tax;
    }

    //this method calulates and do the whole maths for the taxes and the salary
    public void calcTax(int salary) {
        //Complete this method
        int tax= 0;
        // this calculates the taxes the user has to pay if they earn less than 12570 which is stored as LOWER_LIMIT
        if(salary<=LOWER_LIMIT){
            tax = 0;
            System.out.println("you have to pay 0 taxes");
            // this calculates what the user has to pay if they earn between 12570 and 50270
        }else if (salary >=LOWER_LIMIT && salary <=BASIC_RATE){
            tax = (int) ((salary - LOWER_LIMIT )*0.2);
            System.out.println("you have to pay " + tax);
            //    // this calculates what the user has to pay if they earn between 50270 and 150000
        } else if (salary>=BASIC_RATE && salary <=HIGHER_RATE) {
            tax = (int)((salary -BASIC_RATE)*0.4 + (BASIC_RATE - LOWER_LIMIT)*0.2);
            System.out.println("you have to pay " + tax);
            //    // this calculates what the user has to pay if they earn higher than 150000
        }else if (salary>=HIGHER_RATE){
            tax = (int) ( ((salary - HIGHER_RATE)*0.45) + ((HIGHER_RATE-37700)*0.4) + ((37700)*0.2));
            System.out.println("your have to pay " + tax);
        }
        //Write appropriate comments throughout
    }
}
