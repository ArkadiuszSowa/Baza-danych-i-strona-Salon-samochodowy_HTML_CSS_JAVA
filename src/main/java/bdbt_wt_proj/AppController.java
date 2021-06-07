package bdbt_wt_proj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    public String showAddCar(Model model){
     Car car = new Car();
     Marki marki = new Marki();
     Modele modele = new Modele();
     model.addAttribute("car", car);
     model.addAttribute("modele", modele);
     model.addAttribute("marki", marki);

     return "add_car";
 }

    @RequestMapping("/elo")
    public String elo(Model model){


        return "test";
    }

 @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save_car(@ModelAttribute("car") Car car){
     dao.save_car(car);
     return "redirect:/";
    }

}
