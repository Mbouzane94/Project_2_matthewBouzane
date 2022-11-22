import java.util.ArrayList;
import java.util.List;

public class PrimeNumberCalculator {

    private int primeCheck;

    public PrimeNumberCalculator(int primeCheck) {
        this.primeCheck = primeCheck;
    }

        public Boolean IsPrime (int number){
            Boolean isNumPrime = false;
            if (number % 2 == 0 && number!= 2) {
//                System.out.println("Number is Not a Prime Number");
            } else if (number % 3 == 0 && number != 3) {
//                System.out.println("Number is Not a Prime Number");
            } else if (number % 4 == 0 && number != 4) {
//                System.out.println("Number is Not a Prime Number");
            } else if (number % 5 == 0 && number != 5) {
//                System.out.println("Number is Not a Prime Number");
            } else if (number % 6 == 0 && number != 6) {
//                System.out.println("Number is Not a Prime Number");
            } else if (number % 7 == 0 && number != 7) {
//                System.out.println("Number is Not a Prime Number");
            } else if (number % 8 == 0 && number != 8) {
//                System.out.println("Number is Not a Prime Number");
            } else if (number % 9 == 0 && number != 9) {
//                System.out.println("Number is Not a Prime Number");
            } else {
//                System.out.println("Number is a Prime Number");
                isNumPrime = true;
                return isNumPrime;
            }
            return isNumPrime;
        }

        public String getUniquePrimeFactorization(int number){
        String masterstring = "";
            if (number == 0) {
                masterstring = "0";
            } else if (number == 1) {
                masterstring = "1";
            } else{
            // print the number of 2s that divide our number
                while (number % 2 == 0) {
                    masterstring += "2 + ";
                    number /= 2;
                }

                //number must be odd at this point

                for (int i = 3; i <= Math.sqrt(number); i += 2) {
                    while (number % i == 0) {
                        masterstring += (i + " + ");
                        number /= i;
                    }

                    //Check if number is less than 2
                }
                if (number > 2) {
                    masterstring += number;
                }
            }
            return masterstring;

        }
}