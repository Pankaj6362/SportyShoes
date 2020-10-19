package com.abc.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="order_hib")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String custName;
	private long custMobile;
	private int itemId;
	private int quantity;
	@Column(name="purchase_date")
	private Date purchaseDate;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int id, String custName, long custMobile, int itemId, int quantity, Date purchaseDate) {
		super();
		this.id = id;
		this.custName = custName;
		this.custMobile = custMobile;
		this.itemId = itemId;
		this.quantity = quantity;
		this.purchaseDate = purchaseDate;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", custName=" + custName + ", custMobile=" + custMobile + ", itemId=" + itemId
				+ ", quantity=" + quantity + ", purchaseDate=" + purchaseDate + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public long getCustMobile() {
		return custMobile;
	}
	public void setCustMobile(long custMobile) {
		this.custMobile = custMobile;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	
	
}
