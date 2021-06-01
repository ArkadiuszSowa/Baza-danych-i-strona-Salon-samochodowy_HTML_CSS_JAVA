package bdbt_wt_proj;

public class Marki {

    private int id_marki;
    private String nazwa_marki;

    public Marki(){
        super();
    }

    public Marki(int id_marki, String nazwa_marki) {
        super();
        this.id_marki = id_marki;
        this.nazwa_marki = nazwa_marki;
    }


    public int getId_marki() {
        return id_marki;
    }

    public void setId_marki(int id_marki) {
        this.id_marki = id_marki;
    }

    public String getNazwa_marki() {
        return nazwa_marki;
    }

    public void setNazwa_marki(String nazwa_marki) {
        this.nazwa_marki = nazwa_marki;
    }
}
