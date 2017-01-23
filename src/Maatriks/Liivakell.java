package Maatriks;

import java.util.Arrays;

/**
 * Loo 9*9 maatriks, millel on kujutatud liivakella. Värvitud ala on number 0 ja
 * värvimata on punkt. Kui ei oska siis joonista esiteks rist ja liigu sealt edasi.
 *
 * Näide
 * 0 0 0 0 0 0 0 0 0
 * . 0 0 0 0 0 0 0 .
 * . . 0 0 0 0 0 . .
 * . . . 0 0 0 . . .
 * . . . . 0 . . . .
 * . . . 0 0 0 . . .
 * . . 0 0 0 0 0 . .
 * . 0 0 0 0 0 0 0 .
 * 0 0 0 0 0 0 0 0 0
 *
 */
public class Liivakell {
    public static void main(String[] args) {
        int side = 9;
        int half = side/2;
        String [][] table = new String[side][side];
        int counter1 = 0;
        int counter2;
        int index1 = 0;
        int index2 = side-1;

        while (counter1<side){
            counter2 = 0;
            if (counter1 < half) {
                while (counter2 < side) {
                    if (counter2 < index1 || counter2 > index2) {
                        table[counter1][counter2] = ".";
                    } else {
                        table[counter1][counter2] = "0";
                    }
                    counter2++;
                }
                index1++;
                index2--;
            }
            else {
                while (counter2 < side) {
                    if (counter2 < index1 || counter2 > index2){
                        table[counter1][counter2] = ".";
                    }
                    else {
                        table[counter1][counter2] = "0";
                    }
                    counter2++;
                }
                index1--;
                index2++;
            }
            counter1++;
        }

        printMaatriks (table);
    }

    // Lihtsalt abiline meetod, et maatriksit välja printida
    private static void printMaatriks(String[][] laud) {
        for (int i = 0; i < laud.length; i++) {
            System.out.println(Arrays.toString(laud[i]));
        }
        System.out.println("");
    }
}
