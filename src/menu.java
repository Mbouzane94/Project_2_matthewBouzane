import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class menu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char c; //Char to drive menu choice
        FibonacciCalculator calc = new FibonacciCalculator(0,1);

        do{
            printMenu();
            //Grab the user input
            c = Character.toUpperCase(input.next().charAt(0));


            if(c=='A'){
                System.out.println("Enter Value to determine all fib numbers less then it.");
                Scanner fibScanner = new Scanner(System.in);
                int fibcheck;
                fibcheck = fibScanner.nextInt();
                int Fzero = 0;
                int Fone = 1;
                List<Integer> myList = new ArrayList<Integer>();
                myList.add(Fzero);
                myList.add(Fone);
                int count = 0;
                while(count < 20) {
                    int Fnew = myList.get(count) + myList.get(count + 1);
                    myList.add(Fnew);
                    count++;
                }
                List<Integer> requestedList = new ArrayList<Integer>();
                int counter = 0;
                while (counter < 20) {
                    if (myList.get(counter) < fibcheck){
                        requestedList.add(myList.get(counter));
                        counter++;
                    }
                    else{
                        counter++;
                    }
                }
                requestedList.forEach(System.out::println);

            } else  if(c=='B'){
                System.out.println("Enter a value to get a Fib Sequence of that length");
                Scanner fibScanner = new Scanner(System.in);
                int fibcheck;
                fibcheck = fibScanner.nextInt();
                List newlist = calc.getNFibs(fibcheck);
                System.out.println("newlist = " + newlist);
            } else if (c=='C'){
                System.out.println("Enter a value to Check if that value is a fib number.");
                Scanner myFibNumCheck = new Scanner(System.in);
                int fibNumCheck;
                fibNumCheck = myFibNumCheck.nextInt();
                calc.isFibonacciNumber(fibNumCheck);
            } else if (c=='D'){
                System.out.println("Enter a value to see if it is a prime number");
                Scanner primeScanner = new Scanner(System.in);
                int primecheck;
                primecheck = primeScanner.nextInt();
                PrimeNumberCalculator primecalc = new PrimeNumberCalculator(primecheck);
                boolean primechecker = primecalc.IsPrime(primecheck);
                System.out.println("The inputed number is a prime? " + primechecker);

            }
            else if (c=='E'){
                System.out.println("Enter a value to print and store the prime number factorization");
                Scanner primeScanner = new Scanner(System.in);
                int primecheck;
                primecheck = primeScanner.nextInt();
                PrimeNumberCalculator primecalc = new PrimeNumberCalculator(primecheck);
                String primeFactors = primecalc.getUniquePrimeFactorization(primecheck);
                System.out.println(primeFactors);

            }
            else if (c=='F'){
                System.out.println("Enter a values to print the prime factorization of each number lower in it");
                Scanner primeScanner = new Scanner(System.in);
                int userInput;
                userInput = primeScanner.nextInt();
                PrimeNumberCalculator primecalc = new PrimeNumberCalculator(userInput);
                int counter = 0;
                String grandMasterString = "";
                while (counter < userInput) {
                    String primeFactors = primecalc.getUniquePrimeFactorization(counter);
                    grandMasterString += primeFactors + " are the prime factors of " + counter + "\n";
                    counter++;
                }
                System.out.println(grandMasterString);


            }
            else if (c=='G'){
                System.out.println("Enter a value print all the Primes before it");
                Scanner primeScanner = new Scanner(System.in);
                int userInput;
                userInput = primeScanner.nextInt();
                PrimeNumberCalculator primecalc = new PrimeNumberCalculator(userInput);
                int counter = 0;
                Boolean isPrimeChecker = false;
                String primeString = "";
                while (counter < userInput) {
                    isPrimeChecker = primecalc.IsPrime(counter);
                    if (isPrimeChecker) {
                        primeString += counter + " , ";
                        counter++;
                    }
                    else{
                        counter++;
                    }
                }
                System.out.println(primeString + " = all the prime numbers");

            }
            else if (c=='H'){
                System.out.println("Enter 2 values to print all the Primes between them");
                System.out.println("Enter the lower value");
                Scanner primeScanner = new Scanner(System.in);
                int userInput;
                userInput = primeScanner.nextInt();
                PrimeNumberCalculator primecalc = new PrimeNumberCalculator(userInput);
                System.out.println("Enter the higer value");
                Scanner primeScannertwo = new Scanner(System.in);
                int userInputTwo;
                userInputTwo = primeScannertwo.nextInt();
                Boolean isPrimeChecker = false;
                String primeString = "";
                while (userInput < userInputTwo) {
                    isPrimeChecker = primecalc.IsPrime(userInput);
                    if (isPrimeChecker) {
                        primeString += userInput + " , ";
                        userInput++;
                    }
                    else{
                        userInput++;
                    }
                }
                System.out.println(primeString + " = all the prime numbers Between the numbers inputed");

            }


        }while(c!='Q');

        System.out.println("\nGOODBYE!");
    }

    public static void printMenu(){
        System.out.println("\n\nMake a choice");
        System.out.println("(A) Determines and displays all the Fibonacci numbers less than a value input");
        System.out.println("(B) Prints n Fibonacci numbers");
        System.out.println("(C) Checks to see if a number input by the user is a Fibonacci number");
        System.out.println("(D) Checks to see if a number input by the user is prime number");
        System.out.println("(E) Prints the Prime Factorization of a Number");
        System.out.println("(F) Prints the Prime Factorization of each number lower than an inputted number");
        System.out.println("(G) Prints all the prime number less than an inputted number");
        System.out.println("(H) Prints all the prime number between two inputted numbers");
        System.out.println("(Q) Quit");
    }

}