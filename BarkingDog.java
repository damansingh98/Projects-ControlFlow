public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        boolean result = false;
        if (hourOfDay < 0 || hourOfDay > 23){
            result = false;
            System.out.println(result);
        }
        else if (hourOfDay >= 8 && hourOfDay <= 22){
            result = false;
            System.out.println(result);
        }

        else if (hourOfDay >= 1 || hourOfDay <=7 || hourOfDay >=23){
            if(barking == true){
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
        shouldWakeUp(true, 1);
    }
}


