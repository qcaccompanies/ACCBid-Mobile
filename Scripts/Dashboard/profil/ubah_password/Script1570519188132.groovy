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

Mobile.tap(findTestObject('akun'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('lihatprofil'), 0)

Mobile.tap(findTestObject('ubah_profil'), 0)

Mobile.tap(findTestObject('ubah profil/ubah_password'), 0)

Mobile.setText(findTestObject('ubah profil/input_pass_lama'), passlama, 0)

inputanpasslama = Mobile.getText(findTestObject('ubah profil/input_pass_lama'), 0)

Mobile.verifyMatch(passlama, expected_passlama, false)

Mobile.setText(findTestObject('ubah profil/input_pass_baru'), passbaru, 0)

inputanpassbaru = Mobile.getText(findTestObject('ubah profil/input_pass_baru'), 0)

Mobile.verifyMatch(passbaru, expected_passbaru, false)

Mobile.setText(findTestObject('ubah profil/kon_pass_baru'), konf_pass_baru, 0)

inputankonfpassbaru = Mobile.getText(findTestObject('ubah profil/kon_pass_baru'), 0)

Mobile.verifyMatch(konf_pass_baru, expected_konf_pass_baru, false)

Mobile.tap(findTestObject('ubah profil/btn_konf_ubahpass'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

switch (expected.toString()) {
    case 'passed':
        Mobile.verifyElementVisible(findTestObject('ubah_profil'), 0)

        break
    case 'failed':
        Mobile.verifyElementVisible(findTestObject('null'), 0)

        break
    case true:
        break
}

