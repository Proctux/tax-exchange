package com.ies.poo.tax.teste.exchange;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.ies.poo.tax.exchange.CurrenciesTypes;
import com.ies.poo.tax.exchange.Currency;
import com.ies.poo.tax.exchange.Customer;
import com.ies.poo.tax.exchange.Exchange;
import com.ies.poo.tax.exchange.Wallet;

public class ExchangeTest {
	@Test
	public void testName() throws Exception {
		Customer luiz = new Customer("Luiz", "000.000.000-12", 25, 'M');
		Wallet luizWallet = new Wallet(new Currency(1000.00F, CurrenciesTypes.BRL), "Preta", luiz);
		Exchange exchange = new Exchange(luizWallet);
		
		exchange.exchangeMoney(CurrenciesTypes.BRL, CurrenciesTypes.USD, 950.00);
		exchange.exchangeMoney(CurrenciesTypes.USD, CurrenciesTypes.BRL, 150.00);
	}
}
