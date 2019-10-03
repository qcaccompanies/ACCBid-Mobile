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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import com.detroitlabs.katalonmobileutil.testobject.XPathBuilder as XPathBuilder

Mobile.startApplication('C:\\Users\\15421\\git\\ACCBid-Mobile\\accbid.apk', false)

Mobile.tap(findTestObject('akun'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('lihatprofil'), 0)

Mobile.tap(findTestObject('ubah_profil'), 0)

<<<<<<< HEAD
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('ubah profil/ubahnohp'), 0)
=======
WebUI.callTestCase(findTestCase('Dashboard/profil/ubah_nomorHP'), [('noHpExpectedResult') : noHpExpectedResult, ('nomorhp') : nomorhp
        , ('nomorhpexpected') : nomorhpexpected], FailureHandling.STOP_ON_FAILURE)
>>>>>>> branch 'master' of https://github.com/qcaccompanies/ACCBid-Mobile

Mobile.waitForElementPresent(findTestObject('ubah_profil'), 0)

Mobile.tap(findTestObject('ubah_profil'), 0)

Mobile.closeApplication()

not_run: WebUI.callTestCase(findTestCase('calendar'), [('varTahun') : '2000'], FailureHandling.STOP_ON_FAILURE)

<<<<<<< HEAD
switch (expected_nohp.toString()) {
    case 'passed':
        Mobile.waitForElementPresent(findTestObject('ubah profil/element_verif_otp_nohp'), 0)
=======
not_run: Mobile.setText(findTestObject('ubahalamat'), alamat, 0)
>>>>>>> branch 'master' of https://github.com/qcaccompanies/ACCBid-Mobile

<<<<<<< HEAD
        Mobile.setText(findTestObject('ubah profil/input_OTP_nomorhp'), '356195', 0)
=======
not_run: inputanubahalamat = Mobile.getText(findTestObject('ubahalamat'), 0)
>>>>>>> branch 'master' of https://github.com/qcaccompanies/ACCBid-Mobile

<<<<<<< HEAD
        Mobile.tap(findTestObject('ubah profil/btn_verif_otp_nomorhp'), 0)

        Mobile.waitForElementPresent(findTestObject('ubah profil/btn_ok_berhasilubah_nomorhp'), 0)

        Mobile.tap(findTestObject('ubah profil/btn_ok_berhasilubah_nomorhp'), 0)

        break
    case 'failed':
        break
}

Mobile.delay(0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('ubah_profil'), 0)
=======
not_run: Mobile.verifyMatch(inputanubahalamat, alamat, false)
>>>>>>> branch 'master' of https://github.com/qcaccompanies/ACCBid-Mobile

not_run: Mobile.setText(findTestObject('ubahpekerjaan'), pekerjaan, 0)

not_run: inputanubahalamat = Mobile.getText(findTestObject('ubahpekerjaan'), 0)

not_run: Mobile.verifyMatch(inputanubahalamat, alamat, false)

not_run: Mobile.tap(findTestObject('btn_simpan_ubah_profil'), 0)

<<<<<<< HEAD
Mobile.setText(findTestObject('ubahpekerjaan'), pekerjaan, 0)

inputanubahpekerjaan = Mobile.getText(findTestObject('ubahpekerjaan'), 0)

Mobile.verifyMatch(inputanubahpekerjaan, pekerjaan, false)

Mobile.tap(findTestObject('btn_simpan_ubah_profil'), 0)

switch (expected.toString()) {
=======
not_run: switch (expected.toString()) {
>>>>>>> branch 'master' of https://github.com/qcaccompanies/ACCBid-Mobile
    case 'passed':
        Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

        break
    case 'failed':
        Mobile.verifyElementVisible(findTestObject('btn_simpan_ubah_profil'), 0)

        break
}

