package bdbt_wt_proj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
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

    public List<Car> listAll(){
        String sql="SELECT  p.id_pojazdu, p.dostepny, p.nr_vin, p.rok_produkcji, p.cena, p.moc, p.rodzaj_paliwa, p.typ, mo.nazwa_modelu, ma.nazwa_marki FROM ((pojazdy p INNER JOIN modele mo ON mo.id_modelu=p.id_modelu) INNER JOIN marki ma ON ma.id_marki=mo.id_marki)";
        List<Car> listCar=jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Car.class));

        return listCar;
    }

    public List<Car> list(){
        String sql="SELECT p.id_pojazdu, p.dostepny, p.rok_produkcji, p.cena, p.moc, p.rodzaj_paliwa, p.typ, mo.nazwa_modelu, ma.nazwa_marki FROM ((pojazdy p INNER JOIN modele mo ON mo.id_modelu=p.id_modelu) INNER JOIN marki ma ON ma.id_marki=mo.id_marki) WHERE p.dostepny='TAK'";
        List<Car> listCar=jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Car.class));

        return listCar;
    }


    public List<Modele> list_modele(){
        String sql= "SELECT modele.id_modelu, modele.nazwa_modelu, marki.nazwa_marki FROM (modele INNER JOIN marki ON modele.id_marki=marki.id_marki)";
        List<Modele> listModele=jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Modele.class));

        return listModele;
    }

    public List<Marki> list_marki(){
        String sql= "Select id_marki from marki";
        List<Marki> listMarki=jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Marki.class));

        return listMarki;
    }


    public void save_marki(Marki marki){
        SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
        insertActor.withTableName("marki").usingColumns("id_marki", "nazwa_marki");
        BeanPropertySqlParameterSource param_marka = new BeanPropertySqlParameterSource(marki);
        insertActor.execute(param_marka);
    }
    public void save_modele(Modele modele){
        SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
        insertActor.withTableName("modele").usingColumns("id_modelu","nazwa_modelu","id_marki");
        BeanPropertySqlParameterSource param_model = new BeanPropertySqlParameterSource(modele);
        insertActor.execute(param_model);
    }

    //insert
    public void save(Car car){
        SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
        insertActor.withTableName("pojazdy").usingColumns("id_pojazdu","dostepny","rok_produkcji","cena","nr_vin","pojemnosc_silnika","moc","rodzaj_paliwa","liczba_miejsc_siedzacych","typ","skrzynia_biegow","id_salonu","id_modelu","id_koloru");
        BeanPropertySqlParameterSource param_car = new BeanPropertySqlParameterSource(car);
        insertActor.execute(param_car);
    }


    //read
    public Car get(int id_pojazdu){
        Object[] args ={id_pojazdu};
        String sql = "SELECT * FROM pojazdy WHERE id_pojazdu= "+args[0];
        Car car = jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Car.class));

        return car;
    }

    //update
    public void update(Car car){
        String sql= "UPDATE POJAZDY SET dostepny=:dostepny, rok_produkcji=:rok_produkcji, cena=:cena, nr_vin=:nr_vin, pojemnosc_silnika=:pojemnosc_silnika, moc=:moc, rodzaj_paliwa=:rodzaj_paliwa, liczba_miejsc_siedzacych=:liczba_miejsc_siedzacych, typ=:typ, skrzynia_biegow=:skrzynia_biegow, id_modelu=:id_modelu WHERE id_pojazdu=:id_pojazdu";
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(car);
        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);

        template.update(sql,param);
    }

    public void update_reserved(Car car){
        String sql= "UPDATE POJAZDY SET dostepny=:dostepny WHERE id_pojazdu=:id_pojazdu";
        car.setDostepny("NIE");
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(car);
        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);

        template.update(sql,param);
    }

    //delete
    public void delete(int id_pojazdu){
        String sql = "DELETE FROM POJAZDY WHERE id_pojazdu = ?";
        jdbcTemplate.update(sql,id_pojazdu);

    }

}
