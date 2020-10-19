package com.abc.dao;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.abc.bean.Card;
import com.abc.bean.Item;
import com.abc.bean.Order;

@Transactional
@Repository
public class ShoppingDaoImpl implements ShoppingDao {
	
	@PersistenceContext
	EntityManager em;
	
	@Override
	public List<Item> getItems() {
		//		return null;
		List<Item> itemList = new ArrayList<>();
//		itemList.add(new Item());
		String qry ="select itm from Item itm";
		try {
		TypedQuery<Item> query = em.createQuery(qry, Item.class);
		itemList = query.getResultList();
		}
		catch (Exception e) {
			System.out.println("Error fetching items from db");
		}
		return itemList;
	}

	@Override
	public Item getItem(Item item) {
		Item itm = em.find(Item.class, item.getId());
		return itm;
	}

	@Override
	public Order buyItem(Card card) {
		Order order = new Order();
		Item itm = em.find(Item.class, card.getItemId());
		System.out.println("Item : "+itm);
		order.setCustName(card.getName());
		order.setItemId(itm.getId());
		order.setPurchaseDate(new Date());
		order.setQuantity(card.getQuantity());
		order.setCustMobile(card.getMobile());;
		em.persist(order);
		return order;
	}

}
