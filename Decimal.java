public class Decimal {
    public  static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        boolean result = false;
        if((int)(num1 * 1000) == ((int)(num2 * 1000))){
            result = true;
            System.out.println(result);
        }else{

            result = false;
            System.out.println(result);

        }
        return  result;

    }

    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
    }

}
