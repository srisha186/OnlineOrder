package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Datautils {
	
	@DataProvider(name="value")
	public Object datavalue() {
		
		Object[][] data=new Object[2][4];
		data[0][0]="aaa";
		data[0][1]="bbb";
		data[0][2]="sss@gmail.com";
		data[0][3]="11111";
		
		data[1][0]="aaa";
		data[1][1]="bbb";
		data[1][2]="sss@gmail.com";
		data[1][3]="11111";
		

		return data;
		
	}
	
	@DataProvider(name="signupform")
	public Object[][] signupdata() throws IOException
	{
		File src=new File("C:\\Users\\karth\\eclipse-workspace\\Freshiiworkouts\\src\\test\\resources\\testdata.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		int rowcount=sheet.getLastRowNum();
		System.out.println(rowcount);
		int rows=rowcount+1;
		
		int cellcount=sheet.getRow(0).getLastCellNum();
		System.out.println(cellcount);
		
		String data[][]=new String[rowcount][cellcount];
		for(int i=1;i<rowcount+1;i++) {
			Row r=sheet.getRow(i);
			
			for(int j=0;j<cellcount;j++) {
				
				data[i-1][j]=r.getCell(j).toString();
				System.out.println(data[i-1][j]=r.getCell(j).toString());
				
			
			}
		}
		
		
		return data;
		
		
		
	}

}
