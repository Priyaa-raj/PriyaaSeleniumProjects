package utilis;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataRead {

	public static String[][] readExcel(String excelFileName) throws IOException {
		

		XSSFWorkbook wBook = new XSSFWorkbook("./dataTest/"+excelFileName+".xlsx");

		XSSFSheet sheet = wBook.getSheet("Sheet1");

		int rowCount = sheet.getLastRowNum();

		int colCount = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[rowCount][colCount];
		for (int r = 1; r <= rowCount; r++) {
			XSSFRow rowCurrent = sheet.getRow(r);
			for (int c = 0; c < colCount; c++) {
				XSSFCell cellCurrent = rowCurrent.getCell(c);
				data[r-1][c] = cellCurrent.getStringCellValue();
			}
		}

		wBook.close();
		return data;	
}
}
