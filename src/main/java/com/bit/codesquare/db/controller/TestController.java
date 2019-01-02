package com.bit.codesquare.db.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit.codesquare.db.dto.Test;
import com.bit.codesquare.db.service.TestService;
 
@Controller
public class TestController {
    @Autowired
    TestService testService;
    
    @RequestMapping("/")
    public String query(Model model) throws Exception{
        model.addAttribute("list",testService.getAll());
    	return "testTemplate";
    }
    
    @RequestMapping(value="/input", method = RequestMethod.POST)
    public String input(Model model, @ModelAttribute Test test) throws Exception{
    	testService.insert(test);
    	return "redirect:/query";
    }
    
    @RequestMapping(value="/delete", method = {RequestMethod.GET,RequestMethod.POST})
    public String delete(Model model, @ModelAttribute Test test) throws Exception{
    	testService.delete(test.getId());
    	return "redirect:/query";
    }
    
    @RequestMapping(value="/update", method = RequestMethod.POST)
    public String update(Model model, @ModelAttribute Test test) throws Exception{
    	testService.update(test);
    	return "redirect:/query";
    }
}
