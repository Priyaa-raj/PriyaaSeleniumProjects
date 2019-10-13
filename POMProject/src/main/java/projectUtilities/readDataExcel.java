package projectUtilities;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readDataExcel {

	public static String[][] readExcel(String excelFileName) throws IOException {
		// TODO Auto-generated method stub

		XSSFWorkbook wBook = new XSSFWorkbook("./testData/"+excelFileName+".xlsx");

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


		


		//Old code only to print data in console from excel
		/*
		 XSSFWorkbook wBook = new XSSFWorkbook("./dataSet/CreateLead_DataSet.xlsx");

		XSSFSheet sheet = wBook.getSheet("Create");

		int rowCount = sheet.getLastRowNum();

		int colCount = sheet.getRow(0).getLastCellNum();

		for (int r = 1; r <= rowCount; r++) {
			XSSFRow rowCurrent = sheet.getRow(r);
			for (int c = 0; c < colCount; c++) {
				XSSFCell cellCurrent = rowCurrent.getCell(c);
				String input = cellCurrent.getStringCellValue();
				System.out.println(input);
			}
		}

		wBook.close();*/
	}

}
