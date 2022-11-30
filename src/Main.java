import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(true) {
            try {
                System.out.print("Enter a 10 digit number: +7");
                long number = scan.nextLong();
                if (number > 0 && Long.toString(number).length() == 10){
                    break;}
            } catch(InputMismatchException e) {
                scan.nextLine();
                System.out.println("Invalid input: Use digits 0 to 9 only");
                continue;
            }
        }}
}