package com.ies.poo.tax.exchange;

public class Currency {
	private Float amount;
	private CurrenciesTypes type;
	
	public Currency(Float amount, CurrenciesTypes type) {
		this.amount = amount;
		this.type = type;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public CurrenciesTypes getType() {
		return type;
	}

	public void setType(CurrenciesTypes type) {
		this.type = type;
	}
	
	
}
