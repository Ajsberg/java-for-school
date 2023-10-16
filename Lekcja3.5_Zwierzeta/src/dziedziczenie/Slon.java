package dziedziczenie;

public class Slon extends Zwierzeta {

    public Slon(String imie, String rasa){
        super(imie, rasa);
    }

    @Override
    public void makeNoise(){
        System.out.println("*gra na trabie");
    }
}
