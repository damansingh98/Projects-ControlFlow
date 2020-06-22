public class SharedDigit {
    public static boolean hasSharedDigit(int num, int num2) {
        boolean result = false;
        if ((num >= 10 && num <= 99) && (num2 >= 10 && num <= 99)) {
            int LastDigit = num % 10;
            int LastDigit2 = num2 % 10; // last digit of the number

            int FirstDigit = num / 10;
            int FirstDigit2 = num2 / 10; // Get the first digit of the number

            if (LastDigit == LastDigit2 || LastDigit == FirstDigit || LastDigit == FirstDigit2) {
                    result = true;
                System.out.println(result);

            }


        } else {
            result = false;
            System.out.println(result);

        }
        return result;
    }

    public static void main(String[] args) {
        hasSharedDigit(9,9);
    }
}

