package Maatriks;

import java.util.Arrays;

/**
 * Loo 10*10 maatriks tagurpidi Tsirkuse lauamänguga. Ehk numbrid ühest sajani
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
        int side = 10;
        int [][] table = new int [side][side];
        int count1 = 0;
        int count2;
        int a = 1;

        while (count1<side){
            if (count1==0 || count1%2==0){
                count2=side;
                while (count2>0){
                    table[count1][count2-1] = a;
                    count2--;
                    a++;
                }
            }
            else{
                count2 = 0;
                while (count2<side){
                    table[count1][count2]=a;
                    count2++;
                    a++;
                }
            }
            count1++;
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
