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

Mobile.tap(findTestObject('Lelang/Btn_Lihat_Semua'), 0)

if (JenisLelang == 'Tes') {
    Mobile.tap(findTestObject('Lelang/Btn_Tes'), 0)
} else if (JenisLelang == 'Astria') {
    Mobile.tap(findTestObject('Lelang/Btn_Astria'), 0)
} else if (JenisLelang == 'IBID') {
    Mobile.tap(findTestObject('Lelang/Btn_IBID'), 0)
}

Mobile.tap(findTestObject('Lelang/DropDownLokasi'), 0)

Mobile.setText(findTestObject('Lelang/DropDownLokasi'), Lokasi, 0)

Mobile.tap(findTestObject('Lelang/Click', [('text') : Lokasi]), 0)

Mobile.tap(findTestObject('Lelang/MonthTap'), 0)

Mobile.tap(findTestObject('Lelang/MonthRadio', [('text') : Bulan]), 0)

Mobile.tap(findTestObject('Lelang/YearTap'), 0)

Mobile.tap(findTestObject('Lelang/MonthRadio', [('text') : Tahun]), 0)

Mobile.tap(findTestObject('Lelang/TapTanggal', [('text') : Tanggal]), 0)

if (Mobile.verifyElementVisible(findTestObject('Lelang/BarLelang'), 0, FailureHandling.STOP_ON_FAILURE)) {
    Mobile.tap(findTestObject('Lelang/BarLelang'), 0, FailureHandling.STOP_ON_FAILURE)
} else {
    Mobile.comment('Tak Ada Lelang')
}

