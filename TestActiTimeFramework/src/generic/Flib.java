package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	 public String readExcelFile(String excelpath,String sheet,int rowcount,int cellcount) throws EncryptedDocumentException, IOException
	 {
		 FileInputStream fis = new FileInputStream(excelpath);
		 Workbook wb = WorkbookFactory.create(fis);
		 Sheet sh = wb.getSheet(sheet);
		 Row row = sh.getRow(rowcount);
		 Cell cell = row.getCell(cellcount);
		 String data = cell.getStringCellValue();
		 return data;
	 }
	 
	 public int getRowCount(String excelpath,String sheet) throws EncryptedDocumentException, IOException
	 {

		 FileInputStream fis = new FileInputStream(excelpath);
		 Workbook wb = WorkbookFactory.create(fis);
		 Sheet sh = wb.getSheet(sheet);
		 int rc = sh.getLastRowNum();
		 return rc;
	 }
	 
	 public void writeExcelFile(String excelpath,String sheet,int rowcount,int cellcount,String data) throws EncryptedDocumentException, IOException
	 {
		 FileInputStream fis = new FileInputStream(excelpath);
		 Workbook wb = WorkbookFactory.create(fis);
		 Sheet sh = wb.getSheet(sheet);
		 Row row = sh.getRow(rowcount);
		 
		 Cell cell = row.createCell(cellcount);
		 cell.setCellValue(data);
		 
		  FileOutputStream fos = new FileOutputStream(excelpath);
		  wb.write(fos);
		
	 }
	 
	 public String readPropertyFile(String propPath,String key) throws IOException
		{ 
			FileInputStream fis = new FileInputStream(propPath);
			Properties prop = new Properties();
			prop.load(fis);
			 String value = prop.getProperty(key);
			return value;
			 
			
		}	
	 
	 
	}


