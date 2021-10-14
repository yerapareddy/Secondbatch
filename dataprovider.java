package testngtraining;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	@Test(dataProvider="capital")
	public static void capitalofstate(String state, String capital){
		System.out.println("capital of "+state+ " is "+capital);
		
	}
	
	@DataProvider(name="capital")
	public Object[][] getcapitalofstates(){
		Object[][] capitals = new Object[3][2];
		capitals[0][0]="AP";
		capitals[0][1]="Vizag";
		capitals[1][0]="TS";
		capitals[1][1]="Hyderabad";
		capitals[2][0]="KA";
		capitals[2][1]="Bangalore";
		return capitals;
		
	}

}
