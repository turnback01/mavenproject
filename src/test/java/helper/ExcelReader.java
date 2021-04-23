package helper;

import java.io.FileInputStream;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader 
{
	static Workbook wb;
	public static void pathRead(String path)
	{
		try 
		{
			if(path.endsWith(".xls"))
			{
				wb=new HSSFWorkbook(new FileInputStream(path));
			}
			else if(path.endsWith(".xlsx"))
			{
				wb=new XSSFWorkbook(new FileInputStream(path));
			}
		} 
		catch (Exception e)
		{
			
			e.printStackTrace();
		}
	}
	public static String cellRead(String sheet,int row,int coll)
	{
		String data=wb.getSheet(sheet).getRow(row).getCell(coll).toString();
		return data;
	}
	public static int rowCount(String sheet)
	{
		return wb.getSheet(sheet).getLastRowNum();
	}

}
