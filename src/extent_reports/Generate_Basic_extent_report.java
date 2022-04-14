package extent_reports;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Generate_Basic_extent_report {

public static void  main(String [] args) {
	//start reports
	ExtentSparkReporter ehr = new ExtentSparkReporter("extentreports.xml");
// create extent report and attach reporter
	ExtentReports e = new ExtentReports();
	e.attachReporter(ehr);
// create a toggle for given test add an log events under it
	ExtentTest test = e.createTest("google search test one " , " this is  a test to validate google search functionality");











}
	
	

}
