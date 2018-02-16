package ro.dg.springmvcex.EventTracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ro.dg.springmvcex.EventTracker.model.Attendee;

import javax.validation.Valid;

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
    public String processAttendee(@Valid Attendee attendee, BindingResult result,
                                  Model model){

        System.out.println("Attendee: " + attendee);

        if(result.hasErrors()){
            return "attendee";
        }

        return "redirect:index.html";
    }

}
