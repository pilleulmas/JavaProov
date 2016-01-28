package Maatriks;

import java.util.Arrays;

/**
 * Loo X*X suurune maatriks, millele tekib kagu suunaline nurkade muster, nagu näites.
 *
 * Näide 9*9 maatriksiga:
 * 9 8 7 6 5 4 3 2 1
 * 8 8 7 6 5 4 3 2 1
 * 7 7 7 6 5 4 3 2 1
 * 6 6 6 6 5 4 3 2 1
 * 5 5 5 5 5 4 3 2 1
 * 4 4 4 4 4 4 3 2 1
 * 3 3 3 3 3 3 3 2 1
 * 2 2 2 2 2 2 2 2 1
 * 1 1 1 1 1 1 1 1 1
 *
 * Tundub raske? Leia seoseid rea ja veeru indeksi numbritega.
 */
public class KaguNurk {
    public static void main(String[] args) {
        printMaatriks(genereeriKaguNurk(5));
        printMaatriks(genereeriKaguNurk(10));
        printMaatriks(genereeriKaguNurk(25));
    }

    private static int[][] genereeriKaguNurk(int i) {
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
