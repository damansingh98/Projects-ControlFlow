public class TeenChecker {
    public static boolean hasTeen(int age, int age1, int age2){
        boolean result = false;
        if((age >= 13 && age <= 19) || (age1 >= 13 && age1 <= 19) || (age2 >= 13 && age2 <= 19)){
            result = true;
            System.out.println(result);

        }else {

            result = false;
            System.out.println(result);

        }

return result;
    }
    public static boolean isTeen(int g){
        boolean res = false;
        if(g >= 13 && g <= 19){
            res = true;
            System.out.println(res);


        }else {
            res = false;
            System.out.println(res);

        }

        return res;

    }

    public static void main(String[] args) {
        hasTeen(16   ,17, 18);
        isTeen(15);
    }
}
