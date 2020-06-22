public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature){
        boolean cat = false;
        if(temperature >= 25 && temperature <= 35){
             cat = true;
            System.out.println(cat);
        }
        else if((summer == true) && (temperature >= 36 && temperature <= 45)){
          cat = true;
            System.out.println(cat);

        }
        else {
            cat = false;
            System.out.println(cat);
        }
        return cat;
    }

    public static void main(String[] args) {
        isCatPlaying(false, 36);
    }
}
