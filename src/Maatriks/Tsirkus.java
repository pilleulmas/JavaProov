package Maatriks;

import java.util.Arrays;

/**
 * Loo X*X maatriks tsirkuse lauamänguga. Ehk numbrid ühest sajani
 * alustavad alt vasakult ja jõuavad üles vasakule.
 *
 * Näide 5*5 laual:
 * 30 29 28 27 26
 * 21 22 23 24 25
 * 20 19 18 17 16
 * 11 12 13 14 15
 * 10 9  8  7  6
 * 1  2  3  4  5
 */
public class Tsirkus {
    public static void main(String[] args) {
        int[][] laud1 = genereeriLaud(5);
        int[][] laud2 = genereeriLaud(10);
        int[][] laud3 = genereeriLaud(25);
        printMaatriks(laud1);
        printMaatriks(laud2);
        printMaatriks(laud3);
    }

    private static int[][] genereeriLaud(int i) {
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
