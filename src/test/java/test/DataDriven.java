package test;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws Exception {

		String path="D:\\rahul\\rahul shetty  xcel\\Book2.xlsx";
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook book= new XSSFWorkbook(fis);
		int sheets=  book.getNumberOfSheets();
		for(int i=0;i>sheets;i++)
		{
			if(book.getSheetName(i).equalsIgnoreCase("testdata"))
			{
                book.getSheetAt(i);
			}
		}

	}

}
