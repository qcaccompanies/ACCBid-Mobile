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

if (Mobile.verifyElementText(findTestObject('Wishlist/BID1'), BIDDING, FailureHandling.STOP_ON_FAILURE)) {
    Mobile.tap(findTestObject('Wishlist/BID1'), 0)
} else if (Mobile.verifyElementText(findTestObject('Wishlist/BID2'), BIDDING, FailureHandling.STOP_ON_FAILURE)) {
    Mobile.tap(findTestObject('Wishlist/BID2'), 0)
} else if (Mobile.verifyElementText(findTestObject('Wishlist/BID3'), BIDDING, FailureHandling.STOP_ON_FAILURE)) {
    Mobile.tap(findTestObject('Wishlist/BID3'), 0)
}

Mobile.tap(findTestObject(null), 0)

