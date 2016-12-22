package com.fnd.term;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fnd.term.services.FirstNameService;

@Controller
public class LocationController {
	
	@Autowired
	FirstNameService firstNameService;

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false) String name, Model model) {
    	name = firstNameService.getName();
        model.addAttribute("name", name);
        return "greeting";
    }

}
