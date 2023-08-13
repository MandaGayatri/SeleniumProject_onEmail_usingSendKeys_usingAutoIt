package XLData;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import BaseClass.BaseClass;

public class XLSheetData extends BaseClass
{

	public static  XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static  XSSFRow row;
	public static XSSFCell cell;
	public static FileInputStream fi ;
	public static FileOutputStream fo;
 
	public static int getRowCount(String XLFile, String XLSheet) throws Exception
	{
		fi = new FileInputStream(XLFile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(XLSheet);
		int rcount = ws.getLastRowNum();
		fi.close();
		wb.close();
		return rcount;
	}
	public static int getcellCount(String XLFile, String XLSheet, int rownum) throws Exception
	{
		fi = new FileInputStream(XLFile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(XLSheet);
		row = ws.getRow(rownum);
		int cellcount = row.getLastCellNum();
		wb.close();
		fi.close();
		return cellcount;
	}
	public static String getcellData(String XLFile, String XLSheet, int rownum,int cellnum) throws Exception
	{
		fi = new FileInputStream(XLFile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(XLSheet);
		row = ws.getRow(rownum);
		cell = row.getCell(cellnum);
		String data;
		try {
			DataFormatter dataformatter = new DataFormatter();
			String cellData = dataformatter.formatCellValue(cell);
			return cellData;
		}
		catch(Exception e)
		{
			data = "";
		}
		wb.close();
		fi.close();
		return data;
	}
	public static void setcellData(String XLFile,String XLSheet,int rownum,int cellnum,String data) throws Exception
	{
		fi = new FileInputStream(XLFile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(XLSheet);
		row = ws.getRow(rownum);
		cell = row.getCell(cellnum);
		cell.setCellValue(data);
		fo = new FileOutputStream(XLFile);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
	}
	
}
