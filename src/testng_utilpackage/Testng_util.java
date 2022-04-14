package testng_utilpackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Testng_util {
	
	File f = new File("D:\\ECLIPSEPYTHON VERSION WORKSPACE\\Testng_practies\\src\\tetng_testdata\\Book1.xlsx");
	 
	FileInputStream fs= new FileInputStream(f);
	//workbook level
	XSSFWorkbook workbook = new XSSFWorkbook(fs);
	//sheet level	
	XSSFSheet sheet = workbook.getSheet("sheet1");
	//.................using for loop for find out rows and columns//
	int rows =sheet.getFirstRowNum();
	int columns =sheet.getRow(1).getLastCellNum();	
	for(int i =0 ; i<rows; i++)
		{
		static 	xls.Reader reader;
	public static ArrayList<Object [ ]> getDataFromExcel(){
	
	ArrayList<Object[]> mydata = new ArrayList<Object[]>();
				
	try {
reader = new Xls.Reader( 
		(System.setProperty("user.dir", null)
	+"D:\\ECLIPSEPYTHON VERSION WORKSPACE\\Testng_practies\\src\\tetng_testdata\\Book1.xlsx");
	}catch (Exception e ) {
		e.printStackTrace();
		
	for( int rownum=2; rownum<=reader.getRow())
	{
	
	
	}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
