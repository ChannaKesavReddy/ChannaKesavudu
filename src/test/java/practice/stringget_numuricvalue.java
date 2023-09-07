package practice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;





public class stringget_numuricvalue {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\User\\eclipse-workspace\\automatin\\src\\test\\resources\\Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		//fetch string type of data
		String data1 = wb.getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data1);
		//fetch numeric type of data
		//double data2 = wb.getSheet("Sheet2").getRow(1).getCell(0).getNumericCellValue();
		//System.out.println(data2);
		//fetch Boolean data
		  boolean data3 = wb.getSheet("Sheet2").getRow(2).getCell(0).getBooleanCellValue();
		System.out.println(data3);
		//read numeric value as string
		 String data4 = wb.getSheet("Sheet2").getRow(1).getCell(0).getStringCellValue();
System.out.println(data4);


	}

}