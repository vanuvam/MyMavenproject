package ExcelDataApache;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

@Test
public class Exceldata {
	
	public void excelSheetdata() throws InvalidFormatException, IOException{
		
		File excel = new File("C:\\Users\\DEEPA\\Desktop\\Deepa Selenium\\Selenium\\CreateLead.xlsx");
		
		//open the workbook
		
	     XSSFWorkbook workbook = new XSSFWorkbook(excel);
	     
	     //open the sheet
	     
	       
	     
	    XSSFSheet sheet =  workbook.getSheetAt(0);
	    
	    //get row count
	    int rowcount = sheet.getLastRowNum();
	    //get column count
	    int columncount = sheet.getRow(0).getLastCellNum();
	    //go to row
	    //int 
	    
	    for (int i = 1; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columncount; j++) {
				// go to cell to retrieve value
				XSSFCell cell = row.getCell(j);
				String text = cell.getStringCellValue();
				System.out.println(text);
			}
		}
	    
		
	}

}
