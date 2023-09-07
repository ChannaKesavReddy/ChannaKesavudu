package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class data_excelnnumirical {
public static void main(String[] args) throws Throwable {
	
	
FileInputStream as=new FileInputStream("C:\\Users\\User\\eclipse-workspace\\automatin\\src\\test\\resources\\Book2.xlsx");
Workbook si=WorkbookFactory.create(as);
double ks=si.getSheet("sheet1").getRow(0).getCell(0).getNumericCellValue();
System.out.println(ks);
}
}
