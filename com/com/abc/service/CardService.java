package com.abc.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abc.bean.Card;

@Transactional
@Service
public class CardService {

	public boolean validateCard(Card card) {
		boolean valid= false;
		
		valid=true;
		return valid;
	}

}
