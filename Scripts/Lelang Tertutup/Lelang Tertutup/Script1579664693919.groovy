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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('C:/Users/Marvin/git/ACCBid-Mobile/accbid.apk', false)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'mobile.Swipers.RightLeft'(0.9, 0.5, 1450)

CustomKeywords.'mobile.Swipers.RightLeft'(0.9, 0.5, 1450)

CustomKeywords.'mobile.Swipers.RightLeft'(0.9, 0.5, 1450)

Mobile.tap(findTestObject('Lelang Tertutup/Lihat_Semua_Event2'), 0)

Mobile.scrollToText(NamaLelang, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Lelang Tertutup/Select_Lelang', [('text') : NamaLelang]), 0)

Mobile.tap(findTestObject('Lelang Tertutup/Ikut_Lelang_BTN'), 0)

Mobile.tap(findTestObject('Lelang Tertutup/Masukan_Penawaran_BTN'), 0)

if (Mobile.verifyElementVisible(findTestObject('Lelang Tertutup/Alert_Dana_Tidak_Mecukupi'), 0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Lelang Tertutup/Masukan_Penawaran_BTN'), 0)
} else {
    Mobile.setText(findTestObject('Lelang Tertutup/Input_Penwaran'), UangLelang, 0)

    Mobile.tap(findTestObject('Lelang Tertutup/Bid_BTN'), 0)

    if (Mobile.verifyElementVisible(findTestObject('Lelang Tertutup/Alert_Penawaran_Kelipatan_500K'), 0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Lelang Tertutup/Bid_BTN'), 0)
    } else if (Mobile.verifyElementVisible(findTestObject('Lelang Tertutup/Alert_Dana_Tidak_Mecukupi'), 0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Lelang Tertutup/Bid_BTN'), 0)
    } else {
        Mobile.tap(findTestObject('Lelang Tertutup/Bid_BTN'), 0)
    }
}

switch ('Expected') {
    case 'Pass':
        break
    case 'Fail':
        break
        
        if (Keterangan.toString() == 'Kelipatan Harus Lebih Tinggi Dari Sebelumnya') {
            Mobile.verifyElementVisible(findTestObject('TopUP/BtnLanjut'), 0)
        }
        
        if (Keterangan.toString() == 'Sudah Dua Kali Penawaran') {
            Mobile.verifyElementVisible(findTestObject('TopUP/BtnLanjut'), 0)
        }
        
        if (Keterangan.toString() == 'Penawaran Harus Sesuai Minimal Harga') {
            Mobile.verifyElementVisible(findTestObject('TopUP/BtnLanjut'), 0)
        }
        
        if (Keterangan.toString() == 'Tidak Ada Saldo') {
            Mobile.verifyElementVisible(findTestObject('TopUP/BtnLanjut'), 0)
        }
}

