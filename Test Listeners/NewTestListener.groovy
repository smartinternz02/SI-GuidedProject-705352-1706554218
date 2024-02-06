import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

class NewTestListener {
	/**
	 * Executes before every test case starts.
	 * @param testCaseContext related information of the executed test case.
	 */

	@BeforeTestCase
	def sampleBeforeTestCase() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Dlogin+amazon+account%26adgrpid%3D59671903835%26ext_vrnc%3Dhi%26gclid%3DCjwKCAiAtt2tBhBDEiwALZuhANiiKhXjHVUfhJmQGrqodmJSbPnQAa2algRyyGmhv625vd5Ywh5muRoCDr8QAvD_BwE%26hvadid%3D590652406969%26hvdev%3Dc%26hvlocphy%3D9300952%26hvnetw%3Dg%26hvqmt%3De%26hvrand%3D6624520738455616350%26hvtargid%3Dkwd-837441119212%26hydadcr%3D24542_2265395%26tag%3Dgooginhydr1-21%26ref%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0')
		WebUI.setText(findTestObject('Object Repository/Amazon login page/Page_Amazon.in/input_field-keywords'), 'YFYFXX')
		}
	

	/**
	 * Executes after every test case ends.
	 * @param testCaseContext related information of the executed test case.
	 */
		
	@AfterTestCase
	def sampleAfterTestCase() {
		WebUI.closeBrowser()
		
		
	}
	/**
	 * Executes before every test suite starts.
	 * @param testSuiteContext: related information of the executed test suite.
	 */
//	@BeforeTestSuite
//	def sampleBeforeTestSuite(TestSuiteContext testSuiteContext) {
//		println testSuiteContext.getTestSuiteId()
//	}

//	/**
//	 * Executes after every test suite ends.
//	 * @param testSuiteContext: related information of the executed test suite.
//	 */
//	@AfterTestSuite
//	def sampleAfterTestSuite(TestSuiteContext testSuiteContext) {
//		println testSuiteContext.getTestSuiteId()
//	}
}