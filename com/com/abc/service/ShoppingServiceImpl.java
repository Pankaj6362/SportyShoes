package com.abc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abc.bean.Card;
import com.abc.bean.Item;
import com.abc.bean.Order;
import com.abc.dao.ShoppingDao;
@Transactional
@Service
public class ShoppingServiceImpl implements ShoppingService {
	@Autowired
	private ShoppingDao sDao;
	@Autowired
	private CardService cardService;
	
	@Override
	public List<Item> getItems() {
		
		return sDao.getItems();
	}

	@Override
	public Item getItem(Item item) {
		return sDao.getItem(item);
	}

	@Override
	public Order buyItem(Card card) {
		boolean cardValid = cardService.validateCard(card);
		if(cardValid) {
		return sDao.buyItem(card);
		}
		return null;
	}
		


}
