public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number <= 0 || number == 1) {
            return -1;
        }
        int largestprime = 0;
        for (int x = 1; x <= number; x++) {
            boolean test = true;
            if (number%x == 0) {
                for (int y = 2; y < x; y++) {
                    if (x % y == 0) {
                        test = false;
                    }
                }
                if (test) {
                    largestprime = x;
                }

            }
        }return largestprime;
    }


    public static void main(String[] args) {
        getLargestPrime(45);

    }
}


