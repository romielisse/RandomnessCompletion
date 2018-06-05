import java.util.Random;

public class DiceRoller
{
    public static void main( String[] args )
    {
        int dienumber;

        dienumber = getRandomNumberInRange(1,6);

         System.out.println("Your die roll was : " + dienumber);
    }

    protected static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}