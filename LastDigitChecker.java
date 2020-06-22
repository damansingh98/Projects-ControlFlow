public class LastDigitChecker {
    public static boolean hasSameLastDigit(int x, int y, int z ){
        boolean result = true;
        if((x >= 10 && x <= 1000) && (y >= 10 && y <= 1000) && (z >= 10 && z <= 1000)){
            int a = x % 10;
            int b = y % 10;
            int c = z % 10;
            if(a == b || a == c || c == b){
                System.out.println(result);

            }
            else {
                result = false;
                System.out.println(result);

            }

        }else{
            result = false;
            System.out.println(result);

        }


        return  result;
    }

    public static boolean isValid(int num){
    boolean res = false;
    if( num >= 10 && num <= 1000){
        res  = true;
        System.out.println(res );

    }
    else {
        res = false;
        System.out.println(res);

    }
    return res;



    }

    public static void main(String[] args) {
        hasSameLastDigit(22 , 23, 34);

    }

}
