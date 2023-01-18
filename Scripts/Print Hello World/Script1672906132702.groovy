import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

/*def List<String> usernames = new ArrayList<String>();
 
 usernames.addAll(Arrays.asList("Pete", "John", "Mike"))
 
 def String username = "Mike"
 
 for(int i = 0 ; i < usernames.size(); i++)
{
	 
	if(username == usernames[i])
	{
		println("User is valid")	
			
	} 
	 
} */
/* def List<Integer> numbers = new ArrayList<Integer>();

numbers.addAll(Arrays.asList(5,10,15,20,25,30,35))



for(int x = 0; x < numbers.size() ; x++)
{

		if ((numbers[x] % 2) == 0)
		{
			println("the " + numbers[x] + " is even "  )
			
		}
	
	
}
*/
String star = ''

CustomKeywords.'classCelphone.Celphone.clickElement'(findTestObject(null))

CustomKeywords.'classCelphone.Celphone.clickElement'(findTestObject(null))

CustomKeywords.'classCelphone.Celphone.clickElement'()

