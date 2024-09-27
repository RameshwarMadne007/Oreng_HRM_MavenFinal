package Utility;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelUtility{
	String path;
	FileInputStream fi;
	  XSSFWorkbook workbook;
	  XSSFSheet sheet;
	  XSSFRow row ;
	  XSSFCell cell ;
	
	//Constructor for the invoke the path
	 public excelUtility(String path)
	 {
		 this.path=path;
	 }
	 
	 public int getRowCount(String sheetname) throws IOException
	 {
		  fi=new FileInputStream(path);
		  XSSFWorkbook workbook = new XSSFWorkbook(fi);
		   sheet = workbook.getSheet(sheetname);
		   int rowcount = sheet.getLastRowNum();	
		   
		   workbook.close();
		   fi.close();
		   return rowcount;
	 }
	 public int cellcount(String sheetname , int rownum) throws IOException
	 {
		  fi=new FileInputStream(path);
		  XSSFWorkbook workbook = new XSSFWorkbook(fi);
		   sheet = workbook.getSheet(sheetname);
		    row = sheet.getRow(rownum);
		  int  Cellcount= row.getLastCellNum();
		   
		   workbook.close();
		   fi.close();
		   return Cellcount;
	 }
	 public String getcelldata(String sheetname ,int rownum , int cloumn) throws IOException
	 {
		  fi=new FileInputStream(path);
		  XSSFWorkbook workbook = new XSSFWorkbook(fi);
		   sheet = workbook.getSheet(sheetname);
		   row =sheet.getRow(rownum);
		   cell = row.getCell(cloumn);
		   DataFormatter format  = new DataFormatter();
		   String data;
		   try {
			   
		   
		   data =format.formatCellValue(cell);// return the format value int to string
		   }
		   catch(Exception e)
		   {
			   data="";
			   }
		  
		   workbook.close();
		   fi.close();
		   return data;
	 }
}
