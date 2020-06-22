import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double ave = 0;
        int counter = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt(); // add sum if a number is an input
                counter++; // count number
                ave = (double) sum / counter;   // average
            } else {
                System.out.println("SUM = " + sum + " AVG = " + Math.round(ave)); // print the output
                break;  // break if the input is a String or Character
            }
        }
    }

    public static void main (String[]args){
    inputThenPrintSumAndAverage();
    }

}
