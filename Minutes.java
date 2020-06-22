public class Minutes {
public  static void printYearsAndDays(long minutes){
    if(minutes < 0){
        System.out.println("Invalid Value");

    }else {
        long remainingDays = minutes % 525600;
        long days = remainingDays / 1440;

        long years = minutes/525600;

        System.out.println(minutes + " min " + "= " + years + " y and " + days + " d");
    }

}

    public static void main(String[] args) {
        printYearsAndDays(561600);
    }
}
