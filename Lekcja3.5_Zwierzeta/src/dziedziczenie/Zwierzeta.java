package dziedziczenie;

import java.util.ArrayList;
import java.util.List;

public class Zwierzeta {
    String imie;
    String rasa;

    public static List<Zwierzeta> zwierzetaList = new ArrayList<>();

    public Zwierzeta(String imie, String rasa){
        this.imie = imie;
        this.rasa = rasa;

        zwierzetaList.add(this);
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public void makeNoise() {
        System.out.println("*Dzwiek zwierza*");
    }

    public void displayName() {
        System.out.println("Mam na imie: " + imie);
    }
}
