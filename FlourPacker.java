public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        boolean val = false;
       if( bigCount < 0 || smallCount < 0 || goal < 0){
           System.out.println(val);

       }
        if( goal > ((bigCount * 5) + smallCount) ){
            val = false;
            System.out.println(val);
        }if((goal % 5 ) > smallCount){
            System.out.println(val);
        }

        else {
            val = true;
            System.out.println(val);

        }

        return val;

    }

    public static void main(String[] args) {
        canPack(1,0,5);
    }

}
