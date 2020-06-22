public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        int lastDigit, sumOfEvenDigits = 0;
        if(number < 0){
            return -1;
        }
        while(number != 0){
            lastDigit = number % 10; // looking for last digit
            if(lastDigit % 2 == 0){
                sumOfEvenDigits += lastDigit; //If Even
            }
            number /= 10;
        }
        return sumOfEvenDigits;
    }

    public static void main(String[] args) {
        getEvenDigitSum(252);
    }
}
