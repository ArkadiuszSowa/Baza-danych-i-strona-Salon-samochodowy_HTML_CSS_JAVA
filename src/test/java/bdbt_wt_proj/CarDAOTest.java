package bdbt_wt_proj;

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
    }

    @org.junit.jupiter.api.Test
    void save() {
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