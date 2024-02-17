package org.test;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {	
	public static void main(String[] args) throws InterruptedException, AWTException {	
		//Set up the Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Ncmg-Testing\\driver\\chromedriver.exe");	
		//Launch the Browser
		WebDriver driver = new ChromeDriver();		
		//Go to the URL
		driver.get("http://20.193.156.244:3000/");	
		//Maximize the Browser
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//To get the Title
		String title = driver.getTitle();
		System.out.println(title);	
		//To get the Current URL
		String url = driver.getCurrentUrl();
		System.out.println(url);
//NCMG-Username, Password & Login		
		//TextUsername
		WebElement textUsername = driver.findElement(By.xpath("//input[@id='mat-input-0']"));
		textUsername.sendKeys("manimohan@dev.com");
		Thread.sleep(2000);
		//TextPassword
		WebElement textPassword = driver.findElement(By.xpath("//input[@id='mat-input-1']"));
		textPassword.sendKeys("Login@123");
		Thread.sleep(2000);
		//btnLogin
		WebElement btnLogin = driver.findElement(By.xpath("//span[text()='Login']"));
		btnLogin.click();
		Thread.sleep(2000);
		
//1-Master Module
		WebElement clickMaster = driver.findElement(By.xpath("//span[text()='Master']"));
		clickMaster.click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		String url2 = driver.getCurrentUrl();
		System.out.println(url2);
		Thread.sleep(2000);
		
////2-User Click
		WebElement clickUser = driver.findElement(By.xpath("//span[text()='User']"));
		clickUser.click();
		String title3 = driver.getTitle();
		System.out.println(title3);
		String url3 = driver.getCurrentUrl();
		System.out.println(url3);
		Thread.sleep(2000);
////Add-User Click
		WebElement textAdd = driver.findElement(By.xpath("//div[@class='add_new']"));
		textAdd.click();
		Thread.sleep(2000);
////Add-User Registration-Firstname
		WebElement textUserfirstname = driver.findElement(By.xpath("//input[@id='mat-input-4']"));
		textUserfirstname.sendKeys("Gopal");
		Thread.sleep(2000);
////Add-User Registration-Lastname
		WebElement textUserlastname = driver.findElement(By.xpath("//input[@id='mat-input-5']"));
		textUserlastname.sendKeys("Krishnan");
		Thread.sleep(2000);
////Add-User Registration-Email
		WebElement textUseremail = driver.findElement(By.xpath("//input[@id='mat-input-11']"));
		textUseremail.sendKeys("gopal@dev.com");
		Thread.sleep(2000);
////Add-User Registration-Password
		WebElement textUserpassword = driver.findElement(By.xpath("//input[@id='mat-input-12']"));
		textUserpassword.sendKeys("Gopal@123");
		Thread.sleep(2000);
////Add-User Registration-Mobile Number
		WebElement textUsermobilenumber = driver.findElement(By.xpath("//input[@id='mat-input-6']"));
		textUsermobilenumber.sendKeys("1234567890");
		Thread.sleep(2000);
////Add-User Registration-Country
		WebElement textUsercountry = driver.findElement(By.xpath("//input[@id='mat-input-7']"));
		textUsercountry.sendKeys("India");
		Thread.sleep(2000);
////Add-User Registration-State
	    WebElement textUserstate = driver.findElement(By.xpath("//input[@id='mat-input-8']"));
		textUserstate.sendKeys("TamilNadu");
		Thread.sleep(2000);
////Add-User Registration-City
		WebElement textUserCity = driver.findElement(By.xpath("//input[@id='mat-input-9']"));
		textUserCity.sendKeys("Coimbatore");
		Thread.sleep(2000);
////Add-User-Scroll Down
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		WebElement btnUsersave = driver.findElement(By.xpath("//span[text()=' Save']"));
		jk.executeScript("arguments[0].scrollIntoView(true)", btnUsersave);
		Thread.sleep(2000);
////Add-User Registration-Address
		WebElement textUseraddress = driver.findElement(By.xpath("//input[@id='mat-input-10']"));
		textUseraddress.sendKeys("SaibabColony");
		Thread.sleep(2000);
////Add-User Registration-Select Tenant Click
		WebElement textUsertenant = driver.findElement(By.xpath("//span[text()='Select Tenant']"));
		textUsertenant.click(); 
		Thread.sleep(2000);
////Add-User Registration-Select Tenant-test
		WebElement textUsertenanttest = driver.findElement(By.xpath("//span[text()='test ']"));
		textUsertenanttest.click();
		Thread.sleep(2000);
////Add-User Registration-Select Role Click
		WebElement textUserrole = driver.findElement(By.xpath("//span[text()='Select Role']"));
		textUserrole.click();
		Thread.sleep(2000);
////Add-User Registration-Select Role-user
		WebElement textUserroleuser = driver.findElement(By.xpath("//span[text()='user ']"));
		textUserroleuser.click();
		Thread.sleep(2000);
////Add-User Registration-Save button
		WebElement textUsersavebtn = driver.findElement(By.xpath("//span[text()=' Save']"));
		textUsersavebtn.click();
		Thread.sleep(2000);
		
//3-Operator Click
		WebElement textOperator = driver.findElement(By.xpath("//span[text()='Operator']"));
     	textOperator.click();
		Thread.sleep(2000);
////Add-Operator-Click
		WebElement textOperatorAdd = driver.findElement(By.xpath("//div[@class='add_new ']"));
		textOperatorAdd.click();
		Thread.sleep(2000);
////Add-Operator-Name
		WebElement textOperatorname = driver.findElement(By.xpath("//input[@id='mat-input-13']"));
		textOperatorname.sendKeys("Gopal");
		Thread.sleep(2000);
////Add-Operator-Id
		WebElement textOperatorid = driver.findElement(By.xpath("//input[@id='mat-input-14']"));
		textOperatorid.sendKeys("1234");
		Thread.sleep(2000);
////Add-Operator-Description
		WebElement textOperatorDescription = driver.findElement(By.xpath("//input[@id='mat-input-15']"));
		textOperatorDescription.sendKeys("Dev");
		Thread.sleep(2000);
////Add-Operator-Save button
		WebElement textOperatorsavebtn = driver.findElement(By.xpath("//span[text()=' Save']"));
		textOperatorsavebtn.click();
		Thread.sleep(2000);
////Add-Operator-OK button
		WebElement textOperatorokbtn = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		textOperatorokbtn.click();
		Thread.sleep(2000);
		
////3.1-Edit-Operator-name Click
		WebElement clickEdit = driver.findElement(By.xpath("(//i[text()=' edit '])[5]"));
		clickEdit.click();
		Thread.sleep(2000);
		//Robot-Operator name
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);	
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
//		Thread.sleep(2000);		
////Edit-Operator-Name
		WebElement textEditoperatorname = driver.findElement(By.xpath("//input[@ng-reflect-name='operator_name']"));
		textEditoperatorname.sendKeys("Mani");
		Thread.sleep(2000);	
////Edit-Operator-id Click
		WebElement textEditoperatorid = driver.findElement(By.xpath("//input[@ng-reflect-name='operator_code']"));
		textEditoperatorid.click();
		Thread.sleep(2000);
		//Robot-Operator ID
				Robot s = new Robot();
				s.keyPress(KeyEvent.VK_CONTROL);
				s.keyPress(KeyEvent.VK_A);
				s.keyRelease(KeyEvent.VK_A);
				s.keyRelease(KeyEvent.VK_CONTROL);
				Thread.sleep(2000);
				
				s.keyPress(KeyEvent.VK_CONTROL);
				s.keyPress(KeyEvent.VK_X);
				s.keyRelease(KeyEvent.VK_X);
				s.keyRelease(KeyEvent.VK_CONTROL);
				Thread.sleep(2000);
////Edit-Operator-id name			
		WebElement textEditopid = driver.findElement(By.xpath("(//input[@ng-reflect-type='text'])[2]"));
		textEditopid.sendKeys("5678");
		Thread.sleep(2000);
////Edit-Operator-Description Click
		WebElement textEditDescription = driver.findElement(By.xpath("//input[@ng-reflect-name='description']"));
		textEditDescription.click();
		Thread.sleep(2000);
//		//Robot-Operator ID
				Robot t = new Robot();
				t.keyPress(KeyEvent.VK_CONTROL);
				t.keyPress(KeyEvent.VK_A);
				t.keyRelease(KeyEvent.VK_A);
				t.keyRelease(KeyEvent.VK_CONTROL);
				Thread.sleep(2000);
				
				t.keyPress(KeyEvent.VK_CONTROL);
				t.keyPress(KeyEvent.VK_X);
				t.keyRelease(KeyEvent.VK_X);
				t.keyRelease(KeyEvent.VK_CONTROL);
				Thread.sleep(2000);
////Edit-Operator-Description name		
		WebElement textEditdes = driver.findElement(By.xpath("(//input[@ng-reflect-type='text'])[3]"));
		textEditdes.sendKeys("Test");
		Thread.sleep(2000);	
////Edit-Operator-Save button Click
		WebElement editSavebtn = driver.findElement(By.xpath("//span[text()=' Save']"));
		editSavebtn.click();
		Thread.sleep(4000);
////Edit-Operator-Close button Click
		WebElement editClosebtn = driver.findElement(By.xpath("//mat-icon[text()='close ']"));
		editClosebtn.click();
		Thread.sleep(2000);
////Edit-Operator-Delete button Icon Click
		WebElement deleteBtnicon = driver.findElement(By.xpath("(//i[text()=' delete '])[1]"));
		deleteBtnicon.click();
		Thread.sleep(2000);
////Edit-Operator-Delete button Yes/No Click
		WebElement deleteBtnyesno = driver.findElement(By.xpath("//button[text()='Yes, delete it!']"));
		deleteBtnyesno.click();
		Thread.sleep(2000);
////Edit-Operator-Delete button OK Click
		WebElement deleteBtnok = driver.findElement(By.xpath("//button[text()='OK']"));
		deleteBtnok.click();
				
////2.1-Edit-User-Click
		WebElement userEdit = driver.findElement(By.xpath("(//i[text()=' edit '])[3]"));
		userEdit.click();
		Thread.sleep(2000);		
////Edit-User-FirstnameClick
		WebElement userEditFirstname = driver.findElement(By.xpath("//input[@ng-reflect-name='first_name']"));
		userEditFirstname.click();
		Thread.sleep(2000);
//		//Robot-Edit-Firstname
		Robot u = new Robot();
		u.keyPress(KeyEvent.VK_CONTROL);
		u.keyPress(KeyEvent.VK_A);
		u.keyRelease(KeyEvent.VK_A);
		u.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
	    u.keyPress(KeyEvent.VK_CONTROL);
		u.keyPress(KeyEvent.VK_X);
		u.keyRelease(KeyEvent.VK_X);
		u.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
////Edit-User-Firstname
		WebElement editFirstname = driver.findElement(By.xpath("(//input[@ng-reflect-type='text'])[3]"));
		editFirstname.sendKeys("Gokul");
		Thread.sleep(2000);		
////Edit-User-LastnameClick
		WebElement userEditlastname = driver.findElement(By.xpath("//input[@ng-reflect-name='last_name']"));
		userEditlastname.click();
		Thread.sleep(2000);
//		//Robot-Edit-Lastname
		Robot v = new Robot();
		v.keyPress(KeyEvent.VK_CONTROL);
		v.keyPress(KeyEvent.VK_A);
		v.keyRelease(KeyEvent.VK_A);
		v.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		v.keyPress(KeyEvent.VK_CONTROL);
		v.keyPress(KeyEvent.VK_X);
		v.keyRelease(KeyEvent.VK_X);
		v.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
////Edit-User-Lastname
		WebElement editlastname = driver.findElement(By.xpath("(//input[@ng-reflect-type='text'])[2]"));
		editlastname.sendKeys("Mani");
		Thread.sleep(2000);
////Edit-User-Emailid Click
		WebElement editEmailid = driver.findElement(By.xpath("//input[@ng-reflect-type='email']"));
		editEmailid.click();
		Thread.sleep(2000);
		//Robot-Edit-Emailid
		Robot b = new Robot();
		b.keyPress(KeyEvent.VK_CONTROL);
		b.keyPress(KeyEvent.VK_A);
		b.keyRelease(KeyEvent.VK_A);
		b.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		b.keyPress(KeyEvent.VK_CONTROL);
		b.keyPress(KeyEvent.VK_X);
		b.keyRelease(KeyEvent.VK_X);
		b.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
////Edit-User-Emailid name
		WebElement editEmailidname = driver.findElement(By.xpath("//input[@aria-required='true']"));
		editEmailidname.sendKeys("0987654321");
		Thread.sleep(2000);
////Edit-User-Mobilenumber Click
		WebElement userEditmobilenumber = driver.findElement(By.xpath("//input[@ng-reflect-name='mobile']"));
		userEditmobilenumber.click();
		Thread.sleep(2000);
//		//Robot-Edit-Mobilenumber
		Robot a = new Robot();
		a.keyPress(KeyEvent.VK_CONTROL);
		a.keyPress(KeyEvent.VK_A);
		a.keyRelease(KeyEvent.VK_A);
		a.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
	    a.keyPress(KeyEvent.VK_CONTROL);
		a.keyPress(KeyEvent.VK_X);
		a.keyRelease(KeyEvent.VK_X);
		a.keyRelease(KeyEvent.VK_CONTROL);
	    Thread.sleep(2000);
////Edit-User-Mobilenumber name
		WebElement editMobilenumber = driver.findElement(By.xpath("(//input[@ng-reflect-type='text'])[3]"));
		editMobilenumber.sendKeys("0987654321");
		Thread.sleep(2000);	
////Edit-User-Country Click
		WebElement usereditCountry = driver.findElement(By.xpath("//input[@ng-reflect-name='country']"));
		usereditCountry.click();
		Thread.sleep(2000);
//		//Robot-Edit-Country
		Robot c = new Robot();
		c.keyPress(KeyEvent.VK_CONTROL);
		c.keyPress(KeyEvent.VK_A);
		c.keyRelease(KeyEvent.VK_A);
		c.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
	    c.keyPress(KeyEvent.VK_CONTROL);
		c.keyPress(KeyEvent.VK_X);
		c.keyRelease(KeyEvent.VK_X);
		c.keyRelease(KeyEvent.VK_CONTROL);
	    Thread.sleep(2000);
////Edit-User-Country name
		WebElement userEditCounrtyname = driver.findElement(By.xpath("(//input[@ng-reflect-type='text'])[4]"));
		userEditCounrtyname.sendKeys("America");
		Thread.sleep(2000);
////Edit-User-State Click
		WebElement userEditstate = driver.findElement(By.xpath("//input[@ng-reflect-name='state']"));
		userEditstate.click();
		Thread.sleep(2000);
//		//Robot-Edit-State
		Robot d = new Robot();
		d.keyPress(KeyEvent.VK_CONTROL);
		d.keyPress(KeyEvent.VK_A);
		d.keyRelease(KeyEvent.VK_A);
		d.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		d.keyPress(KeyEvent.VK_CONTROL);
		d.keyPress(KeyEvent.VK_X);
		d.keyRelease(KeyEvent.VK_X);
		d.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
////Edit-User-state name
		WebElement userEditstatename = driver.findElement(By.xpath("(//input[@ng-reflect-type='text'])[5]"));
		userEditstatename.sendKeys("Karnataka");
		Thread.sleep(2000);
////Edit-User-Scroll Down		
		JavascriptExecutor ju = (JavascriptExecutor) driver;
		WebElement userEditsavebtn = driver.findElement(By.xpath("//button[@type='submit']"));
		ju.executeScript("arguments[0].scrollIntoView(true)", userEditsavebtn);	
////Edit-User-City Click
		WebElement usereditcity = driver.findElement(By.xpath("//input[@ng-reflect-name='city']"));
		usereditcity.click();
		Thread.sleep(2000);
//		//Robot-Edit-City
		Robot e = new Robot();
		e.keyPress(KeyEvent.VK_CONTROL);
		e.keyPress(KeyEvent.VK_A);
		e.keyRelease(KeyEvent.VK_A);
		e.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
	    e.keyPress(KeyEvent.VK_CONTROL);
	    e.keyPress(KeyEvent.VK_X);
		e.keyRelease(KeyEvent.VK_X);
		e.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
////Edit-User-Cityname
		WebElement usereditcityname = driver.findElement(By.xpath("(//input[@ng-reflect-type='text'])[6]"));
		usereditcityname.sendKeys("Chennai");
		Thread.sleep(2000);
////Edit-User-Address Click
		WebElement usereditaddress = driver.findElement(By.xpath("//input[@ng-reflect-name='address']"));
		usereditaddress.click();
		Thread.sleep(2000);
//		//Robot-Edit-Address
		Robot f = new Robot();
		f.keyPress(KeyEvent.VK_CONTROL);
		f.keyPress(KeyEvent.VK_A);
		f.keyRelease(KeyEvent.VK_A);
		f.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
	    f.keyPress(KeyEvent.VK_CONTROL);
	    f.keyPress(KeyEvent.VK_X);
		f.keyRelease(KeyEvent.VK_X);
		f.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
////Edit-User-Addressname
		WebElement usereditaddressname = driver.findElement(By.xpath("(//input[@ng-reflect-type='text'])[7]"));
		usereditaddressname.sendKeys("Pallavaram");
		Thread.sleep(2000);
////Edit-User-Select Role Click
		WebElement userEditncmg = driver.findElement(By.xpath("(//div[@class='mat-select-arrow-wrapper'])[1]"));
		userEditncmg.click();
		Thread.sleep(2000);
////Edit-User-Select Role Down Click
		WebElement userEditncmgclick = driver.findElement(By.xpath("//mat-option[@ng-reflect-value='1']"));
		userEditncmgclick.click();
		Thread.sleep(2000);
////Edit-User-Admin Select Click
		WebElement userEditadmin = driver.findElement(By.xpath("(//div[@class='mat-select-arrow-wrapper'])[2]"));
		userEditadmin.click();
		Thread.sleep(2000);
////Edit-User-Admin Click
		WebElement userEditadminclick = driver.findElement(By.xpath("//mat-option[@ng-reflect-value='6']"));
		userEditadminclick.click();
		Thread.sleep(2000);
////Edit-User-Save button Click
		WebElement userEditsvebtn = driver.findElement(By.xpath("//button[@type='submit']"));
		userEditsvebtn.click();
		Thread.sleep(2000);
////Edit-User-Close button Click
//			WebElement editClosebtn = driver.findElement(By.xpath("//mat-icon[text()='close ']"));
//			editClosebtn.click();
//			Thread.sleep(2000);
////Edit-User-Delete button Icon Click
//			WebElement deleteBtnicon = driver.findElement(By.xpath("(//i[text()=' delete '])[3]"));
//			deleteBtnicon.click();
//			Thread.sleep(2000);
////Edit-User-Delete button Yes/No Click
//			WebElement deleteBtnyesno = driver.findElement(By.xpath("//button[text()='Yes, delete it!']"));
//			deleteBtnyesno.click();
//			Thread.sleep(2000);		
		
////4-Process Click
			WebElement processClick = driver.findElement(By.xpath("//span[text()='Process']"));
			processClick.click();
			Thread.sleep(2000);		
////Add-Process-Click
			WebElement textProcessadd = driver.findElement(By.xpath("//mat-icon[text()='add']"));
			textProcessadd.click();
			Thread.sleep(2000);
////Add-Process-Name
			WebElement textProcessname = driver.findElement(By.xpath("//input[@ng-reflect-name='operation_name']"));	
			textProcessname.sendKeys("Gokul");
			Thread.sleep(2000);
////Add-Process-Id
			WebElement textProcessid = driver.findElement(By.xpath("//input[@ng-reflect-name='operation_code']"));
			textProcessid.sendKeys("1234");
		    Thread.sleep(2000);
////Add-Process-Save button
			WebElement textProcesssavebtn = driver.findElement(By.xpath("//span[text()=' Save']"));
			textProcesssavebtn.click();
			Thread.sleep(2000);	
			driver.navigate().refresh();
			Thread.sleep(2000);	
////Edit-Process-ScrollDown
			JavascriptExecutor jt = (JavascriptExecutor) driver;
			WebElement editProcessscrolldown = driver.findElement(By.xpath("(//button[@ng-reflect-message='Edit Process'])[9]"));
			jt.executeScript("arguments[0].scrollIntoView(true)", editProcessscrolldown);
			Thread.sleep(2000);	
////4.1-Edit-Process-Click
			WebElement editProcessclick = driver.findElement(By.xpath("(//i[text()=' edit '])[9 ]"));
			editProcessclick.click();
			Thread.sleep(2000);	
////Edit-Process name-Click
			WebElement editProcessnameclick = driver.findElement(By.xpath("//input[@formcontrolname='operation_name']"));
			editProcessnameclick.click();
			Thread.sleep(2000);	
//			//Robot-Edit-Process name
			Robot g = new Robot();
			g.keyPress(KeyEvent.VK_CONTROL);
			g.keyPress(KeyEvent.VK_A);
			g.keyRelease(KeyEvent.VK_A);
			g.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(2000);
		    g.keyPress(KeyEvent.VK_CONTROL);
		    g.keyPress(KeyEvent.VK_X);
			g.keyRelease(KeyEvent.VK_X);
			g.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(3000);
////Edit-Process name-Enter the Values	
			WebElement editProcessnamevalue = driver.findElement(By.xpath("(//input[@ng-reflect-type='text'])[1]"));
			editProcessnamevalue.sendKeys("Gopal");
			Thread.sleep(2000);	
////Edit-Process ID-Click
			WebElement editProcessidclick = driver.findElement(By.xpath("//input[@formcontrolname='operation_code']"));
			editProcessidclick.click();
			Thread.sleep(2000);	
//			//Robot-Edit-Process ID
			Robot h = new Robot();
			h.keyPress(KeyEvent.VK_CONTROL);
			h.keyPress(KeyEvent.VK_A);
			h.keyRelease(KeyEvent.VK_A);
			h.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(2000);
		    h.keyPress(KeyEvent.VK_CONTROL);
		    h.keyPress(KeyEvent.VK_X);
			h.keyRelease(KeyEvent.VK_X);
			h.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(2000);
////Edit-Process name-Enter the Values	
			WebElement editProcessidvalue = driver.findElement(By.xpath("(//input[@ng-reflect-type='text'])[2]"));
			editProcessidvalue.sendKeys("4321");			
			Thread.sleep(2000);
////Edit-Process-Save btn
			WebElement editProcesssavebtn = driver.findElement(By.xpath("//span[text()=' Save']"));
			editProcesssavebtn.click();
			Thread.sleep(2000);
////Edit-Process-Deleteicon btn
			WebElement editProcessdeleteicon = driver.findElement(By.xpath("(//i[text()=' delete '])[9]"));
			editProcessdeleteicon.click();
			Thread.sleep(2000);
////Edit-Process-Deleteicon-Yes/No Click btn
			WebElement editProcessdeleteyesnobtn = driver.findElement(By.xpath("//button[text()='Yes, delete it!']"));
			editProcessdeleteyesnobtn.click();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(2000);
////Edit-Process-ScrollUP
			JavascriptExecutor jr = (JavascriptExecutor) driver;
			WebElement editProcessscrolldown2 = driver.findElement(By.xpath("(//button[@ng-reflect-message='Edit Process'])[8]"));
			jr.executeScript("arguments[0].scrollIntoView(true)", editProcessscrolldown2);
			Thread.sleep(2000);				
			
////5-Error Messages Click
		WebElement textErrormessagesclick = driver.findElement(By.xpath("//span[text()='Error Messages']"));
		textErrormessagesclick.click();
		Thread.sleep(2000);
////Error Messages-Addbtn-Click
		WebElement textErroraddbtn = driver.findElement(By.xpath("//div[@class='add_new']"));
		textErroraddbtn.click();
		Thread.sleep(2000);	
////Error Messages-AddReason name
		WebElement textErroraddreasonname = driver.findElement(By.xpath("//input[@formcontrolname='reason_name']"));
		textErroraddreasonname.sendKeys("Tool Breakage");
		Thread.sleep(2000);	
////Error Messages-AddReason Code		
		WebElement textErroraddreasoncode = driver.findElement(By.xpath("//input[@formcontrolname='reason_code']"));
		textErroraddreasoncode.sendKeys("1234");
		Thread.sleep(2000);	
////Error Messages-AddReason Save btn Click
		WebElement textErroraddreasonsavebtn = driver.findElement(By.xpath("//span[text()='Save']"));
		textErroraddreasonsavebtn.click();
		Thread.sleep(2000);	
		driver.navigate().refresh();
//		Thread.sleep(2000);	
////5.1-Edit-Error Messages-Click
		WebElement editErroreditbtnclick = driver.findElement(By.xpath("(//mat-icon[@ng-reflect-message='Edit'])[1]"));
		editErroreditbtnclick.click();
		Thread.sleep(2000);	
////Edit-Error Messages-Reason-Click
		WebElement editErrorreasonclick = driver.findElement(By.xpath("//input[@ng-reflect-name='reason_name']"));
		editErrorreasonclick.click();
		Thread.sleep(2000);	
//		//Robot-Edit-Error Messages-Add Reason
		Robot i = new Robot();
		i.keyPress(KeyEvent.VK_CONTROL);
		i.keyPress(KeyEvent.VK_A);
		i.keyRelease(KeyEvent.VK_A);
		i.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		i.keyPress(KeyEvent.VK_CONTROL);
	    i.keyPress(KeyEvent.VK_X);
		i.keyRelease(KeyEvent.VK_X);
		i.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
////Edit-Error Messages-Reason name-Enter the values
		WebElement editErrorreasonname = driver.findElement(By.xpath("//input[@ng-reflect-placeholder='Enter your reason']"));
		editErrorreasonname.sendKeys("Air Pressure Low");
		Thread.sleep(2000);
////Edit-Error Messages-Code-Click
				WebElement editErrorcodeclick = driver.findElement(By.xpath("//input[@ng-reflect-name='reason_code']"));
				editErrorcodeclick.click();
				Thread.sleep(2000);	
//				//Robot-Edit-Error Messages-Add Reason Code
				Robot j = new Robot();
				j.keyPress(KeyEvent.VK_CONTROL);
				j.keyPress(KeyEvent.VK_A);
				j.keyRelease(KeyEvent.VK_A);
				j.keyRelease(KeyEvent.VK_CONTROL);
				Thread.sleep(2000);
				j.keyPress(KeyEvent.VK_CONTROL);
			    j.keyPress(KeyEvent.VK_X);
				j.keyRelease(KeyEvent.VK_X);
				j.keyRelease(KeyEvent.VK_CONTROL);
				Thread.sleep(2000);
////Edit-Error Messages-Reason Code-Enter the values
				WebElement editErrorcode = driver.findElement(By.xpath("//input[@ng-reflect-placeholder='Enter your Code']"));
				editErrorcode.sendKeys("5678");
				Thread.sleep(2000);		
////Edit-Error Messages-Save btn
				WebElement editErrorsavebtn = driver.findElement(By.xpath("//span[text()=' Save']"));
				editErrorsavebtn.click();
				Thread.sleep(2000);		
////Edit-Error Messages-Delete Icon Click
				WebElement editErrordeleteiconclick = driver.findElement(By.xpath("(//mat-icon[text()='delete '])[1]"));
				editErrordeleteiconclick.click();
				Thread.sleep(2000);		
////Edit-Error Messages-Delete Icon-Yes/No btn
				WebElement editErrordeleteyesnobtn = driver.findElement(By.xpath("//button[text()='Yes, delete it!']"));
				editErrordeleteyesnobtn.click();
		
////6-File Mapping-Click
		WebElement textFilemappingclick = driver.findElement(By.xpath("//span[text()='File Mapping']"));
		textFilemappingclick.click();
		Thread.sleep(2000);	
////File Mapping-Add btn
		WebElement textFilemappingaddbtn = driver.findElement(By.xpath("//div[@class='add_new']"));
		textFilemappingaddbtn.click();
		Thread.sleep(2000);	
////File Mapping-Select Operation-Click
		WebElement textSelectoperationclick = driver.findElement(By.xpath("//span[text()='Select operation']"));
		textSelectoperationclick.click();
		Thread.sleep(2000);	
////File Mapping-Select Operation-Drying-Click
		WebElement textSelectoperationdryingclick = driver.findElement(By.xpath("//span[text()=' OP20 ']"));
		textSelectoperationdryingclick.click();
	    Thread.sleep(2000);	
////File Mapping- Close button
	    WebElement textFilemappingclosebtn = driver.findElement(By.xpath("//mat-icon[text()='close ']"));
	    textFilemappingclosebtn.click();
	    Thread.sleep(2000);	
////File Mapping-Choose File 
	    WebElement textFilemappingchoosefile = driver.findElement(By.xpath("//input[@formcontrolname='files']"));
	    textFilemappingchoosefile.click();
	
//7-Status Change
		WebElement textStatuschangeclick = driver.findElement(By.xpath("//span[text()='Status Change']"));
		textStatuschangeclick.click();
		
		
	}

}
