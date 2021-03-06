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

Mobile.startApplication('C:\\Users\\Intan\\git\\ACCBid-Mobile\\accbid.apk', false)

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'ScrollUpDown.UpDown'(0, 0, 20, 20)

Mobile.tap(findTestObject('ACC Bid/detail_unit/btn_lihat_semua'), 0)

Mobile.tap(findTestObject('ACC Bid/detail_unit/detail_unit_gambar1'), 0)

Mobile.tap(findTestObject('ACC Bid/detail_unit/lihat_gambar1'), 0)

Mobile.tap(findTestObject('ACC Bid/detail_unit/tanda_close_gambar'), 0)

