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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Dlogin+amazon+account%26adgrpid%3D59671903835%26ext_vrnc%3Dhi%26gclid%3DCjwKCAiAtt2tBhBDEiwALZuhANiiKhXjHVUfhJmQGrqodmJSbPnQAa2algRyyGmhv625vd5Ywh5muRoCDr8QAvD_BwE%26hvadid%3D590652406969%26hvdev%3Dc%26hvlocphy%3D9300952%26hvnetw%3Dg%26hvqmt%3De%26hvrand%3D6624520738455616350%26hvtargid%3Dkwd-837441119212%26hydadcr%3D24542_2265395%26tag%3Dgooginhydr1-21%26ref%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0')

WebUI.setText(findTestObject('Object Repository/Amazon mini tv/Page_Amazon.in/input_field-keywords'), 'UAYGNT')

WebUI.click(findTestObject('Object Repository/Amazon mini tv/Page_Amazon.in/button_Continue shopping'))

WebUI.setText(findTestObject('Object Repository/Amazon mini tv/Page_Amazon Sign In/input_email'), '9644307700')

WebUI.click(findTestObject('Object Repository/Amazon mini tv/Page_Amazon Sign In/inputcontinue'))

WebUI.setEncryptedText(findTestObject('Object Repository/Amazon mini tv/Page_Amazon Sign In/input_password'), '9XZjq51hSuGIo5DsRdiJ+g==')

WebUI.click(findTestObject('Object Repository/Amazon mini tv/Page_Amazon Sign In/inputsignInSubmit'))

WebUI.click(findTestObject('Object Repository/Amazon mini tv/Page_Amazon.in  login amazon account/a_Amazon miniTV'))

WebUI.closeBrowser()

