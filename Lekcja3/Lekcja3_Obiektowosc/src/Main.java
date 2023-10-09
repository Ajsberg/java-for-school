import dziedziczenie.Auto;
import dziedziczenie.Jacht;
import dziedziczenie.Pojazd;
import dziedziczenie.Samolot;
import obiekty.Samochod;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Samochod samochod = new Samochod();
        samochod.setKolor("Srebrny");
        samochod.setModel("Clio IV");
        samochod.setMarka("Renault");

        System.out.println(samochod.getKolor());
        System.out.println(samochod.getModel());
        System.out.println(samochod.getMarka());

        Auto auto = new Auto("Honda", "Civic");
        Samolot samolot = new Samolot("X", "Y");
        Jacht jacht = new Jacht("Porsche", "XD");

        useMakeNoise(auto);
        useMakeNoise(samolot);
        useMakeNoise(jacht);
    }

    public static void useMakeNoise(Pojazd pojazd){
        pojazd.makeNoise();
    }
}