import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Raflebaeger raflebaeger = new Raflebaeger(2); // giver antal terninger til mit public raflebaeger

        int samletAntalOejne = raflebaeger.ryst();
        System.out.println(samletAntalOejne);

        int[] terninger = raflebaeger.se();
        for (int tal: terninger) {
            System.out.println(tal);

        }

    }
}

