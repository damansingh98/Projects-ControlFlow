public class SwitchExample {
    public static void main(String[] args) {
        char switchValue = 'B';
        switch (switchValue) {

            case 'A':
                System.out.println("I am A");
                break;
            case  'B':
                System.out.println("I am B");
                break;
            case 'C': case 'D':
                System.out.println("I am C");
                System.out.println("I am also D");

            default:{
                System.out.println("Not Found");

            }
        }

    }
}
