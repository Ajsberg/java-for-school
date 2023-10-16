package dziedziczenie;

public class Pingwin extends Zwierzeta{
    public Pingwin(String imie, String rasa){
        super(imie, rasa);
    }

    @Override
    public void makeNoise() {
        System.out.println("Linux Linux");
    }
}
