package Utilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public static String CellValue;
	

	
	 public static String read_data_from_Excel(String Filepath ,int i,int j) throws IOException {
		  
		  
		  // Specify the path of file
		  File src=new File(Filepath);
		 
		   // load file
		   FileInputStream fis=new FileInputStream(src);
		 
		   // Load workbook
		   XSSFWorkbook wb=new XSSFWorkbook(fis);
		   
		   // Load sheet- Here we are loading first sheetonly
		      XSSFSheet sh1= wb.getSheet("Sheet1");
		 
		  // getRow() specify which row we want to read.
		 
		  // and getCell() specify which column to read.
		  // getStringCellValue() specify that we are reading String data.
		   
		 
		 
		 System.out.println(sh1.getRow(i).getCell(j).getStringCellValue());
		 String CellValue=sh1.getRow(i).getCell(j).getStringCellValue();
		 wb.close();
			return CellValue;
			
			
		
		  
		 }
	 
	 public static void write_data_to_Excel(String Filepath ,int i,int j,String str) throws IOException {
		  
		  
		  // Specify the path of file
		  File src=new File(Filepath);
		 
		   // load file
		   FileInputStream fis=new FileInputStream(src);
		 
		   // Load workbook
		   XSSFWorkbook wb=new XSSFWorkbook(fis);
		   
		   // Load sheet- Here we are loading first sheetonly
		      XSSFSheet sh1= wb.getSheetAt(0);
		 
		  // getRow() specify which row we want to read.
		 
		  // and getCell() specify which column to read.
		  // getStringCellValue() specify that we are reading String data.
		 
		 
		  sh1.getRow(i).createCell(j).setCellValue(str);
		  FileOutputStream fout=new FileOutputStream(src);
		  wb.write(fout);
		  wb.close();
		  fout.close();
		 
			
			
		
		  
		 }
	

}
