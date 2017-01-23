package Algoritm;

import java.util.Arrays;

/**
 * Antud on massiiv. Mitu sõne on massiivis keskmisest pikemad?
 */
public class PikadSoned {
    public static void main(String[] args) {
        String[] naide = {"kaalikas", "joonas", "maakera", "homeros", "mandel"}; // vastus on 3
        int taheloendur = 0;
        int keskmine = 0;
        int loendur = 0;

        for (int i = 0; i < naide.length; i++) {
            taheloendur += naide[i].length();
        }
        keskmine = taheloendur/naide.length;
        for (int i = 0; i <naide.length ; i++) {
            if (naide[i].length()>keskmine){
                loendur++;
            }
        }
        System.out.println("Keskmisest pikemad on "+loendur+" sõne!");
    }

}
