import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        //System.out.printf("Hello and welcome!");

        //System.out.print("Nasza lekcja");
        //System.out.println("Hey");

        //Liczbowe
        //int i = 9;
        //int t = 11;
        //int f = i + t;
        Integer integer = null;

        Long l = 9L;
        long l2 = 9L;

        Double d = 2.0;
        double a = 5.6;
        double b = 3.7;
        double c = Math.pow(a,b);

        //True/False

        Boolean bol = true;
        boolean b2 = false;

        //Tekst

        String s = "Hello World!";
        String u = "";
        String zTekstem = "Z tekstem";
        String zNullem = null;

        if(zNullem!=null) {
            System.out.println(zNullem.isEmpty());
        } else {
            System.out.println("To NULL");
        }
        //System.out.println(s.toUpperCase());
        //System.out.println(s.toLowerCase());
        //System.out.println(u.isEmpty());
        //System.out.println(zTekstem.isEmpty());

        if (zTekstem!=null && zTekstem.isEmpty()==false){
            System.out.println(zTekstem.toUpperCase());
        }else{
            System.out.println("Zawartość to NULL lub jest pusta");
        }
        }
    }