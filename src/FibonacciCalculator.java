import java.util.*;
import java.util.function.Supplier;

public class FibonacciCalculator {

    private int F0;
    private int F1;

    public FibonacciCalculator(int F0, int F1) {
        this.F0 = F0;
        this.F1 = F1;
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(F0);
        myList.add(F1);
        int counter = 0;

        while(counter < 20) {
            int Fnew = myList.get(counter) + myList.get(counter + 1);
            myList.add(Fnew);
            counter++;
        }

        myList.forEach(System.out::println);

    }

    public Boolean isFibonacciNumber(int checker){
        boolean isFib = false;
        int Fzero = 0;
        int Fone = 1;
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(F0);
        myList.add(F1);
        int count = 0;
        while(count < 20) {
            int Fnew = myList.get(count) + myList.get(count + 1);
            myList.add(Fnew);
            count++;
        }

        if (myList.contains(checker)){
            System.out.println("Value is a Fibonacci number");
            isFib = true;
        } else{
            System.out.println("value is not a Fibonacci number");
            isFib = false;
        }
        return isFib;

    }

    public int getFibonacciNumber(int fibNumRequested){
        int Fzero = 0;
        int Fone = 1;
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(Fzero);
        myList.add(Fone);
        int count = 0;
        while(count < fibNumRequested) {
            int Fnew = myList.get(count) + myList.get(count + 1);
            myList.add(Fnew);
            count++;
        }
        int fibNumWanted = myList.get(fibNumRequested - 1);
        return fibNumWanted;
    }

    public List getNFibs(int fibnumwanted) {
        int Fzero = 0;
        int Fone = 1;
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(Fzero);
        myList.add(Fone);
        int count = 0;
        while (count < fibnumwanted - 2) {
            int Fnew = myList.get(count) + myList.get(count + 1);
            myList.add(Fnew);
            count++;
        }
        return myList;
    }

}
