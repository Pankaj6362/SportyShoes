package com.abc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.abc.bean.Card;
import com.abc.bean.Item;
import com.abc.bean.Order;
import com.abc.service.ShoppingService;

@Controller
public class ShoppingController {
	@Autowired
	private ShoppingService service;
	
	@RequestMapping(value="/proceed", method = RequestMethod.GET)
	public String showItems(Model model) {
		List<Item> itemList = service.getItems();
		model.addAttribute("ilist", itemList);
		model.addAttribute("sitem", new Item());
		return "display";
		
	}
	@RequestMapping(value="/placeOrder", method=RequestMethod.GET)
	public String placeOrder(@ModelAttribute(value="sitem")Item item, Model model) {
		System.out.println("Item:"+item);
		Item itm= service.getItem(item);
		System.out.println("Item from db:"+ itm);
		if(itm!=null) {
			Card card = new Card();
			card.setItemId(item.getId());
			model.addAttribute("citem", card);
		}else {
			
		}
		return "order";
		
	}
	
	@RequestMapping(value="/buyItem", method = RequestMethod.GET)
	public String buyItem(@ModelAttribute(value="citem")Card card, Model model) {
		System.out.println("Card: "+ card);
		Order order = service.buyItem(card);
		System.out.println("order: "+ order);
		if(order==null) {
			model.addAttribute("err", "Card Validation Failed");
			return "fail";
		}
		model.addAttribute("oitem", order);
		return "success";
		
	}

}
