package genriclib;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel
{ 
	public double numericCellvalue(String path,String sheet,int row,int cell) throws Exception
	{
		File abspath=new File(path);
		FileInputStream fis=new FileInputStream(abspath);
		Workbook wb=WorkbookFactory.create(fis);
		double data = wb.getSheet(sheet).getRow(row).getCell(cell).getNumericCellValue();
		System.out.println();
		return data;
	}
	public String stringCellValue(String path,String sheet,int row,int cell) throws Exception
	{
		File abspath=new File(path);
		FileInputStream fis=new FileInputStream(abspath);
		Workbook wb=WorkbookFactory.create(fis);
		String data = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		System.out.println();
		return data;
	}
	public Date dateCellValue(String path,String sheet,int row,int cell) throws Exception
	{
		File abspath=new File(path);
		FileInputStream fis=new FileInputStream(abspath);
		Workbook wb=WorkbookFactory.create(fis);
		Date data = wb.getSheet(sheet).getRow(row).getCell(cell).getDateCellValue();
		System.out.println();
		return data;
	}
	public boolean booleanCellValue(String path,String sheet,int row,int cell) throws Exception
	{
		File abspath=new File(path);
		FileInputStream fis=new FileInputStream(abspath);
		Workbook wb=WorkbookFactory.create(fis);
		boolean data = wb.getSheet(sheet).getRow(row).getCell(cell).getBooleanCellValue();
		System.out.println();
		return data;
	}
	public String cellValue(String path,String sheet,int row,int cell) throws Exception
	{
		File abspath=new File(path);
		FileInputStream fis=new FileInputStream(abspath);
		Workbook wb=WorkbookFactory.create(fis);
		
		String data = wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		return data;
	}
	public String[][] getMultipleData(String path,String Name ) throws Exception
	{
		File file =new File(path);
		FileInputStream fin=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fin);
		// sheet=workbook.getSheet(Name);
		int rowcount =  workbook.getSheet(Name).getPhysicalNumberOfRows();
		System.out.println(rowcount);
		int cellcount = workbook.getSheet(Name).getRow(0).getPhysicalNumberOfCells();
		System.out.println(cellcount);
		String[][] arr=new String[ rowcount][cellcount];
		return arr;

	
             
	
}
}
