package bdbt_wt_proj;

import java.util.Arrays;

public class Pojazd {
    private int id;
    private boolean dostepny;
    private int rok_produkcji;
    private int cena;
    private char[] nr_vin = new char [17];
    private float pojemnosc_silnika;
    private float moc;
    private String rodzaj_paliwa;
    private int liczba_miejsc_siedzacych;
    private String typ;
    private String skrzynia_biegow;

    public Pojazd(){

    }


    public Pojazd(int id, boolean dostepny, int rok_produkcji, int cena, char[] nr_vin, float pojemnosc_silnika, float moc, String rodzaj_paliwa, int liczba_miejsc_siedzacych, String typ, String skrzynia_biegow) {
        super (); //jemu to eclips dopisał więc ja też wstawiam
        this.id = id;
        this.dostepny = dostepny;
        this.rok_produkcji = rok_produkcji;
        this.cena = cena;
        this.nr_vin = nr_vin;
        this.pojemnosc_silnika = pojemnosc_silnika;
        this.moc = moc;
        this.rodzaj_paliwa = rodzaj_paliwa;
        this.liczba_miejsc_siedzacych = liczba_miejsc_siedzacych;
        this.typ = typ;
        this.skrzynia_biegow = skrzynia_biegow;
    }

    //Geters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDostepny() {
        return dostepny;
    }

    public void setDostepny(boolean dostepny) {
        this.dostepny = dostepny;
    }

    public int getRok_produkcji() {
        return rok_produkcji;
    }

    public void setRok_produkcji(int rok_produkcji) {
        this.rok_produkcji = rok_produkcji;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public char[] getNr_vin() {
        return nr_vin;
    }

    public void setNr_vin(char[] nr_vin) {
        this.nr_vin = nr_vin;
    }

    public float getPojemnosc_silnika() {
        return pojemnosc_silnika;
    }

    public void setPojemnosc_silnika(float pojemnosc_silnika) {
        this.pojemnosc_silnika = pojemnosc_silnika;
    }

    public float getMoc() {
        return moc;
    }

    public void setMoc(float moc) {
        this.moc = moc;
    }

    public String getRodzaj_paliwa() {
        return rodzaj_paliwa;
    }

    public void setRodzaj_paliwa(String rodzaj_paliwa) {
        this.rodzaj_paliwa = rodzaj_paliwa;
    }

    public int getLiczba_miejsc_siedzacych() {
        return liczba_miejsc_siedzacych;
    }

    public void setLiczba_miejsc_siedzacych(int liczba_miejsc_siedzacych) {
        this.liczba_miejsc_siedzacych = liczba_miejsc_siedzacych;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getSkrzynia_biegow() {
        return skrzynia_biegow;
    }

    public void setSkrzynia_biegow(String skrzynia_biegow) {
        this.skrzynia_biegow = skrzynia_biegow;
    }

   //Generate to String
    @Override
    public String toString() {
        return "Pojazd{" +
                "id=" + id +
                ", dostepny=" + dostepny +
                ", rok_produkcji=" + rok_produkcji +
                ", cena=" + cena +
                ", nr_vin=" + Arrays.toString(nr_vin) +
                ", pojemnosc_silnika=" + pojemnosc_silnika +
                ", moc=" + moc +
                ", rodzaj_paliwa='" + rodzaj_paliwa + '\'' +
                ", liczba_miejsc_siedzacych=" + liczba_miejsc_siedzacych +
                ", typ='" + typ + '\'' +
                ", skrzynia_biegow='" + skrzynia_biegow + '\'' +
                '}';
    }
}
