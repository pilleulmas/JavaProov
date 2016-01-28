package Maatriks;

import java.util.Arrays;

/**
 * Loo X*X maatriks, millel on kujutatud kikilipsu. Umbes nagu proovieksamis
 * oli risti joonistamine, aga "värvitult". Värvitud ala on number 0 ja 
 * värvimata on punkt.
 *
 * Näide 9*9 maatriksil
 * 0 . . . . . . . 0
 * 0 0 . . . . . 0 0
 * 0 0 0 . . . 0 0 0
 * 0 0 0 0 . 0 0 0 0
 * 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 . 0 0 0 0
 * 0 0 0 . . . 0 0 0
 * 0 0 . . . . . 0 0
 * 0 . . . . . . . 0
 *
 */
public class Kikilips {
    public static void main(String[] args) {
        printMaatriks(genereeriKikilips(9));
        printMaatriks(genereeriKikilips(18));
        printMaatriks(genereeriKikilips(21));
    }

    private static int[][] genereeriKikilips(int i) {
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
