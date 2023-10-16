import dziedziczenie.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Zyrafa melman = new Zyrafa("Melman", "Zyrafa");
        Slon burt = new Slon("Burt", "Slon");
        Pingwin skipper = new Pingwin("Skipper", "Pingwin");
        Lew alex = new Lew("Alex", "Lew");


        for (Zwierzeta zwierze : Zwierzeta.zwierzetaList) {
            useDisplayName(zwierze);
            useMakeNoise(zwierze);
        }

    }
        public static void useMakeNoise(Zwierzeta zwierze){
            zwierze.makeNoise();
        }

        public static void useDisplayName(Zwierzeta zwierze){
            zwierze.displayName();
    }
}