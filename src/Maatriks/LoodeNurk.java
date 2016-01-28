package Maatriks;

import java.util.Arrays;

/**
 * Loo X*X suurune maatriks, millele tekib loode suunaline nurkade muster, nagu näites.
 *
 * Näide 9*9 maatriksiga:
 * 1 1 1 1 1 1 1 1 1
 * 1 2 2 2 2 2 2 2 2
 * 1 2 3 3 3 3 3 3 3
 * 1 2 3 4 4 4 4 4 4
 * 1 2 3 4 5 5 5 5 5
 * 1 2 3 4 5 6 6 6 6
 * 1 2 3 4 5 6 7 7 7
 * 1 2 3 4 5 6 7 8 8
 * 1 2 3 4 5 6 7 8 9
 *
 * Tundub raske? Leia seoseid rea ja veeru indeksi numbritega.
 */
public class LoodeNurk {
    public static void main(String[] args) {
        printMaatriks(genereeriLoodeNurk(5));
        printMaatriks(genereeriLoodeNurk(10));
        printMaatriks(genereeriLoodeNurk(25));
    }

    private static int[][] genereeriLoodeNurk(int i) {
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
