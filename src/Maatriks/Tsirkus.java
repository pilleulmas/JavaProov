package Maatriks;

import java.util.Arrays;

/**
 * Loo 10*10 maatriks tsirkuse lauamänguga. Ehk numbrid ühest sajani
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
        int side = 10;
        int [][] table = new int [side][side];
        int count1 = side;
        int count2;
        int a = 1;

        while (count1>0){
            if (count1==0 || count1%2==0){
                count2=0;
                while (count2<side){
                    table[count1-1][count2] = a;
                    count2++;
                    a++;
                }
            }
            else{
                count2 = side;
                while (count2>0){
                    table[count1-1][count2-1] = a;
                    count2--;
                    a++;
                }
            }
            count1--;
        }
        printMaatriks(table);
    }

    // Lihtsalt abiline meetod, et maatriksit välja printida
    private static void printMaatriks(int[][] laud) {
        for (int i = 0; i < laud.length; i++) {
            System.out.println(Arrays.toString(laud[i]));
        }
        System.out.println("");
    }
}
