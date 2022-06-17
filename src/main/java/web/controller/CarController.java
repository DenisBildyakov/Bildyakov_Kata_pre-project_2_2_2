package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> list = carService.getCarList();

        if (count != null && count < carService.getCarList().size()) {
            list = carService.countedCarList(count);
        }

        model.addAttribute("cars", list);
        return "cars";
    }
}
