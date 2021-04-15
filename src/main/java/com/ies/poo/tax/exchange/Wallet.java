package com.ies.poo.tax.exchange;

import java.util.ArrayList;
import java.util.List;

public class Wallet {
	private List<Currency> currencies;
	private String color;
	private Customer owner;

	public Wallet(Currency currency, String color, Customer owner) {
		currencies = new ArrayList<Currency>();
		
		currencies.add(currency);
		this.color = color;
		this.owner = owner;
	}

	public List<Currency> getCurrencies() {
		return currencies;
	}

	public void setCurrencies(List<Currency> currencies) {
		this.currencies = currencies;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Customer getOwner() {
		return owner;
	}

	public void setOwner(Customer owner) {
		this.owner = owner;
	}
}
