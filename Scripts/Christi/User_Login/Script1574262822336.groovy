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

Mobile.startApplication('C:\\Users\\ASUS\\Desktop\\accbid(2).apk', false)

WebUI.delay(15)

Mobile.tap(findTestObject('Page_Login/menu.MasukAtauDaftar'), 0)

WebUI.delay(3)

Mobile.tap(findTestObject('Page_Login/menu.MasukAccBid'), 0)

WebUI.delay(3)

Mobile.tap(findTestObject('Page_Login/input_emailNoHp'), 0)

Mobile.setText(findTestObject('Page_Login/input_emailNoHp'), email, 3)

WebUI.delay(3)

Mobile.tap(findTestObject('Page_Login/input_passwordLogin'), 0)

Mobile.setText(findTestObject('Page_Login/input_passwordLogin'), password, 3)

WebUI.delay(5)

Mobile.tap(findTestObject('Page_Login/btn.Masuk'), 0)

WebUI.delay(15)

not_run: Mobile.startApplication('C:\\Users\\ASUS\\Desktop\\accbid(2).apk', true)

not_run: Mobile.tap(findTestObject('Page_Pusat Bantuan/android.widget.EditText0'), 0)

not_run: Mobile.setText(findTestObject('Page_Pusat Bantuan/android.widget.EditText0'), 'christiantiangelin@gmail.com', 0)

not_run: Mobile.tap(findTestObject('Page_Pusat Bantuan/android.view.View0 - Kata Sandi'), 0)

not_run: Mobile.setText(findTestObject('Page_Pusat Bantuan/android.widget.EditText0 (1)'), 'Chr!st1', 0)

not_run: Mobile.tap(findTestObject('Page_Pusat Bantuan/android.widget.Button0 - Masuk'), 0)

