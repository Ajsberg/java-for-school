package dziedziczenie;

public class Zyrafa extends Zwierzeta{

    public Zyrafa(String imie, String rasa){
        super(imie, rasa);
    }

    @Override
    public void makeNoise(){
        System.out.println("Jaki mototo?");
    }
}
