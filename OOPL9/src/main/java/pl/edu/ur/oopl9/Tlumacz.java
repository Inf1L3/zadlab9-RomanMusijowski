package pl.edu.ur.oopl9;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Tlumacz {

    Scanner sc = new Scanner(System.in);


    private int ilosc;
    private String slowoPL;
    private String slowoEN;
    private Map<String , String > slownik = new TreeMap<>();
    private String[] BD;


    public Tlumacz(int ilosc) {
        this.ilosc = ilosc;
        this.BD = new String[this.ilosc];
    }


    public void pod_danych(){

        for (int i =0;i<this.ilosc;i++){

            System.out.println("Podaj slowo w języku polskim");
            slowoPL=sc.nextLine();

            System.out.println("Podaj slowo w języku angielskim");
            slowoEN = sc.nextLine();

            BD[i]=slownik.put(slowoPL,slowoEN);
        }
    }


    public void odpowiedz(){
        String słowo,koncowka = "ta";
        while(koncowka == "ta") {
            System.out.println("Podaj słowo w języku Polskim");
            słowo = sc.nextLine();
            if (slownik.containsKey(slowoPL)) {
                System.out.println(slownik.get(slowoPL));
            } else {
                System.out.println("nie ma takiego słowa");
            }

            System.out.println(" Chcesz powtorzyc?(koniec or ta) ");
            koncowka=sc.nextLine();
        }
    }







}
