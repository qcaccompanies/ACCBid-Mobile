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

WebUI.delay(7)

Mobile.tap(findTestObject('akun'), 0)

WebUI.delay(3)

CustomKeywords.'ScrollUpDown.UpDown'(0, 0, 0, 0)

Mobile.tap(findTestObject('Page_Panduan Lelang/android.view.View0 - Panduan Lelang'), 0)

WebUI.delay(3)

switch (view.toString()) {
    case 'ikut lelang':
        Mobile.tap(findTestObject('Page_Panduan Lelang/android.view.View0 - Tata Cara ikut Lelang'), 0)

        WebUI.delay(7)

        Mobile.verifyElementVisible(findTestObject('Page_Panduan Lelang/android.view.View0 - A Tata Cara Ikut Lelang'), 
            0)

        WebUI.delay(3)

        break
    case 'pembayaran dan pengambilan unit':
        Mobile.tap(findTestObject('Page_Panduan Lelang/android.view.View0 - Tata Cara Pembayaran dan Pengambilan Unit'), 
            0)

        WebUI.delay(3)

        Mobile.verifyElementVisible(findTestObject('Page_Panduan Lelang/android.view.View0 - D Tata Cara Pembayaran Dan Pengambilan Unit'), 
            0)

        not_run: Mobile.verifyElementText(findTestObject('Page_Panduan Lelang/judul.tata.cara.pembayaran.da.pengambilan.unit'), 
            'Tata Cara Pembayaran Dan Pengambilan Unit')

        WebUI.delay(3)

        break
    case 'penarikan deposit':
        Mobile.tap(findTestObject('Page_Panduan Lelang/android.view.View0 - Tata Cara Penarikan Deposit'), 0)

        WebUI.delay(3)

        Mobile.verifyElementVisible(findTestObject('Page_Panduan Lelang/android.view.View0 - C Tata Cara Penarikan Deposit'), 
            0)

        not_run: Mobile.verifyElementText(findTestObject('Page_Panduan Lelang/judul.tata.cara.pembayaran.da.pengambilan.unit'), 
            'Tata Cara Penarikan Deposit', FailureHandling.STOP_ON_FAILURE)

        WebUI.delay(3)

        break
    case 'top up deposit':
        Mobile.tap(findTestObject('Page_Panduan Lelang/android.view.View0 - Tata Cara Top Up Deposit'), 0)

        WebUI.delay(3)

        Mobile.verifyElementVisible(findTestObject('Page_Panduan Lelang/android.view.View0 - B Tata Cara Top Up Deposit'), 
            0)

        not_run: Mobile.verifyElementText(findTestObject('Page_Panduan Lelang/judul.tata.cara.pembayaran.da.pengambilan.unit'), 
            'Tata Cara Top Up Deposit')

        WebUI.delay(3)

        break
}

WebUI.delay(3)

Mobile.pressBack()

WebUI.delay(3)

Mobile.closeApplication()

