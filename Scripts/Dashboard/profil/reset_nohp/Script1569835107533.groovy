import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://acc-tst1.outsystemsenterprise.com/BidMart/AdminCMS.aspx')

switch (expected_nohp.toString()) {
    case 'passed':
        WebUI.setText(findTestObject('Page_Login/input_Username_WebPatterns_wt24blockwtUsernamewtUserNameInput'), 'super_admin')

        WebUI.setText(findTestObject('Page_Login/input_Password_WebPatterns_wt24blockwtPasswordwtPasswordInput'), 'super_admin')

        WebUI.click(findTestObject('Page_Login/input_Forgot Password_WebPatterns_wt24blockwtActionwtLoginButton'))

        WebUI.click(findTestObject('Page_HomePage/span_Dummy'))

        WebUI.setText(findTestObject('Page_Dummy/input_Input No Kontrak_DublinTheme_wt38blockwtMainContentwt55'), '087830815038')

        WebUI.click(findTestObject('Page_Dummy/input_Input No Kontrak_DublinTheme_wt38blockwtMainContentwt26'))

        break
    case 'failed':
        break
}

