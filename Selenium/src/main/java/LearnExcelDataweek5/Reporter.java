package LearnExcelDataweek5;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public abstract class Reporter {
	public static ExtentTest test;
	public static ExtentReports report;
	public String testCaseName, testDescription, category, authors;

	public void reportStep(String desc, String status) {
		if (status.equalsIgnoreCase("pass")) {
			test.log(LogStatus.PASS, desc);
		} else if (status.equalsIgnoreCase("fail")) {
			test.log(LogStatus.FAIL, desc);
		}
	}
	public void startResult() {
		report = new ExtentReports("./reports/result.html", false);
		report.loadConfig(new File("./extent-config.xml"));
	}
	public void startTestCase(String testCaseName, String testDescription) {
		test = report.startTest(testCaseName, testDescription);
	}
	public void endResult() {
		report.flush();
	}
	public void endTestcase() {
		report.endTest(test);
	}
	
}