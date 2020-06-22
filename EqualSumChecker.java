public class EqualSumChecker {
    public static boolean hasEqualSum(int n, int n1, int n2){
    boolean result = false;
    if((n + n1) == n2){
        result = true;
        System.out.println(result);

    }
    else {
        result = false;
        System.out.println(result);

    }
    return result;
    }

    public static void main(String[] args) {
        hasEqualSum(1,-1,0);
    }
}
