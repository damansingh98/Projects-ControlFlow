public class NumberPalindrome {
  public static boolean isPalindrome(int number){

      if(number < 0 ){
          number *= -1; //Making the number positive
      }
      int forwardNum = 0;
      forwardNum += number; // adding forward number to the original number
      int backNum = 0;
      backNum = number % 10;  //Last digit of original number can be achieved with modulo
      number /= 10;                     
      boolean reverse = true;

      while (number > 0){
          backNum *= 10;
          backNum += number %10;
          number /= 10;

         if(forwardNum == backNum){
             System.out.println(reverse);

         }
         else {
             reverse = false;
             System.out.println(reverse);
            break;

         }

      }
      return reverse;
  }

    public static void main(String[] args) {
        isPalindrome(11212);
    }
}
