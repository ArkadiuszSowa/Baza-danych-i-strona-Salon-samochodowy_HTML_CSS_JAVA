package bdbt_wt_proj;

public class Car {
    private int id_pojazdu;
    private boolean dostepnosc;
    private int rok_produkcji;
    private int cena;
    private float engine_capacity;
    private float power;
    private String fuel_type;
    private String type;


    public Car(){

    }


    public Car(int id_pojazdu, boolean dostepnosc, int rok_produkcji, int price, float engine_capacity, float power, String fuel_type, String type) {
        super (); //jemu to eclips dopisał więc ja też wstawiam
        this.id_pojazdu = id_pojazdu;
        this.dostepnosc = dostepnosc;
        this.rok_produkcji = rok_produkcji;
        this.cena = price;
        this.engine_capacity = engine_capacity;
        this.power = power;
        this.fuel_type = fuel_type;
        this.type = type;

    }

    //Geters and setters
    public int getId_pojazdu() {
        return id_pojazdu;
    }

    public void setId_pojazdu(int id_pojazdu) {
        this.id_pojazdu = id_pojazdu;
    }

    public boolean isDostepnosc() {
        return dostepnosc;
    }

    public void setDostepnosc(boolean dostepnosc) {
        this.dostepnosc = dostepnosc;
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



    public float getEngine_capacity() {
        return engine_capacity;
    }

    public void setEngine_capacity(float engine_capacity) {
        this.engine_capacity = engine_capacity;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public String getFuel_type() {
        return fuel_type;
    }

    public void setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



   //Generate to String
    @Override
    public String toString() {
        return "Car{" +
                "id=" + id_pojazdu +
                ", available=" + dostepnosc +
                ", production_year=" + rok_produkcji +
                ", price=" + cena +
                ", engine_capacity=" + engine_capacity +
                ", power=" + power +
                ", fuel_type='" + fuel_type + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
