package com.sp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.sp.model.Card;
import com.sp.model.User;

@Service
public class CardDAO {
	private List<Card> cards;

	public CardDAO() {
		List<Card> cards = new ArrayList<Card>();
		Card card1 = new Card(new User(), "SuperMan", "DC Comics",
				1000, "The origin story of Superman relates that he was born Kal-El on the planet Krypton, "
				+ "before being rocketed to Earth as an infant by his scientist father Jor-El, moments "
				+ "before Krypton's destruction. Discovered and adopted by a farm couple from Kansas, "
				+ "the child is raised as Clark Kent and imbued with a strong moral compass. Early in his "
				+ "childhood, he displays various superhuman abilities, which, upon reaching maturity, he "
				+ "resolves to use for the benefit of humanity through a 'Superman' identity.",
				"http://www.superherobroadband.com/app/themes/superhero/assets/img/superhero.gif",
				"https://upload.wikimedia.org/wikipedia/commons/thumb/1/1c/DC_Comics_logo.png/280px-DC_Comics_logo.png",
				50, 100, 17, 80);
		Card card2 = new Card(new User(),"Ce gars", "CPE Comics", 122, "",
				"https://media.giphy.com/media/l4q8hciiYNT5RGi4w/giphy.gif",
				"https://media.giphy.com/media/l4q8hciiYNT5RGi4w/giphy.gif",
				60, 80, 25, 69);
		Card card3 = new Card(new User(), "Raphael", "Livre", 180, "",
				"http://www.superherobroadband.com/app/themes/superhero/assets/img/superhero.gif",
				"http://www.superherobroadband.com/app/themes/superhero/assets/img/superhero.gif",
				70,58,12,46);
		
		cards.add(card1);
		cards.add(card2);
		cards.add(card3);	
		this.cards = cards;
	}
	
	public void addCard(Card c) {cards.add(c);}
	
	public void delCard(Card c) {
		if (this.cards.contains(c)){
			this.cards.remove(c);
		}
	}
	
	public Card getCard(String name) {
		for (Card card : this.cards) {
			if (card.getName().equals(name)){
				return card;
			}
		} return null;
	}
	
	public List<Card> getCards() {return this.cards;}
	
}
