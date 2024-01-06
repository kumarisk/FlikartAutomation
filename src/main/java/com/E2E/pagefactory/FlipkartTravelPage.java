package com.E2E.pagefactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.E2E.Utils.CommonActions;

public class FlipkartTravelPage extends CommonActions{
	
	public WebDriver driver;

	public FlipkartTravelPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//label[contains(text(),'From')]/ancestor::div[@class='_3qBKP_ _1Jqgld']/input
	
	@FindBy(xpath="//input[@class='_1w3ZZo _1YBGQV _2EjOJB lZd1T6 _2vegSu _2mFmU7']")
	WebElement enterFromAddress;
	
	//*[contains(text(),'To')]/ancestor::div[@class='_3qBKP_ _1Jqgld']/input
	@FindBy(xpath="//input[@class='_1w3ZZo _1YBGQV _2EjOJB lZd1T6 _2dqBfU _2mFmU7']")
	WebElement enterToAddress;
	
	@FindBy(xpath="//div[@class='_24hoQ2 _1EzOls'] //div[@class='_2B0KQx']")
	List<WebElement> fromPartialList;
	
	@FindBy(xpath="//div[@class='_24hoQ2 _1EzOls'] //div[@class='_2B0KQx']")
	List<WebElement> toPartialList;
	
	@FindBy(xpath="//label[contains(text(),'Depart On')]/ancestor::div[@class='zzPDhz _1Jqgld']")
	WebElement departOn;
	
	
	@FindBy(xpath="//div[@class='PgmDJX'] /table[1] //td")
	List<WebElement> dayslist;
	
	@FindBy(xpath="(//div[@class='PgmDJX'] //tr[@class='_208PsT'])[1]")
	WebElement monthYearName;
	
	@FindBy(xpath="(//button[@class='_3CTB5G'])[2]")
	WebElement rightArrowbtn;
	
	@FindBy(xpath="//div[@class='_1Di8FC'] //div[@class='_2zLOdI']")
	List<WebElement> typeOftravellersList;
	
	@FindBy(xpath="(//div[@class='VjWsXZ'])[2]")
	WebElement adultIncrementbtn;
	
	@FindBy(xpath="(//button[@class='_2KpZ6l _34K0qG _37Ieie'])[3]")
	WebElement childrenIncrementbtn;
	
	@FindBy(xpath="(//button[@class='_2KpZ6l _34K0qG _37Ieie'])[5]")
	WebElement infantIncrementbtn;
	
//	@FindBy(xpath="(//div[contains(text(),'Adults')]/ancestor::div[@class='_1Di8FC']//button[@class='_2KpZ6l _34K0qG _37Ieie']")
//	WebElement adultsIncrementbtn;
//	
//	@FindBy(xpath="(//div[contains(text(),'Children')]/ancestor::div[@class='_1Di8FC'] //button[@class='_2KpZ6l _34K0qG _37Ieie']")
//	WebElement childrenIncrementbtn;
//	
//	@FindBy(xpath="(//div[contains(text(),'Infants')]/ancestor::div[@class='_1Di8FC'] //button[@class='_2KpZ6l _34K0qG _37Ieie']")
//	WebElement infantsIncrementbtn;
	
	@FindBy(xpath="//label[contains(@class,'_2Fn-Ln _2WzguY')] //div[@class='_2jIO64 _1NhOqr']")
	List<WebElement> cabinClasslist;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _1QYQF8 _3dESVI']")
	WebElement searchbtn;
	
	
	public boolean fromAddressIsEnabled() {
		boolean from = enterFromAddress.isEnabled();
		return from;
	}
	
	public boolean toAddressIsEnabled() {
		boolean to = enterToAddress.isEnabled();
		return to;
	}
	
	public boolean departureOnIsEnabled() {
		boolean departure = departOn.isEnabled();
		return departure;
	}
	
	
	
	
	public void selectFromAddressPO(String enterfromaddress,String selectaddressfromlist) throws InterruptedException {
		enterFromAddress.click();
		enterFromAddress.sendKeys(enterfromaddress);
		Thread.sleep(3000);
		for(int i=0;i<fromPartialList.size();i++) {
			String frompartialtext = fromPartialList.get(i).getText();
			if(frompartialtext.equalsIgnoreCase(selectaddressfromlist)) {
				fromPartialList.get(i).click();
				break;
			}
		}
		
	}
	
	public void selectToAddressPO(String entertoaddress,String selecttoaddresslist) {
		enterToAddress.click();
		enterToAddress.sendKeys(entertoaddress);
		for(int i=0;i<toPartialList.size();i++) {
			String frompartialtext = fromPartialList.get(i).getText();
			if(frompartialtext.equalsIgnoreCase(selecttoaddresslist)) {
				fromPartialList.get(i).click();
				break;
			}
		}
		
	}
	
	public void selectdate(String entermonthyear,String enterday) {
		String monthyeartext = monthYearName.getText();
		int k=0;
		while(!monthyeartext.equalsIgnoreCase(entermonthyear)) {
			rightArrowbtn.click();
			k++;
			String monthtext = monthYearName.getText();
			if(monthtext.equals(entermonthyear)) {
				for(int l=0;l<dayslist.size();l++) {
					String daystext = dayslist.get(l).getText();
					if(daystext.contains(enterday)) {
						dayslist.get(l).click();
						break;
					}
				}
				break;
			}
		}
	}
	
	public void selecttravellers(int adultcount,int childcount,int infantcount) {
				int count = adultcount;
				for(int a=1;a<count;a++) {
					adultIncrementbtn.click();	
				}
				int childrencounts = childcount;
				for(int c=0;c<childrencounts;c++) {
					childrenIncrementbtn.click();	
				}
				int infants=infantcount	;
				for(int f=0;f<infants;f++) {
					infantIncrementbtn.click();	
				}
					
	}
	
	public void selectCabin(String enterCabin) {
		for(int m=0;m<cabinClasslist.size();m++) {
			String cabin = cabinClasslist.get(m).getText();
			if(cabin.contains(enterCabin)) {
				cabinClasslist.get(m).click();
			}
		}
	}
	
	
	public void clickSearchbtn() {
		searchbtn.click();
	}
	
	
	
	
	
	
	
	

}
