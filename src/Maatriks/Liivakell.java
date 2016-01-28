package Maatriks;

import java.util.Arrays;

/**
 * Loo X*X maatriks, millel on kujutatud liivakella. Umbes nagu proovieksamis
 * oli risti joonistamine, aga "värvitult". Värvitud ala on number 0 ja
 * värvimata on punkt.
 *
 * Näide 9*9 maatriksil
 * 000000000
 * .0000000.
 * ..00000..
 * ...000...
 * ....0....
 * ...000...
 * ..00000..
 * .0000000.
 * 000000000
 *
 */
public class Liivakell {
    public static void main(String[] args) {
        printMaatriks(genereeriLiivakell(9));
        printMaatriks(genereeriLiivakell(18));
        printMaatriks(genereeriLiivakell(21));
    }

    private static int[][] genereeriLiivakell(int i) {
        // Lahendus siia meetodi sisse
        return new int[0][];
    }

    private static void printMaatriks(int[][] laud) {
        for (int i = 0; i < laud.length; i++) {
            System.out.println(Arrays.toString(laud[i]));
        }
        System.out.println("");
    }
}
