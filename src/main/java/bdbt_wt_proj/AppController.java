package bdbt_wt_proj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AppController {

    @Autowired
 private CarDAO dao;

 @RequestMapping("/")
 public String viewHomePage(Model model){

     List<Car> listCar = dao.list();
     model.addAttribute("listCar", listCar);
     System.out.println(listCar);
     return "index";
 }

 @RequestMapping("/new")
    public String showNewForm(Model model){
     Car car = new Car();
     Marki marki = new Marki();
     Modele modele = new Modele();
     model.addAttribute("car", car);
     model.addAttribute("modele", modele);
     model.addAttribute("marki", marki);

     return "add_car";
 }


}
