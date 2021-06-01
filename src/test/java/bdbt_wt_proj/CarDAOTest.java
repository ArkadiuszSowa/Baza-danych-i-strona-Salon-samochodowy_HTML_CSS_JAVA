package bdbt_wt_proj;

import ch.qos.logback.core.sift.AppenderTracker;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarDAOTest extends Object {

    private CarDAO dao;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        DriverManagerDataSource dataSource=new DriverManagerDataSource();
        dataSource.setUrl("jdbc:oracle:thin:@ora3.elka.pw.edu.pl:1521:ora3inf");
        dataSource.setUsername("asowa");
        dataSource.setPassword("asowa");
        dataSource.setDriverClassName("oracle.jdbc.OracleDriver");

        dao = new CarDAO(new JdbcTemplate(dataSource));
    }

    @org.junit.jupiter.api.Test
    void list() {
        List<Car> listCar = dao.list();
        assertFalse(listCar.isEmpty());
        List<Marki> listMarki = dao.list_marki();
        assertFalse(listMarki.isEmpty());
        List<Modele> listModele = dao.list_modele();
        assertFalse(listModele.isEmpty());
    }


    @org.junit.jupiter.api.Test
    void save_marki() {
        Marki marki = new Marki(0,"Fiat");
        dao.save_marki(marki);
    }

    @org.junit.jupiter.api.Test
    void save_modele() {
        List<Marki> listMarki = dao.list_marki();
        System.out.println(listMarki.get(listMarki.size()-1).getId_marki());
        Modele modele = new Modele(0, "TEST", listMarki.get(listMarki.size()-1).getId_marki());
        dao.save_modele(modele);
    }

    @org.junit.jupiter.api.Test
    void save_car() {
        List<Modele> listModele = dao.list_modele();//todo int id marki i id modelu
        Car car = new Car(0, "NIE", 0000, 10000, 10.5f, "brak", "brak");
        dao.save_car(car);
    }

    @org.junit.jupiter.api.Test
    void get() {
    }

    @org.junit.jupiter.api.Test
    void update() {
    }

    @org.junit.jupiter.api.Test
    void delete() {
    }
}