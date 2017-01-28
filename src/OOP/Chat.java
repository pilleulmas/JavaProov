package OOP;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Pille on 21.01.2017.
 */
public class Chat {

    //ArrayList<String> names = new ArrayList<>();
    ArrayList<String[]> messages = new ArrayList<>();
    int loendur;
    String toaNimi;
    public Chat(String toaNimi){
        this.toaNimi = toaNimi;
    }

    public void sisestaSonum(String nimi, String sonum){
        //names.add(names.size(),nimi);
        String[] rida = new String[2];
        rida[0] = nimi;
        rida[1] = sonum;
        messages.add(rida);
    }
    public void prindiKoikSonumidKoosKasutajanimega(){
        for (int i = 0; i < messages.size(); i++) {
            System.out.println(Arrays.toString(messages.get(i)));
        }
        System.out.println();
    }
    public void adminKustutabSonumi(String kustutatav){
        for (int i = 0; i < messages.size(); i++) {
            if (messages.get(i)[1].equals(kustutatav)){
                messages.get(i)[1] = "DELETED";
            }
        }
    }
    public void prindiToaNimi(){
        System.out.println(toaNimi);
    }
}
