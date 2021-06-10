package bdbt_wt_proj;

public class Modele {
    private int id_modelu;
    private String nazwa_modelu;
    private String nazwa_marki;

    public Modele(){
        super();
    }

    public Modele(int id_modelu, String nazwa_modelu, String nazwa_marki) {
        super();
        this.id_modelu = id_modelu;
        this.nazwa_modelu = nazwa_modelu;
        this.nazwa_marki = nazwa_marki;
    }


    public int getId_modelu() {
        return id_modelu;
    }

    public void setId_modelu(int id_modelu) {
        this.id_modelu = id_modelu;
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

}
