package ExcelDataApache;

import java.io.File;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class ReportsLearning {
	@Test
	public void createReport(){
		
		ExtentReports reports = new ExtentReports("./reports/result.html",false);
		reports.loadConfig(new File("./extentconfig.xml"));
		
		ExtentTest test = reports.startTest("CreateLead", "The lead is created");
		test.log(LogStatus.PASS, "Launch browser", " Launching the browser");
		test.log(LogStatus.WARNING, "Title", "Title has warnings");
		test.log(LogStatus.FAIL, "User name", "User name mismatch");
		test.assignAuthor("Deepa");
		test.assignCategory("smoke");
	    reports.endTest(test);
	    reports.flush();
	}

}
