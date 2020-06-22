public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        int sum = 0;
        boolean val = false;
        if(number < 1){

            return  val;

        }
            for(int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                                            // adds the sum only if the condition is satisfied

                }
            }
                 if (sum == number){
                    val = true;                 // if sums  = to original value it returns true
                    System.out.println(val);
                }
                else {
                    val = false;               // else false
                    System.out.println(val);
                }

        return val ;

    }

    public static void main(String[] args) {
        isPerfectNumber(28);
    }
}
