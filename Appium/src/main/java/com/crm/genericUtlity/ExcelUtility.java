package com.crm.genericUtlity;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	static Workbook wb ;
	/**
	 * this method is used for fetchdata
	 * @param sheetName
	 * @param rowNumber
	 * @param cellNumber
	 * @return
	 * @throws Throwable
	 */
	public static String fetchData(String sheetName,int rowNumber,int cellNumber) throws Throwable
	{
		Sheet sheet = wb.getSheet(sheetName);
		String data = sheet.getRow(rowNumber).getCell(cellNumber).getStringCellValue();
		return data;
	}
	/**
	 * this method is used to openexcel
	 * @param Path
	 * @throws Throwable
	 */
	public static void openExcel(String Path) throws Throwable
	{
		FileInputStream fin = new FileInputStream(Path);
		wb = WorkbookFactory.create(fin);
		System.out.println("excel is opened successfully");
	}
	/**
	 * This Method is use to write data into new row
	 * @param sheetName
	 * @param rowNumber
	 * @param cellNumber
	 * @param data
	 * @param Path
	 * @throws Throwable
	 */
	public static void writeDataInNewrow(String sheetName,int rowNumber,int cellNumber,String data,String Path) throws Throwable
	{
		Sheet sheet = wb.getSheet(sheetName);
		sheet.createRow(rowNumber).createCell(cellNumber).setCellValue(data);
		FileOutputStream fos = new FileOutputStream(Path);
		wb.write(fos);
		System.out.println("Data is written Successfully new row");
	}
	/**
	 * This method is use to write data into existing row
	 * @param sheetName
	 * @param rowNumber
	 * @param cellNumber
	 * @param data
	 * @param Path
	 * @throws Throwable
	 */
	public static void writeDataInExistingrow(String sheetName,int rowNumber,int cellNumber,String data,String Path) throws Throwable
	{
		Sheet sheet = wb.getSheet(sheetName);
		sheet.getRow(rowNumber).createCell(cellNumber).setCellValue(data);
		FileOutputStream fos = new FileOutputStream(Path);
		wb.write(fos);
		System.out.println("Data is written Successfully to existing row");
	}
	
	/**
	 * This method is use to close excel
	 * @throws Throwable
	 */
	public static void closeExcel() throws Throwable
	{
		wb.close();
		System.out.println("excel is closed successfully");
	}
	
	/**
	 * this method is used to fetchmultipledata
	 * @param sheetname
	 * @return
	 */
	public static Object[][] fetchMulttilpedata(String sheetname)
	{
		Sheet sh = wb.getSheet(sheetname);
		Object[][] arr = new Object[sh.getLastRowNum()][sh.getRow(0).getLastCellNum()];
		for (int i=0;i<sh.getLastRowNum();i++)
		{
			for(int j=0;j<sh.getRow(0).getLastCellNum();j++)
			{
				arr[i][j]=sh.getRow(i+1).getCell(j).toString();
			}
		}
		return arr;
	}

}

