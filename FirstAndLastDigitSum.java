public class FirstAndLastDigitSum {
    public static int  sumFirstAndLastDigit(int number){
        if(number > 0){
           int first =  number / 10; // First Digit
            int last = number % 10; // last digit

            
            int result = first+last;
            System.out.println(result);

        }else {

            System.out.println(-1);
        }

        return number;
    }

    public static void main(String[] args) {
        sumFirstAndLastDigit(5);
    }
}
