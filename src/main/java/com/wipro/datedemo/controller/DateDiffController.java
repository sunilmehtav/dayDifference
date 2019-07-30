package com.wipro.datedemo.controller;

import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.datedemo.modal.DateForm;

@Controller
public class DateDiffController {

	@RequestMapping(value="/result", method=RequestMethod.POST)
	public ModelAndView getDateDifference(@ModelAttribute("dateForm") DateForm dateForm, 
			Model model, BindingResult result)throws Exception {
		//ASSUMING FORM IS FILLED AND NO BindingResult ERROR 
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		long diff = (format.parse(dateForm.getEndDate())).getTime() - (format.parse(dateForm.getStartDate())).getTime();
		ModelAndView mv=new ModelAndView("result");
        mv.addObject("difference",diff / 1000 / 60 / 60 / 24);
        
		return mv;
	}
}
