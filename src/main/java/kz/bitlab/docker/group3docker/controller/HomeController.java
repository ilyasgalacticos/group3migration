package kz.bitlab.docker.group3docker.controller;


import kz.bitlab.docker.group3docker.CarRepository;
import kz.bitlab.docker.group3docker.db.Item;
import kz.bitlab.docker.group3docker.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    private CarRepository carRepository;

    @GetMapping(value = "/")
    public String index(Model model){
        model.addAttribute("cars", carRepository.findAll());
        return "index";
    }

    @PostMapping(value = "/add-car")
    public String addCar(Car car){
        carRepository.save(car);
        return "redirect:/";
    }
}
