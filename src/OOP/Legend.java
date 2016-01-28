package OOP;

/**
 * Loo klass Zelda, mis käitub nii nagu käesolev programm ootab.
 *
 * Reeglid:
 * 1. Zeldal on alguses 100 elu.
 * 2. Rünnates ja kaitstes ütleb Zelda midagi konsooli.
 * 3. Kaitstes läheb Zeldal vahemikus 0-40 elu, vali randomiga.
 * 4. Surres ütleb Zelda oma viimase palve.
 * 5. Käesolevat klassi muuta ei tohi.
 */
public class Legend {
    public static void main(String[] args) {

        Zelda zelda = new Zelda("Player 2");

        // Zelda leidis kolli kellega kakelda

        zelda.rynnak();
        zelda.kaitse();
        zelda.kaitse();
        zelda.rynnak();
        zelda.rynnak();
        zelda.rynnak();

        zelda.kasOledElus();
        zelda.misOnMangijaNimi();

    }
}
