package com.SpringBoot_thymeleaf_5.SpringBoot_thymeleaf_5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller  
public class DemoController 
{  
@RequestMapping("/")  
public String index()
{  
//returns to index.html
return"index";  
}  
@RequestMapping(value="/save", method=RequestMethod.POST)  
public ModelAndView save(@ModelAttribute User user)
{  
ModelAndView modelAndView = new ModelAndView(); 

///user-data is user-data.html both are same
modelAndView.setViewName("user-data");      
modelAndView.addObject("user", user);    
return modelAndView;  
}  
}  