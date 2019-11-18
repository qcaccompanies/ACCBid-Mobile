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

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('akun'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('akun_bank/akun_bank'), 0)

if (Mobile.verifyElementVisible(findTestObject('tambah_akun_bank'), 3, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('akun_bank/tambah_akun_bank'), 0)
} else {
    Mobile.tap(findTestObject('akun_bank/btn_tambah_akun_bank_lain'), 0)
}

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('akun_bank/input_nama_bank'), 0)

Mobile.setText(findTestObject('akun_bank/input_nama_bank'), nama_bank, 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('object_diluar_aplikasi/picklist', [('text') : nama_bank]), 0)

inputan_nama_bank = Mobile.getText(findTestObject('akun_bank/input_nama_bank'), 0)

Mobile.verifyMatch(nama_bank, expected_nama_bank, false)

Mobile.setText(findTestObject('akun_bank/input_cabang_bank'), cabang_bank, 0)

inputan_cabang_bank = Mobile.getText(findTestObject('akun_bank/input_cabang_bank'), 0)

Mobile.verifyMatch(cabang_bank, expected_cabang, false)

Mobile.setText(findTestObject('akun_bank/input_nama_pemilik_rekening'), nama_pemilik, 0)

inputan_nama_pemilik_rek = Mobile.getText(findTestObject('akun_bank/input_nama_pemilik_rekening'), 0)

Mobile.verifyMatch(nama_pemilik, expected_nama, false)

Mobile.setText(findTestObject('akun_bank/input_nomor_rekening'), nomor_rekening, 0)

inputan_nomor_rekening = Mobile.getText(findTestObject('akun_bank/input_nomor_rekening'), 0)

Mobile.verifyMatch(nomor_rekening, expected_nomor_rek, false)

Mobile.tap(findTestObject('akun_bank/input_kata_sandi'), 0)

Mobile.setText(findTestObject('akun_bank/input_kata_sandi'), kata_sandi, 0)

inputan_kata_sandi = Mobile.getText(findTestObject('akun_bank/input_kata_sandi'), 0)

Mobile.verifyMatch(kata_sandi, expected_kata_sandi, false)

Mobile.tapAtPosition(0, 66)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('akun_bank/btn_tambah_akun_bank1'), 0)

switch (expected.toString()) {
    case 'passed':
        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        Mobile.verifyElementNotVisible(findTestObject('akun_bank/btn_tambah_akun_bank1'), 0)

        break
    case 'failed':
        Mobile.delay(0, FailureHandling.STOP_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('akun_bank/btn_tambah_akun_bank1'), 0)

        break
}

Mobile.pressBack()

