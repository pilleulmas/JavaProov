package OOP;

/**
 * Created by Pille on 21.01.2017.
 */
public class Pastakas {
    int tindiKogus;
    public Pastakas(int tindiKogus){
        this.tindiKogus = tindiKogus;
    }
    public void kirjuta(String text){
        if (tindiKogus<text.length()){
            System.out.println(text.substring(0,tindiKogus));
            tindiKogus = 0;
        }
        else {
            System.out.println(text);
            tindiKogus = tindiKogus - text.length();
        }
    }
    public void prindiPaljuTintiAlles(){
        System.out.println(tindiKogus);
    }
}
