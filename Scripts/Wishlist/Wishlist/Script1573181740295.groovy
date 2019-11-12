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

if (Mobile.verifyElementText(findTestObject('Wishlist/BID1'), BIDDING, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Wishlist/BID1'), 0)
} else if (Mobile.verifyElementText(findTestObject('Wishlist/BID2'), BIDDING, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Wishlist/BID2'), 0)
} else if (Mobile.verifyElementText(findTestObject('Wishlist/BID3'), BIDDING, FailureHandling.STOP_ON_FAILURE)) {
    Mobile.tap(findTestObject('Wishlist/BID3'), 0)
}

Mobile.tap(findTestObject('Wishlist/AddWishList'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Wishlist/Btn_Wishlist'), 0)

Mobile.waitForElementPresent(findTestObject('Wishlist/TextWishList'), 0)

if (Urutkan == 'Harga Tertinggi') {
    Mobile.tap(findTestObject('Wishlist/HargaTertinggi'), 0)
} else if (Urutkan == 'Harga Terendah') {
    Mobile.tap(findTestObject('Wishlist/HargaTerendah'), 0)
} else if (Urutkan == 'Waktu Berakhir') {
    Mobile.tap(findTestObject('Wishlist/WaktuBerakhir'), 0)
}

Mobile.delay(2)

if (LelangTerbuka == 'true') {
    Mobile.checkElement(findTestObject('Wishlist/LelangTerbuka'), 0)
}

if (LelangTertutup == 'true') {
    Mobile.checkElement(findTestObject('Wishlist/LelangTertutup'), 0)
}

if (SedangBerlangsung == 'true') {
    Mobile.checkElement(findTestObject('Wishlist/SedangBerlangsung'), 0)
}

if (AkanDatang == 'true') {
    Mobile.checkElement(findTestObject('Wishlist/AkanDatang'), 0)
}

Mobile.tap(findTestObject('Wishlist/BtnApply'), 0)

switch ('Result') {
    case 'Pass':
        Mobile.verifyElementVisible(findTestObject('Wishlist/BtnApply'), 0)
    case 'Fail':
        if (Detail.toString() == 'Lelang Tidak Ada') {
            Mobile.verifyElementVisible(findTestObject('Wishlist/BtnApply'), 0)
        }
        
        break
}

