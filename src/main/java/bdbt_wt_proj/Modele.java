package bdbt_wt_proj;

public class Modele {
    private int id_modelu;
    private String nazwa_modelu;
    private int id_marki;

    public Modele(){
        super();
    }

    public Modele(int id_modelu, String nazwa_modelu, int id_marki) {
        super();
        this.id_modelu = id_modelu;
        this.nazwa_modelu = nazwa_modelu;
        this.id_marki = id_marki;
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

    public int getId_marki() {
        return id_marki;
    }

    public void setId_marki(int id_marki) {
        this.id_marki = id_marki;
    }
}
