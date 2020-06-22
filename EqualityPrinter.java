public class EqualityPrinter {
    public  static  void printEqual(int x, int y, int z){
     if( x >- 0 && y >= 0 && z >= 0) {
         if (x == y && x == z) {
             System.out.println("All numbers are equal");


         }
         if (x != y && x != z && y != z) {
             System.out.println("All numbers are different");

         }
         if (x == y && x != z) {
             System.out.println("Neither all are equal or different");
         }
         if (x != z && y == z) {
             System.out.println("Neither all are equal or different");
         }
         if(x != y &&  x ==z ){
             System.out.println("Neither all are equal or different");
         }
     }

         else {
             System.out.println("Invalid Value");

         }

     }



    public static void main(String[] args) {
        printEqual(1, 2, 1);
    }

}
