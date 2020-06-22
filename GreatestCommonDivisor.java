public class GreatestCommonDivisor {
    public static  int getGreatestCommonDivisor(int first, int second) {
        int val = -1;
        if (first < 10 || second < 10) {
            System.out.println(val);

        } else {
            try {
                while (true) {
                    int num = second; // assign a temp value to second.
                    second = first % second;        // update second value with modulo operation
                    first = num;     // now assign the fist value with temp
                }  // Throws ArithmeticException due to division by Zero

            } catch (ArithmeticException e) {
                System.out.println(first);

            }

        }
        return first;
    }

    public static void main(String[] args) {
        getGreatestCommonDivisor(-20, 15);
    }
}
