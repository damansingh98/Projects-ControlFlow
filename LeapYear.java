public class LeapYear {
    public static boolean isLeapYear(int year){
    boolean result = false;

    if(year < 1 || year > 9999){
        result = false;
        System.out.println(result);

    }
       else if(year >=1 || year <= 9999 ){
           if((year % 4 == 0 && year % 100 != 0 )|| (year % 400 == 0)){
               result = true;
               System.out.println(result);

           }
           else {

               result = false;
               System.out.println(result);
           }

    }
        return result;

    }

    public static void main(String[] args) {
        isLeapYear(-1);
    }
}
