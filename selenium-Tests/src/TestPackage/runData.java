package TestPackage;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class runData {
	
	private WebDriver mydriver;
	//private WebDriver myfirstdriver;
	String myURL;
	String type_text;
	
	String firstName; 
	String lastName; 
	String age; 
	//String search_result;
	int myRows,myCols;
	String my_input_data;
		
		
		@Before
		public void setup()throws Exception{
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rznan\\Desktop\\Feb_WS\\libraries\\chromedriver.exe");
			
			mydriver = new ChromeDriver();
			
			mydriver.manage().deleteAllCookies();
			
			// AUT to navigate 
			
			//driver.navigate().to("https://identity.flickr.com/sign-up");
		
			
			myURL="https://identity.flickr.com/sign-up";
		
		
		}
		
		@Test
		public void mymaintest()throws Exception{
			
		String SheetPath="C:/Users/rznan/Desktop/testdata_test.xls";
		
		
		
		String [][] myXLSheet= readXLSheet(SheetPath,"book");
		
		
		//this is the for loop for navigating excel file 
		
		for (int k=1;k<myRows;k++){
			
			
		firstName=myXLSheet[k][0];
		lastName = myXLSheet[k][1];
		age = myXLSheet[k][2];
		
		mydriver.navigate().to(myURL);	
		
		
		WebElement firstnameTextBox = mydriver.findElement(By.id("sign-up-first-name"));
		
		WebElement lastnameTextBox = mydriver.findElement(By.id("sign-up-last-name"));
		
		WebElement ageTextBox = mydriver.findElement(By.id("sign-up-age"));
		
		Thread.sleep(1000);
		firstnameTextBox.sendKeys(firstName);
		Thread.sleep(1000);
		lastnameTextBox.sendKeys(lastName);
		Thread.sleep(1000);
		ageTextBox.sendKeys(age);
		
		//search_result=mydriver.findElement(By.xpath(".//*[@id='gh-activityfeed']/div[2]/div[1]/div[1]/div/p/strong")).getText();
		
	//	System.out.println(search_result);
			
		
		}
		
		}
		
		
		
		// Method/Function for reading data from Excel Sheet
			public String[][] readXLSheet(String SheetPath, String SheetName) throws Exception{

				String[][] xData;                                                                
				
				File myXLSheet = new File(SheetPath);                                
				FileInputStream myStream = new FileInputStream(myXLSheet);                                
				HSSFWorkbook myWB = new HSSFWorkbook(myStream);                                
				HSSFSheet mySheet = myWB.getSheet(SheetName);                                 
				myRows = mySheet.getLastRowNum()+1;                                
				myCols = mySheet.getRow(0).getLastCellNum();                                
				xData = new String[myRows][myCols];        
				for (int i = 0; i < myRows; i++) {                           
						HSSFRow row = mySheet.getRow(i);
						for (int j = 0; j < myCols; j++) {                               
							HSSFCell cell = row.getCell(j);                               
							String value = cellToString(cell);                               
							xData[i][j] = value;                               
							}        
						}                                      
				return xData;
			}

		

		
		

		//Method/Function to Change cell type
			public static String cellToString(HSSFCell cell) { 
							int type = cell.getCellType();                        
				Object result;                        
				switch (type) {                            
					case HSSFCell.CELL_TYPE_NUMERIC: //0                                
						result = cell.getNumericCellValue();                                
						break;                            
					case HSSFCell.CELL_TYPE_STRING: //1                                
						result = cell.getStringCellValue();                                
						break;                            
					case HSSFCell.CELL_TYPE_FORMULA: //2                                
						throw new RuntimeException("We can't evaluate formulas in Java");  
						case HSSFCell.CELL_TYPE_BLANK: //3                                
						result = "-";                                
						break;                            
					case HSSFCell.CELL_TYPE_BOOLEAN: //4     
						result = cell.getBooleanCellValue();       
						break;                            
					case HSSFCell.CELL_TYPE_ERROR: //5       
						throw new RuntimeException ("This cell has an error");    
					default:                  
						throw new RuntimeException("We don't support this cell type: " + type); 
						}                        
				return result.toString();      
				}


		@After
		public void teardown()throws Exception{
		mydriver.quit();
	}

}
