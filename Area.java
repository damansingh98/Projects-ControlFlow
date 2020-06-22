public class Area {
    public static double area(double radius) {
        double a;
        if (radius < 0) {
            return -1.0;

        } else {
            a = Math.PI*radius*radius;
            System.out.println((double)Math.round(a));
        }
            return a;

    }

    public static double area(double x, double y) {
        double r;
        if (x < 0 || y < 0) {

            r =  -1.0;
            System.out.println(r);
        } else {
            r =  x * y;
            System.out.printf("%.1f", r);
        }
            return r;
    }

    public static void main(String[] args) {
      area(5.0);
      area(4.0, 5.0);
    }
}
