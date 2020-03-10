package com.qa.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataProviderUtility {

	static FileInputStream fis;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public static Object[][] getData(int sheetNo) {
		try {
			  fis= new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/qa/config/dataProviderSheet.xlsx");
			  workbook= new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}
		  sheet= workbook.getSheetAt(sheetNo);
		  Object data[][]= new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		  System.out.println(sheet.getLastRowNum());
		  System.out.println(sheet.getRow(0).getLastCellNum());
		  for(int i=0; i<sheet.getLastRowNum();i++) {
			  for(int j=0; j<sheet.getRow(0).getLastCellNum(); j++) {
				  data[i][j]=sheet.getRow(i+1).getCell(j).toString();
				  System.out.println(data[i][j]);
			  }
		  }
		  return data;
	}
}
