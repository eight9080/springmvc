package ro.dg.springmvcex.EventTracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import ro.dg.springmvcex.EventTracker.model.Event;

@Controller
@SessionAttributes("event")
public class EventController {

    @RequestMapping(value = "event", method = RequestMethod.GET)
    public String displayEventPage(Model model){
        final Event event = new Event();
        event.setName("event1");
        model.addAttribute("event", event);
        return "event";
    }

    @RequestMapping(value = "/event", method = RequestMethod.POST)
    public String processEvent(@ModelAttribute("event") Event event){
        System.out.println("Event: "+event);
        return "redirect:index.html";
    }

}
