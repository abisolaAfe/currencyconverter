
public class Currency {
private double currency2dollarrate;
private String currencyname;


public Currency(String nme,double rate) 
{
currency2dollarrate = rate;
currencyname = nme;
}

public double getcurrency2dollar( ) {
	return currency2dollarrate;
}

public String getcurrencyname() {
	return currencyname;
}

public double dollar2currency(double dollaramt) {
  	double dollamt = currency2dollarrate * dollaramt;
  	return dollamt;
}

public double currency2dollar(double currencyamt) {
	double currencyrte = currencyamt/currency2dollarrate;
	return currencyrte;
}

public String toString() {
	
	String S = "currency name: "  + currencyname + "rate: " +  currency2dollarrate ;
	return S;
	
}


}
