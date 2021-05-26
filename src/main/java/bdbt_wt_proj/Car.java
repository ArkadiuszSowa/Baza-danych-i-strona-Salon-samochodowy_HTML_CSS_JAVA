package bdbt_wt_proj;

import java.util.Arrays;

public class Car {
    private int id;
    private boolean available;
    private int production_year;
    private int price;
    private char[] nr_vin = new char [17];
    private float engine_capacity;
    private float power;
    private String fuel_type;
    private int number_of_seats;
    private String type;
    private String gearbox;

    public Car(){

    }


    public Car(int id, boolean available, int production_year, int price, char[] nr_vin, float engine_capacity, float power, String fuel_type, int number_of_seats, String type, String gearbox) {
        super (); //jemu to eclips dopisał więc ja też wstawiam
        this.id = id;
        this.available = available;
        this.production_year = production_year;
        this.price = price;
        this.nr_vin = nr_vin;
        this.engine_capacity = engine_capacity;
        this.power = power;
        this.fuel_type = fuel_type;
        this.number_of_seats = number_of_seats;
        this.type = type;
        this.gearbox = gearbox;
    }

    //Geters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getProduction_year() {
        return production_year;
    }

    public void setProduction_year(int production_year) {
        this.production_year = production_year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public char[] getNr_vin() {
        return nr_vin;
    }

    public void setNr_vin(char[] nr_vin) {
        this.nr_vin = nr_vin;
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

    public int getNumber_of_seats() {
        return number_of_seats;
    }

    public void setNumber_of_seats(int number_of_seats) {
        this.number_of_seats = number_of_seats;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

   //Generate to String
    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", available=" + available +
                ", production_year=" + production_year +
                ", price=" + price +
                ", nr_vin=" + Arrays.toString(nr_vin) +
                ", engine_capacity=" + engine_capacity +
                ", power=" + power +
                ", fuel_type='" + fuel_type + '\'' +
                ", number_of_seats=" + number_of_seats +
                ", type='" + type + '\'' +
                ", gearbox='" + gearbox + '\'' +
                '}';
    }
}
