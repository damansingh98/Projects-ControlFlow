public class SumOdd {
    public static boolean isOdd(int number) {
        if(number < 0){
            return false;
        }
        else if (number % 2 > 0) {
            return false;
        }
        else{
            return true;
        }
    }




    public static void main(String[] args) {
      isOdd(25);
    }
}
