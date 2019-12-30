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

Mobile.startApplication('C:\\Users\\ASUS\\git\\ACCBid-Mobile\\accbid.apk', false)

WebUI.delay(15)

CustomKeywords.'mobile.Swipers.RightLeft'(0.9, 0.5, 784)

CustomKeywords.'mobile.Swipers.RightLeft'(0.9, 0.5, 784)

WebUI.delay(3)

if (Mobile.verifyElementExist(findTestObject('ikut lelang/Lihat Semua Event Hari Ini'), 3, FailureHandling.STOP_ON_FAILURE)) {
    Mobile.tap(findTestObject('ikut lelang/Lihat Semua Event Hari Ini'), 0)
}

WebUI.delay(10)

CustomKeywords.'mobile.Swipers.UpDown'(0.9, 0.5, 270)

WebUI.delay(5)

if (Mobile.verifyElementExist(findTestObject('ikut lelang/div lelang automated 2'), 3, FailureHandling.STOP_ON_FAILURE)) {
    Mobile.tap(findTestObject('ikut lelang/lelang automated 2'), 0)
}

WebUI.delay(5)

Mobile.tap(findTestObject('ikut lelang/btn ikut lelang'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

switch (jenis_bid.toString()) {
    case 'otomatis':
        Mobile.tap(findTestObject('ikut lelang/btn bid otomatis'), 0, FailureHandling.STOP_ON_FAILURE)

        WebUI.delay(5)

        Mobile.tap(findTestObject('ikut lelang/bid otomatis/input batas atas penawaran'), 0)

        Mobile.setText(findTestObject('ikut lelang/bid otomatis/input batas atas penawaran'), batas_penawaran, 3)

        WebUI.delay(5)

        Mobile.tap(findTestObject('ikut lelang/bid otomatis/btn bid'), 0, FailureHandling.STOP_ON_FAILURE)

        not_run: if (batas_atas_penawaran > harga_item) {
            Mobile.verifyElementExist(findTestObject('ikut lelang/bid otomatis/deposit kurang'), 0)
        }
        
        not_run: if (batas_atas_penawaran < harga_item) {
            Mobile.verifyElementExist(findTestObject('ikut lelang/bid otomatis/deposit kurang'), 0)
        }
        
        not_run: if (batas_atas_penawaran == harga_item) {
            Mobile.verifyElementExist(findTestObject('ikut lelang/bid otomatis/deposit kurang'), 0)
        }
        
        Mobile.pressBack()

        break
    case 'manual':
        Mobile.tap(findTestObject('ikut lelang/btn bid manual'), 0, FailureHandling.STOP_ON_FAILURE)

        WebUI.delay(5)

        Mobile.setText(findTestObject('ikut lelang/bid manual/input harga penawaran'), batas_penawaran, 3)

        WebUI.delay(5)

        Mobile.tap(findTestObject('ikut lelang/bid otomatis/btn bid'), 0, FailureHandling.STOP_ON_FAILURE)

        break
}

WebUI.delay(5)

Mobile.closeApplication()

