package pl.edu.ur.oopl9;

public class Auta {

    private String nazwa;
    private int rok_produkcji;

    public Auta(String nazwa, int rok_produkcji) {
        this.nazwa = nazwa;
        this.rok_produkcji = rok_produkcji;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getRok_produkcji() {
        return rok_produkcji;
    }

    public void setRok_produkcji(int rok_produkcji) {
        this.rok_produkcji = rok_produkcji;
    }
}
