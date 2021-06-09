package bdbt_wt_proj;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

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


//    @org.junit.jupiter.api.Test
//    void save_marki() {
//        Marki marki = new Marki(0,"Fiat");
//        dao.save_marki(marki);
//    }

    @org.junit.jupiter.api.Test
    void save_modele() {
        List<Marki> listMarki = dao.list_marki();

        Modele modele = new Modele(0, "TEST", listMarki.get(listMarki.size()-1).getId_marki());
        dao.save_modele(modele);
    }

    @org.junit.jupiter.api.Test
    void save() {
        int randomNum = ThreadLocalRandom.current().nextInt(10000, 99999);
        String nr_vin="V21GBFHSGD61"+randomNum;
        Car car = new Car("NIE", 2000, 10000, nr_vin, 2.5f,100,"LPG", 5,"SUV", "Automatyczna", 61 );
        dao.save(car);//trzba pamietać o roznych nr_vin bo dwa identycznie nie wejda do bazy
    }

    @org.junit.jupiter.api.Test
    void get() {

    }

    @org.junit.jupiter.api.Test
    void update() {
        int randomNum = ThreadLocalRandom.current().nextInt(10000, 99999);
        String nr_vin="V21GBFHSGD61"+randomNum;
        Car car = new Car("NIE", 0000, 10000, nr_vin, 2.5f,100,"LPG", 5,"SUV", "Automatyczna", 61 );
        car.setId_pojazdu(4);
        car.setDostepny("TAK");
        car.setMoc(50);

        dao.update(car);

    }

    @org.junit.jupiter.api.Test
    void delete() {
        int id_pojazdu = 54;
        dao.delete(id_pojazdu);
    }
}