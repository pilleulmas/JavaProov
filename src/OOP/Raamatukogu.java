package OOP;

import java.util.Arrays;

/**
 * Raamatukogus on Sõnaraamat. Õigemini siis on, kui sa selle klassi kirjutad.
 *
 * Reeglid:
 * 1. Raamatukogu klassi ei tohi muuta.
 * 2.
 */
public class Raamatukogu {
    public static void main(String[] args) {

        Sonaraamat raamat = new Sonaraamat("Eesti");
        raamat.sisestaSona("puaas");
        raamat.sisestaSona("uubuma");
        raamat.sisestaSona("uudikristamine");
        raamat.sisestaSona("sarkasm");
        raamat.sisestaSona("iroonia");

        String[] vaste = raamat.otsiEsimeseTaheJargi("u");
        System.out.println(Arrays.toString(vaste));

        raamat.misKeeleRaamatOled();

    }
}
