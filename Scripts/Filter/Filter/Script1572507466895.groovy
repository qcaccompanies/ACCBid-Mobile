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

Mobile.startApplication('C:/Users/Marvin/Documents/GitHub/ACCBid-Mobile/accbid.apk', false)

Mobile.tap(findTestObject('Filter/Btn_Lihat_Semua'), 0)

Mobile.tap(findTestObject('Filter/Filter'), 0)

Mobile.setText(findTestObject('Filter/Brand'), Brand, 0)

Mobile.tap(findTestObject('Filter/Click', [('text') : Brand]), 0)

Mobile.setText(findTestObject('Filter/Type'), Type, 0)

Mobile.tap(findTestObject('Filter/Click', [('text') : Type]), 0)

Mobile.setText(findTestObject('Filter/Model'), Model, 0)

Mobile.tap(findTestObject('Filter/Click', [('text') : Model]), 0)

Mobile.setText(findTestObject('Filter/Tahun(Min)'), Tahun_MIN, 0)

Mobile.setText(findTestObject('Filter/Tahun(Max)'), Tahun_MAX, 0)

if (Transmisi == 'SEMUA') {
    Mobile.tap(findTestObject('Filter/BtnSemua'), 0)
} else if (Transmisi == 'MANUAL') {
    Mobile.tap(findTestObject('Filter/BtnManual'), 0)
} else if (Transmisi == 'AUTOMATIC') {
    Mobile.tap(findTestObject('Filter/btnAutomatic'), 0)
}

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

if (Lelang == 'TERBUKA') {
    Mobile.tap(findTestObject('Filter/BtnLelangTerbuka'), 0)
} else if (Lelang == 'TERTUTUP') {
    Mobile.tap(findTestObject('Filter/BtnLelangTertutup'), 0)
}

Mobile.tap(findTestObject('Filter/BtnTemukanMobil'), 0)

