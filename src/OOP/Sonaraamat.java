package OOP;
import java.util.ArrayList;
/**
 * Created by Pille on 21.01.2017.
 */
public class Sonaraamat {
    ArrayList<String> list = new ArrayList<>();
    String raamatuKeel;
    public Sonaraamat(String raamatuKeel){
        this.raamatuKeel = raamatuKeel;
    }
    public void sisestaSona(String sona){
        list.add(list.size(),sona);
    }
    public void eemaldaSona(String sona){
        for (int i = 0; i < list.size(); i++) {
            if (sona==list.get(i)){
                list.remove(i);
            }
        }
        System.out.println(list);
    }
    public String[] otsiEsimeseTaheJargi (String taht){
        ArrayList<String> tulemus = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).startsWith(taht)){
                tulemus.add(list.get(i));
            }
        }
        String[] tulem = new String[tulemus.size()];
        for (int i = 0; i < tulemus.size() ; i++) {
            tulem[i] = tulemus.get(i);
        }
        return tulem;
    }
    public void misKeelesRaamatOn(){
        System.out.println(raamatuKeel);
    }
}
