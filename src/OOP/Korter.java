package OOP;

/**
 * Created by Pille on 21.01.2017.
 */
//Kuna tulijate nimesid ei ole kordagi kysitud, j2tsin nad m2ngust v2lja.

public class Korter {
    int mahutab;
    int kylalisi = 0;

    public Korter(int mahutab){
        this.mahutab = mahutab;
    }

    public void saabus(String nimi){
        if (mahutab>0){
            kylalisi++;
            mahutab--;
        }
    }
    public void prindiKylalisteArv(){
        System.out.println(kylalisi);
    }
    public void prindiPaljuVeelMahub(){
        System.out.println(mahutab);
    }
    public void lahkus(String nimi){
        kylalisi--;
        mahutab++;
    }
}
