package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EXCEL {

	public static void main(String[] args) throws Throwable 
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\User\\eclipse-workspace\\automatin\\src\\test\\resources\\Book1.xlsx");
  Workbook wb=WorkbookFactory.create(fis);
  Sheet sh = wb.getSheet("Sheet1");
String data = sh.getRow(0).getCell(0).getStringCellValue();
System.out.println(data);
  
		
	}

}
