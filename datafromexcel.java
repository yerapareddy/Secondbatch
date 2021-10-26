package datadrivenframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datafromexcel {
	
	
	public static ArrayList<String> getdatafromexcel(String filename, String SheetName,String Header,String testcaseName) throws IOException{
		ArrayList<String> data = new ArrayList();
		//read data from excelsheet
		//XSSFWorkbook library is used to read the excel file data
		//Apache POI jar is library helps to read excel file
		FileInputStream fis = new FileInputStream(filename);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheets = workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++){
			if(workbook.getSheetName(i).equalsIgnoreCase(SheetName)){
				//get the row details
				XSSFSheet sheet=workbook.getSheetAt(i);
				//identify where testcase name is present by scanning rows
				Iterator<Row> row=sheet.iterator();
				
				while(row.hasNext()){
				Row rowlevel=row.next();
				rowlevel.createCell(3);
				rowlevel.createCell(1, CellType.STRING).setCellValue("Status");
				//get the cell leve data in a row
				Iterator<Cell> col=rowlevel.cellIterator();
				int column=0;
				int columnindex=0;
				while(col.hasNext()){
					Cell value =col.next();
					if(value.getStringCellValue().equalsIgnoreCase(Header)){
						columnindex=column;
					}
					column++;
				}
				
				//once column position is identified then search entire test case column to identify the testcase that we are looking for
				if(rowlevel.getCell(columnindex).getStringCellValue().equalsIgnoreCase(testcaseName)){
					//once we get into the desired row which is testcase level date then iterate in that row to get cell level details
					Iterator<Cell> cell=rowlevel.cellIterator();
					while(cell.hasNext()){
						Cell c=cell.next();
						data.add(c.getStringCellValue());
						
						
					}
				}
				
				}
				
			}
		}
		return data;
	}

	
}
