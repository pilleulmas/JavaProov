package OOP;

/**
 * Peole on kutsutud rohkem inimesi kui korterisse mahub. Sinu ülesanne on Korteri
 * objekt ehitada nii, et üleliigsetest keelduda saaks.
 *
 * Reeglid
 * 1. Pidu klassi muuta ei tohi.
 * 2. Maja maksimum on 10 inimest.
 * 3. Kui Korter on täis siis on täis. Rohkem juurde ei saa
 */
public class Pidu {
    public static void main(String[] args) {

        Korter korter = new Korter("Kolde pst. 45-2");

        korter.saabus("Taavi");
        korter.saabus("Pilve");
        korter.saabusid(new String[]{"Maarika", "Joonas"});
        korter.saabusid(new String[]{"Kalle", "Muri", "Sille"});

        int mitu = korter.mituInimestOnKorteris();
        System.out.println(mitu);

        int mituVeel = korter.mituInimestVeelMahub();
        System.out.println(mituVeel);

        korter.lahkus("Taavi");

        korter.saabusid(new String[]{"Tambet", "Liisa", "Liis", "Veidro", "Moonika", "Politsei"});

        korter.lahkus("Spiido");

        mitu = korter.mituInimestOnKorteris(); // peaks olema 9, järjekorda ei ole.
        System.out.println(mitu);

        String aadress = korter.misOnAadress();

    }
}
