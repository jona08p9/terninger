import java.util.Random;

public class Raflebaeger {
    private int antalTerninger;

    private int[] terninger;


    public Raflebaeger(int antalTerninger){
        this.antalTerninger = antalTerninger;
        terninger = new int [antalTerninger];
    }

    public int ryst(){
        // lav tilfældigt tal mellem 1 og 6
        Random random = new Random(); //generer random numre

        int sum = 0;
        for (int i =0; i<antalTerninger; i++ ) { // Loop til antal terninger i raflebæger

            int randomNumber = random.nextInt(6) + 1;
            //todo læg i array
            terninger[i] = randomNumber;


            sum = sum + randomNumber;

        }
        return sum;
        //return 25; //simulering af ryst
    }

    public int[] se() {
        return terninger;
    }



}
