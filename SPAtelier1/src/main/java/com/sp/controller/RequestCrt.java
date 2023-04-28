package com.sp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller 
public class RequestCrt {
	
	@Autowired
	CardDAO cardDao;

	@RequestMapping(value = { "/", "/card" }, method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("cardList", cardDao.getCards());
		return "card";
	}
	
	@RequestMapping(value = {"/addCard"}, method = RequestMethod.GET)
	public String addCard(Model model) {
		return "oui";
	}

}
