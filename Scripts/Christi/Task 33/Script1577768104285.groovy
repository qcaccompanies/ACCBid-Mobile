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

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'mobile.Swipers.RightLeft'(0.9, 0.3, 1640)

CustomKeywords.'mobile.Swipers.RightLeft'(0.9, 0.5, 1640)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('ikut lelang/bid manual/android.view.View0 - Lihat Semua Event Hari Ini'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'mobile.Swipers.UpDown'(0.9, 0.5, 540)

switch (jenis_bid.toString()) {
    case 'otomatis':
        Mobile.tap(findTestObject('ikut lelang/bid otomatis/android.view.View0 - IBID - Sale Akhir Tahun'), 0)

        break
    case 'manual':
        Mobile.tap(findTestObject('ikut lelang/bid otomatis/android.widget.Button0 - Bid Otomatis'), 0)

        break
}

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('ikut lelang/bid otomatis/android.widget.Button0 - Ikut Lelang'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

switch (cek_disable.toString()) {
    case 'otomatis':
        Mobile.tap(findTestObject('ikut lelang/bid otomatis/android.widget.Button0 - Bid Otomatis'), 0)

        Mobile.verifyElementNotVisible(findTestObject(null), 0)

        Mobile.tap(findTestObject('ikut lelang/android.widget.Button0 - Bid Manual'), 0)

        Mobile.verifyElementVisible(findTestObject(null), 0)

        break
    case 'manual':
        Mobile.tap(findTestObject('ikut lelang/bid otomatis/android.widget.Button0 - Bid Otomatis'), 0)

        Mobile.verifyElementNotVisible(findTestObject(null), 0)

        Mobile.tap(findTestObject('ikut lelang/android.widget.Button0 - Bid Manual'), 0)

        Mobile.verifyElementVisible(findTestObject(null), 0)

        break
}

