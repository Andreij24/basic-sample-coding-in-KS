package classCelphone

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Celphone {

	//define a variable

	String color;
	String type;
	double price;


	public void setColor(String celphoneColor) {

		color = celphoneColor;

	}

	public void setType(String celphoneType) {

		type = celphoneType;
	}


	public void setPrice(double celphonePrice) {

		price = celphonePrice;
	}


	public String getDetails() {

		String details = String.format("This %s %s is for sale for the price of %s", color, type, price)
		System.out.println(details );

		return details;
	}
	
	@Keyword
	def initializedCelphone() {
		Celphone celphone1 = new Celphone()

		celphone1.setColor('red')

		celphone1.setType('samsung')

		celphone1.setPrice(15000)

		celphone1.getDetails()
	}


}
