package ro.dg.springmvcex.EventTracker;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(Model model/*, @RequestParam(value="name", required=false, defaultValue="World") String name*/) {
//        model.addAttribute("name", name);
        return "hello";
    }
}