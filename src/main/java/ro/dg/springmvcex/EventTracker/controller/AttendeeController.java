package ro.dg.springmvcex.EventTracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ro.dg.springmvcex.EventTracker.model.Attendee;

@Controller
public class AttendeeController {

    @RequestMapping(value = "/attendee", method = RequestMethod.GET)
    public String displayAttendeePage(Model model){
        final Attendee attendee = new Attendee();
        attendee.setName("Name1");
        attendee.setEmailAddress("email");
        model.addAttribute("attendee", attendee);

        return "attendee";
    }


    @RequestMapping(value = "/attendee", method = RequestMethod.POST)
    public String processAttendee(@ModelAttribute("attendee") Attendee attendee){

        System.out.println("Attendee: " + attendee);
        return "redirect:index.html";
    }

}
