package com.sp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sp.model.CardFormDTO;
import com.sp.model.Card;

@Controller 
public class RequestCrt {
	
	@Autowired
	CardDAO cardDao;

	@RequestMapping(value = { "/", "/card" }, method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("cardList", cardDao.getCards());
		return "card";
	}
	
	@RequestMapping(value ="/addCard", method = RequestMethod.GET)
	public String addCard(Model model) {
		CardFormDTO cardForm = new CardFormDTO();
		model.addAttribute("cardForm", cardForm);
		return "addCard";
	}
	
	@RequestMapping(value = "/addCard", method = RequestMethod.POST)
	public String addCard(Model model, @ModelAttribute("cardForm") CardFormDTO cardForm) {
		Card newCard = new Card(cardForm.getUser(), cardForm.getName(), cardForm.getFamilyName(),
				cardForm.getComments(), cardForm.getDescription(), cardForm.getImgPath(),
				cardForm.getFamilyPath(), cardForm.getHp(), cardForm.getEnergy(), cardForm.getDefence(), cardForm.getAttack());
		cardDao.addCard(newCard);
		return "card";
	}
	
	@RequestMapping(value = {"/fetchCard"}, method = RequestMethod.GET)
	public String fetchCard(Model model, @RequestParam String name) {
		System.out.println(name);
		Card card = cardDao.getCard(name);
		if( card != null) {
			model.addAttribute("card", card);
			return "fetchCard";
		} else { System.out.println("No such card found !"); return "card";}
	}

}
