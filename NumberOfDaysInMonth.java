public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year){
        boolean result = false;
        if(year < 0 || year > 9999 ){
            System.out.println(result);

        }else  if(year >=1 && year <= 9999) {
           if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
               result = true;
                System.out.println(true);

            }

        } else {
            result = false;
            System.out.println(result);
        }

            return result;
    }

    public static void main(String[] args) {
        isLeapYear(2017);
    }

}
