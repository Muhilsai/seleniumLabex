package day3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		HSSFWorkbook wb = new HSSFWorkbook(new FileInputStream("src/test/resources/data/SuiteData.xls"));
		HSSFSheet sh = wb.getSheet("Sheet1");
		int rows = sh.getPhysicalNumberOfRows();  //will give the number of rows in excel
		
		for (int i=0;i<rows; i++)
		{
				HSSFRow row = sh.getRow(i);
				int cells = row.getPhysicalNumberOfCells();				
				for(int j=0;j<cells;j++)
				{
					HSSFCell cell = row.getCell(j);
					System.out.println(cell.getStringCellValue());
				}
				
		}
	}

}
