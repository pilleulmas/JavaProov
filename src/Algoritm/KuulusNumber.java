package Algoritm;

/**
 * Antud on int[] massiiv. Eemalda kõik nr 3 väärtused ja leia millist numbrit esineb kõige siis rohkem?
 * Mitte siis number, mis on kolmandal indeksil, vaid nr kolm ise.
 */
public class KuulusNumber {

    public static void main(String[] args) {

        int[] naide = {1, 5, 3, 3, 6, 3, 7, 7}; // vastus on 7
        int number =0;
        int loendur =0;
        int maxloendur =0;
        int maxnumber=0;
        for (int i = 0; i < naide.length; i++) {
            if (naide[i]!=3){
                number = naide[i];
            }
            for (int j = i; j < naide.length; j++) {
                if(number == naide[j]){
                    loendur++;
                }
            }
            if (loendur>maxloendur){
                maxloendur = loendur;
                maxnumber = number;
            }
            loendur = 0;
        }
        System.out.println("Enim esinenud number on "+maxnumber+", teda esines "+maxloendur+" korda.");
    }

}
