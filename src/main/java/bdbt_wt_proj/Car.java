package bdbt_wt_proj;

public class Car {
    private int id_pojazdu;
    private String dostepny;
    private int rok_produkcji;
    private int cena;
    private String nr_vin;
    private float pojemnosc_silnika;
    private int moc;
    private String rodzaj_paliwa;
    private int liczba_miejsc_siedzacych;
    private String typ;
    private String skrzynia_biegow;
    private int id_uslugi;
    private int id_salonu;
    private int id_modelu;
    private int id_koloru;
    private String nazwa_modelu;
    private String nazwa_marki;


    public Car(){
super();
    }

    public Car(String dostepny, int rok_produkcji, int cena, String nr_vin, float pojemnosc_silnika, int moc, String rodzaj_paliwa, int liczba_miejsc_siedzacych, String typ, String skrzynia_biegow, int id_modelu) {
        super();
        id_pojazdu = 0;
        this.dostepny = dostepny;
        this.rok_produkcji = rok_produkcji;
        this.cena = cena;
        this.nr_vin = nr_vin;
        this.pojemnosc_silnika=pojemnosc_silnika;
        this.moc = moc;
        this.rodzaj_paliwa = rodzaj_paliwa;
        this.liczba_miejsc_siedzacych = liczba_miejsc_siedzacych;
        this.typ = typ;
        this.skrzynia_biegow = skrzynia_biegow;
        id_uslugi = 11;
        id_salonu = 1;
        this.id_modelu = id_modelu;
        id_koloru = 42;
    }
//
//    public Car(int id_pojazdu, String dostepny, int rok_produkcji, int cena, int moc, String rodzaj_paliwa, String typ, String nazwa_marki, String nazwa_modelu) {
//        super (); //to eclips dopisał więc ja też wstawiam
//        this.id_pojazdu = id_pojazdu;
//        this.dostepny = dostepny;
//        this.rok_produkcji = rok_produkcji;
//        this.cena = cena;
//        this.moc = moc;
//        this.rodzaj_paliwa = rodzaj_paliwa;
//        this.typ = typ;
//        this.nazwa_marki = nazwa_marki;
//        this.nazwa_modelu = nazwa_modelu;
//    }

    public Car(int id_pojazdu, String dostepny, int rok_produkcji, int cena, int moc, String rodzaj_paliwa, String typ) {
        super (); //to eclips dopisał więc ja też wstawiam
        this.id_pojazdu = id_pojazdu;
        this.dostepny = dostepny;
        this.rok_produkcji = rok_produkcji;
        this.cena = cena;
        this.moc = moc;
        this.rodzaj_paliwa = rodzaj_paliwa;
        this.typ = typ;
        nazwa_marki = "marka";
        nazwa_modelu = "model";
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

    public String getNr_vin() {
        return nr_vin;
    }

    public void setNr_vin(String nr_vin) {
        this.nr_vin = nr_vin;
    }

    public float getPojemnosc_silnika() {
        return pojemnosc_silnika;
    }

    public void setPojemnosc_silnika(float pojemnosc_silnika) {
        this.pojemnosc_silnika = pojemnosc_silnika;
    }

    public int getLiczba_miejsc_siedzacych() {
        return liczba_miejsc_siedzacych;
    }

    public void setLiczba_miejsc_siedzacych(int liczba_miejsc_siedzacych) {
        this.liczba_miejsc_siedzacych = liczba_miejsc_siedzacych;
    }

    public String getSkrzynia_biegow() {
        return skrzynia_biegow;
    }

    public void setSkrzynia_biegow(String skrzynia_biegow) {
        this.skrzynia_biegow = skrzynia_biegow;
    }

    public int getId_uslugi() {
        return id_uslugi;
    }

    public void setId_uslugi(int id_uslugi) {
        this.id_uslugi = id_uslugi;
    }

    public int getId_salonu() {
        return id_salonu;
    }

    public void setId_salonu(int id_salonu) {
        this.id_salonu = id_salonu;
    }

    public int getId_modelu() {
        return id_modelu;
    }

    public void setId_modelu(int id_modelu) {
        this.id_modelu = id_modelu;
    }

    public int getId_koloru() {
        return id_koloru;
    }

    public void setId_koloru(int id_koloru) {
        this.id_koloru = id_koloru;
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

    public void setMoc(int moc) {
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
    public String toString_user() {
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

    @Override
    public String toString() {
        return "Car{" +
                "id_pojazdu=" + id_pojazdu +
                ", nazwa_modelu='" + nazwa_modelu + '\'' +
                ", nazwa_marki='" + nazwa_marki + '\'' +
                ", dostepny='" + dostepny + '\'' +
                ", rok_produkcji=" + rok_produkcji +
                ", cena=" + cena +
                ", nr_vin='" + nr_vin + '\'' +
                ", pojemnosc_silnika=" + pojemnosc_silnika +
                ", moc=" + moc +
                ", rodzaj_paliwa='" + rodzaj_paliwa + '\'' +
                ", liczba_miejsc_siedzacych=" + liczba_miejsc_siedzacych +
                ", typ='" + typ + '\'' +
                ", skrzynia_biegow='" + skrzynia_biegow + '\'' +
                ", id_uslugi=" + id_uslugi +
                ", id_salonu=" + id_salonu +
                ", id_modelu=" + id_modelu +
                ", id_koloru=" + id_koloru +
                '}';
    }
}
