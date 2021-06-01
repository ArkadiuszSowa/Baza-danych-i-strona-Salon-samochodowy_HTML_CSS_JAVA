package bdbt_wt_proj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public CarDAO(JdbcTemplate jdbcTemplate){
        super();
        this.jdbcTemplate=jdbcTemplate;
    }

    public List<Car> list(){
        String sql="SELECT  p.id_pojazdu, p.dostepny, p.rok_produkcji, p.cena, p.moc, p.rodzaj_paliwa, p.typ, mo.nazwa_modelu, ma.nazwa_marki FROM ((pojazdy p INNER JOIN modele mo ON mo.id_modelu=p.id_modelu) INNER JOIN marki ma ON ma.id_marki=mo.id_marki)";
        List<Car> listCar=jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Car.class));
        System.out.println(listCar);
        return listCar;
    }

    //insert
    public void save(Car car){

    }

    //read
    public Car get(int id){
        return null;
    }

    //update
    public void update(Car car){

    }

    //delete
    public void delete(int id){

    }

}
