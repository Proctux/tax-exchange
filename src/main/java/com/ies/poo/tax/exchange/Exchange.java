package com.ies.poo.tax.exchange;

public class Exchange {
	private Wallet wallet;

	
	public Exchange(Wallet wallet) {
		this.wallet = wallet;
	}
	
	
	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
	
	public Float realAsComparator(CurrenciesTypes currency) {	
		if(currency == CurrenciesTypes.AUD) {
			return 4.37F;
		}
		if(currency == CurrenciesTypes.USD) {
			return 5.65F;
		}
		if(currency == CurrenciesTypes.CAD) {
			return 4.52F;
		}
		if(currency == CurrenciesTypes.EUR) {
			return 6.77F;
		}
		return 1.00F;
	}
	
	
	public Float exchangeMoney(CurrenciesTypes hasCurrency, CurrenciesTypes wantCurrency, Double amount) {
		String strAmount = amount.toString();
		Float floatValue = realAsComparator(hasCurrency) / realAsComparator(wantCurrency) * Float.parseFloat(strAmount);
		Integer index = -1;
		
		for(Integer i = 0; i < wallet.getCurrencies().size(); i++) {
			if(wallet.getCurrencies().get(i).getType() == hasCurrency) {
				index = i;
			}
		};
		
		if(index >= 0) {
			wallet.getCurrencies().get(index).setAmount(wallet.getCurrencies().get(index).getAmount() - Float.parseFloat(strAmount));
			wallet.getCurrencies().add(new Currency(floatValue, wantCurrency));
		}
		
		System.out.println((wallet.getCurrencies().get(index).getAmount()));
		System.out.println((wallet.getCurrencies().get(index).getType()));
		System.out.println((wallet.getCurrencies().get(index + 1).getAmount()));
		System.out.println((wallet.getCurrencies().get(index + 1).getType()));
		
		return floatValue;
	}
	
}
