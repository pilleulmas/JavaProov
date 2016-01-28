package Maatriks;

import java.util.Arrays;

/**
 * Loo X*X maatriks tagurpidi Tsirkuse lauamänguga. Ehk numbrid ühest sajani
 * alustavad ülevalt paremalt ja jõuavad alla paremale (või kui kaugele iganes).
 *
 * Näide 5*5 laual:
 *  5  4  3  2  1
 *  6  7  8  9 10
 * 15 14 13 12 11
 * 16 17 18 19 20
 * 25 24 23 22 21
 * 26 27 28 29 30
 */
public class Sukrist {
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
