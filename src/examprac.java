import java.util.Scanner;



public class examprac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c = 0;
        do {
            Print_Menu();
            c = input.nextInt();
            if (c == 1) {
                System.out.println("Reverse a string");
                Scanner string_scannner = new Scanner(System.in);
                String string_check = input.next();
                String reversed_string = Reverse_string(string_check);
                System.out.println(reversed_string);
            } else if (c == 2) {
                System.out.println("Enter length of regtangle");
                Scanner length_scannner = new Scanner(System.in);
                int length = input.nextInt();
                System.out.println("Enter width of regtangle");
                Scanner width_scannner = new Scanner(System.in);
                int width = input.nextInt();
                Rectangles(length, width);
            } else if (c == 3) {
                System.out.println("c = 3");
            } else if (c == 4) {
                System.out.println("c = 4");
            }
        } while (c != 4);
    }


    public static void Print_Menu() {
        System.out.println("Enter your choice");
        System.out.println("1. String Reverse \n2. Rectangle \n3. Nothing \n4. Quit");
    }

    public static String Reverse_string(String input_string) {
        String reverse_string = "";
        int string_len = input_string.length();
        for(int i = string_len; i <= string_len; i = i - 1){
            if (i > 0) {
                reverse_string += input_string.substring(i - 1, i);
            }
        }
        return reverse_string;
    }

    public static void Rectangles(int x , int y) {
        int area = x * y;
        int perimeter = (x * 2) + (y * 2);
        System.out.println("Area = " + area + " " + "Perimeter = " + perimeter);
    }

}
