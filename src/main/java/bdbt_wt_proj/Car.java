package bdbt_wt_proj;

public class Car {
    private int id_pojazdu;
    private String dostepny;
    private int rok_produkcji;
    private int cena;
    private float moc;
    private String rodzaj_paliwa;
    private String typ;
    private String nazwa_modelu;
    private String nazwa_marki;


    public Car(){
super();
    }


    public Car(int id_pojazdu, String dostepny, int rok_produkcji, int cena, float moc, String rodzaj_paliwa, String typ, String nazwa_marki, String nazwa_modelu) {
        super (); //jemu to eclips dopisał więc ja też wstawiam
        this.id_pojazdu = id_pojazdu;
        this.dostepny = dostepny;
        this.rok_produkcji = rok_produkcji;
        this.cena = cena;
        this.moc = moc;
        this.rodzaj_paliwa = rodzaj_paliwa;
        this.typ = typ;
        this.nazwa_marki = nazwa_marki;
        this.nazwa_modelu = nazwa_modelu;
    }

    public int getId_pojazdu() {
        return id_pojazdu;
    }

    public void setId_pojazdu(int id_pojazdu) {
        this.id_pojazdu = id_pojazdu;
    }

    public String getDostepny() {
        return dostepny;
    }

    public void setDostepny(String dostepny) {
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

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getNazwa_modelu() {
        return nazwa_modelu;
    }

    public void setNazwa_modelu(String nazwa_modelu) {
        this.nazwa_modelu = nazwa_modelu;
    }

    public String getNazwa_marki() {
        return nazwa_marki;
    }

    public void setNazwa_marki(String nazwa_marki) {
        this.nazwa_marki = nazwa_marki;
    }


    //Generate to String
    @Override
    public String toString() {
        return "Car{" +
                "id=" + id_pojazdu +
                ", nazwa_modelu=" + nazwa_modelu +
                ", nazwa_marki=" + nazwa_marki +
                ", dostepny=" + dostepny +
                ", rok_produkcji=" + rok_produkcji +
                ", cena=" + cena +
                ", moc=" + moc +
                ", rodzaj paliwa='" + rodzaj_paliwa + '\'' +
                ", typ='" + typ + '\'' +
                '}';
    }
}
