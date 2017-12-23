package testngtests;

import org.testng.annotations.DataProvider;

public class Learndata {
	@DataProvider(name = "getthedata")
	public static Object[][] supplydata(){
		
		Object[][] data = new Object[2][5];
		data[0][0] = "Accenture";
		data[0][1] = "Sruthi";
		data[0][2]= "Vinay";
		data[0][3] = 2;
		data[0][4] = "Demo Marketing Campaign";
		
		data[1][0] = "Cts";
		data[1][1] = "Deepa";
		data[1][2]= "Vanu";
		data[1][3] = 5;
		data[1][4] = "Automobile";
		
		return data;
	}

}
