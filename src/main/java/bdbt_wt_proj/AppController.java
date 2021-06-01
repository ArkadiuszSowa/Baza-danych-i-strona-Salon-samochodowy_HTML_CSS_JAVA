package bdbt_wt_proj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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
}
