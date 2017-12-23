package LearnExcelDataweek5;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class LearnDataprovider {

	@Test
	public String[][] readExcel(String fileName) throws InvalidFormatException, IOException {
		File excel = new File("./data/"+fileName+".xlsx");
		// Open the workbook
		XSSFWorkbook workbook = new XSSFWorkbook(excel);
		// Go to the sheet
		XSSFSheet sheet = workbook.getSheetAt(0);
		// Get row count
		int rowCount = sheet.getLastRowNum();
		// Get column count
		int columnCount = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[rowCount][columnCount];

		for (int i = 1; i <= rowCount; i++) {
			// Go to the row
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				// Go to the cell
				XSSFCell cell = row.getCell(j);
				// Get cell value
				String text = cell.getStringCellValue();
				data[i - 1][j] = text;
				//System.out.println(text);
			}
		}
		return data;

	}
}
