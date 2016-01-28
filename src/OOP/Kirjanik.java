package OOP;

/**
 * Loo see Pastaka objekt, mida kirjanik soovib siin kasutada.
 *
 * Reeglid:
 * 1. Pastakal on alguses 60 ühikut tinti.
 * 2. Iga täht kulutab ühe ühiku.
 * 3. Kui pastakas kirjutab siis tuleb tekst konsooli - kuni tinti jätkub.
 * 4. Seda klassi siin muuta ei tohi.
 */
public class Kirjanik {
    public static void main(String[] args) {

        Pastakas pastakas = new Pastakas("Sinine");

        pastakas.kirjuta("Elu oleks palju lihtsam, kui meil oleks selle lähtekood.");

        int alles = pastakas.paljuTintiOnAlles();
        String varv = pastakas.misOnSuVarv();

        System.out.println(alles);
        System.out.println(varv);

        pastakas.kirjuta("Õiged progejad ei kommenteeri oma koodi. Kui seda oli raske kirjutada, siis peab olema seda ka raske lugeda!");

    }
}
