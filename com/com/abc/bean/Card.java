package com.abc.bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Card {
	private int id;
	private String cardNo;
	private String name;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date expiry;
	private int cvv;
	private int itemId;
	private long mobile;
	private int quantity;
	
	public Card() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Card [id=" + id + ", cardNo=" + cardNo + ", name=" + name + ", expiry=" + expiry + ", cvv=" + cvv
				+ ", itemId=" + itemId + ", mobile=" + mobile + ", quantity=" + quantity + "]";
	}

	public int getId() {
		return id;
	}

	public Card(int id, String cardNo, String name, Date expiry, int cvv, int itemId, long mobile, int quantity) {
		super();
		this.id = id;
		this.cardNo = cardNo;
		this.name = name;
		this.expiry = expiry;
		this.cvv = cvv;
		this.itemId = itemId;
		this.mobile = mobile;
		this.quantity = quantity;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getExpiry() {
		return expiry;
	}

	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
