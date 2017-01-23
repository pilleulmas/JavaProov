package OOP;

/**
 * Created by Pille on 21.01.2017.
 */
public class Zelda {
    int elusid;
    public Zelda(int elusid){
        this.elusid = elusid;
    }
    public void kaklusKolliga(int kolliElusid){
        elusid = elusid-kolliElusid;
    }
    public void prindiMituEluAlles(){
        System.out.println(elusid);
    }
    public void prindiKasOnElus(){
        if (elusid>0){
            System.out.println("Zelda on elus!");
        }
        else {
            System.out.println("Ei ole elus!");
        }
    }
}
