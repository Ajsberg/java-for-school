package dziedziczenie;

public class Lew extends Zwierzeta{


    public Lew(String imie, String rasa){
        super(imie, rasa);
    }

    @Override
    public void makeNoise(){
        System.out.println("Ryyyyyyyyyyyyyyyyk");
    }
}
