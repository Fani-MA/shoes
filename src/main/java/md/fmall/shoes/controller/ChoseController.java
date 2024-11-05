package md.fmall.shoes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChoseController {


    @GetMapping("/home_page")
    public String homePage() {
        System.out.println("Call start_pages");
        return "home";
    }

    @GetMapping("/start_page")
    public String startPage() {
        System.out.println("Call start_pages");
        return "startPage";
    }

}
