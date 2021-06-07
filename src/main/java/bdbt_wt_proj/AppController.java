package bdbt_wt_proj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AppController {

    @Autowired
 private CarDAO dao;

 @RequestMapping("/samochody")
 public String viewCar(Model model){

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
     dao.update(car);

     return "add_car";
 }

    @RequestMapping("/")
    public String vievHomePage(Model model){


        return "test";
    }

    @RequestMapping("/kontakt")
    public String contact(Model model){


        return "contact";
    }

 @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(@ModelAttribute("car") Car car){
     dao.save(car);
     return "redirect:/samochody";
    }

    @RequestMapping("/edit/{id_pojazdu}")
    public ModelAndView showEditForm(@PathVariable(name = "id_pojazdu")int id_pojazdu){
     ModelAndView mav = new ModelAndView("edit_car");
     Car car = dao.get(id_pojazdu);
     mav.addObject("car",car);

     return mav;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(@ModelAttribute("car")Car car){
     dao.update(car);
     return "redirect:/samochody";
    }

    @RequestMapping("/delete/{id_pojazdu}")
    public String delete (@PathVariable(name = "id_pojazdu")int id_pojazdu){
     dao.delete(id_pojazdu);
     return "redirect:/samochody";
    }

}
