public class FirstLastDigit {
    public static int sumFirstAndLastDigit(int number) {
        int num = -1;

        if (number < 0) {
            System.out.println(num);

        } else {

            int last = number % 10; //Extract lastDigit of a number

            while (number >= 10) {
                number /= 10; //Extract firstDigit of a number

            }

            int first = number;
            int result = first + last;
            System.out.println(result);

        }

        return number;
    }



    public static void main(String[] args) {
        sumFirstAndLastDigit(252);
    }


}
