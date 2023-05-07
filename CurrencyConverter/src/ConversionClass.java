import java.util.ArrayList;

public class ConversionClass {

private ArrayList<Currency> Allnotes = new ArrayList<Currency>();

public ConversionClass() {
savecurrencies();	
	
}
 

private void savecurrencies() {
	Currency c1 = new Currency("Naira" , 570.00);
	Allnotes.add(c1);
	Currency c2 = new Currency("JPY" , 114.322);
	Allnotes.add(c2);
    Currency c3 = new Currency("EUR" , 0.881);
    Allnotes.add(c3);
    Currency c4 = new Currency("POUND" , 0.734);
    Allnotes.add(c4);
    Currency c5 = new Currency("AUD" , 1.387);
    Allnotes.add(c5);
	Currency c6 = new Currency("BAM" , 1.724);
	Allnotes.add(c6);
    Currency c7 = new Currency("CAD" , 1.249);
    Allnotes.add(c7);
    Currency c8 = new Currency("RUPEE" , 74.398);
    Allnotes.add(c8);
    Currency c9 = new Currency("MYR" , 4.1902);
    Allnotes.add(c9);
	Currency c10 = new Currency("NOK" , 8.778);
	Allnotes.add(c10);
    Currency c11 = new Currency("KGS" , 84.7935);
    Allnotes.add(c11);
    Currency c12 = new Currency("FRANC" , 0.915);
    Allnotes.add(c12);
    Currency c13 = new Currency("PESO" , 20.415);
    Allnotes.add(c13);
	Currency c14 = new Currency("RIYAL" , 3.7452);
	Allnotes.add(c14);
    Currency c15 = new Currency("BND" , 1.348);
    Allnotes.add(c15);
    Currency c16 = new Currency("RAND" , 15.38);
    Allnotes.add(c16);
    Currency c17 = new Currency("CEDI" , 6.23);
    Allnotes.add(c17);
	Currency c18 = new Currency("NAD" , 15.3897);
	Allnotes.add(c18);
    Currency c19 = new Currency("HAF" , 314.353);
    Allnotes.add(c19);
    Currency c20 = new Currency("JMD" , 153.457);
    Allnotes.add(c20);
} 

public String listallcurrency() {
	  String S = " " ;
	for(Currency notes : Allnotes) {
		 S = S + "\n" +notes.getcurrencyname();
		 //return S;
	}
	return S;
}

public Currency getCurrency(String S) {
	for (Currency XX : Allnotes) {
		String name = XX.getcurrencyname();
		if (name.equals(S)){
			return XX;	
		}	
	}
return null;
}


public double convertcurrencies(Currency fromC, Currency ToC, int amt) {
	
	double GG  = fromC.currency2dollar(amt);   // Currency converted to dollar
	GG = ToC.dollar2currency(GG);                      // Dollar to required currency
	return GG;
	
	
}

}
