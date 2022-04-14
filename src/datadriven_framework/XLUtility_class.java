package datadriven_framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtility_class {

	public FileInputStream fi;
	public  FileOutputStream fo;
	public XSSFWorkbook  wb;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	public CellStyle style;
	String path = null;
	private int cellCount;
	private int cellcount;

	XLUtility_class (String path)
	{
		this.path = path ;	
	}

	public int getRowCount(String sheetName) throws IOException
	{
		fi =new FileInputStream(path);
		wb = new XSSFWorkbook(fi);
		sheet = wb.getSheet(sheetName);
		int rowcount =sheet.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount;
	}

	public int getCellCount(String SheetName,   int rownum) throws IOException
	{
		fi =new FileInputStream(path);
		wb = new XSSFWorkbook(fi);
		sheet = wb.getSheet(SheetName);
		row=sheet.getRow(rownum);
		int cellcountt =sheet.getLastRowNum();
		wb.close();
		fi.close();
		return cellcount;
	}

	public String getCellData(String sheetName ,int rownum , int column)
	{
		fi =new FileInputStream(path);
		wb = new XSSFWorkbook(fi);
		sheet = wb.getSheet(sheetName);
		row=sheet.getRow(rownum);
		cell=row.getCell(column);		
		DataFormatter formatter = new DataFormatter();
		String data ;
		try
		{
			data = formatter.formatCellValue(cell);
		}
		catch(Exception e)
		{
			data = " " ;
		}
		wb.close();
		fi.close();


	}








}








}
