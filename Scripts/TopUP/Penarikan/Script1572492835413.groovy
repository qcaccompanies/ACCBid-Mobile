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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

Mobile.startApplication('C:/Users/Marvin/git/ACCBid-Mobile/accbid.apk', false)

Mobile.tap(findTestObject('TopUP/BTN_Deposit'), 0)

if (JenisPenarikan == 'Astria') {
    Mobile.tap(findTestObject('TopUP/Penarikan/Btn_Penarikan'), 0)

    Mobile.setText(findTestObject('TopUP/Penarikan/Nominal'), Nominal, 0)

    if (Mobile.verifyElementVisible(findTestObject('TopUP/Penarikan/PopUpKelipatan'), 3, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('TopUP/Penarikan/BTN_Lanjut'), 0)
    } else {
        Mobile.tap(findTestObject('TopUP/Penarikan/DropDownBank'), 0)

        Mobile.tap(findTestObject('Kalkulator/Click', [('text') : Bank]), 0)

        Mobile.tap(findTestObject('TopUP/Penarikan/BTN_Lanjut'), 0)

        if (Mobile.verifyElementVisible(findTestObject('TopUP/Penarikan/PopUPPenarikanMelibihiSaldo'), 3, FailureHandling.STOP_ON_FAILURE)) {
            Mobile.verifyElementVisible(findTestObject('TopUP/BtnLanjut'), 3, FailureHandling.OPTIONAL)
        } else {
            Mobile.setText(findTestObject('TopUP/Penarikan/KodeOTP'), OTP, 0)

            Mobile.tap(findTestObject('TopUP/Penarikan/BTN_Verifikasi'), 0)

            if (Mobile.verifyElementVisible(findTestObject('TopUP/Penarikan/KodeVerifikasiSalah'), 3, FailureHandling.OPTIONAL)) {
                Mobile.verifyElementVisible(findTestObject('TopUP/Penarikan/BTN_Verifikasi'), 3, FailureHandling.OPTIONAL)
            } else {
                Mobile.tap(findTestObject('TopUP/Penarikan/ButonOkay'), 0)
            }
        }
    }
} else if (JenisPenarikan == 'IBID') {
    CustomKeywords.'mobile.Swipers.RightLeft'(0.9, 0.5, 300)

    Mobile.tap(findTestObject('TopUP/PenarikanIBID/BtnPenarikanIBID'), 0)

    Mobile.setText(findTestObject('TopUP/PenarikanIBID/InputNominalPenarikanIBID'), Nominal, 0)

    Mobile.tap(findTestObject('TopUP/PenarikanIBID/DropDownBank'), 0)

    Mobile.tap(findTestObject('Kalkulator/Click', [('text') : 'BANK CENTRAL DAGANG']), 0)

    Mobile.tap(findTestObject('TopUP/PenarikanIBID/BTNLANJUTIBID'), 0)

    if (Mobile.verifyElementVisible(findTestObject('TopUP/PenarikanIBID/AlertPenarikanIBID'), 0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('TopUP/PenarikanIBID/BTNLANJUTIBID'), 0)
    } else {
        Mobile.setText(findTestObject('TopUP/PenarikanIBID/OTPPenarikanIBID'), OTP, 0)

        Mobile.tap(findTestObject('TopUP/PenarikanIBID/BTNVerifPenarikanIBID'), 0)

        if (Mobile.verifyElementVisible(findTestObject('TopUP/PenarikanIBID/AlertKodeSalahIBID'), 0, FailureHandling.OPTIONAL)) {
            Mobile.verifyElementVisible(findTestObject('TopUP/PenarikanIBID/BTNVerifPenarikanIBID'), 0)
        } else {
            Mobile.tap(findTestObject('TopUP/PenarikanIBID/PenarikanIBIDOkay'), 0)
        }
    }
}

switch ('Result') {
    case 'Pass':
        Mobile.verifyElementVisible(findTestObject('TopUP/Penarikan/BTN_Lanjut'), 0)

        break
    case 'Fail':
        if (Detail.toString() == 'No Saldo') {
            Mobile.verifyElementVisible(findTestObject('TopUP/Penarikan/BTN_Lanjut'), 0)
        }
        
        if (Detail.toString() == 'Kelipatan Harus 500K') {
            Mobile.verifyElementVisible(findTestObject('TopUP/Penarikan/BTN_Lanjut'), 0)
        }
        
        if (Detail.toString() == 'OTP salah') {
            Mobile.verifyElementVisible(findTestObject('TopUP/Penarikan/BTN_Lanjut'), 0)
        }
        
        if (Detail.toString() == 'Harus Kelipatan 1 dan Tidak Boleh Kosong') {
            Mobile.verifyElementVisible(findTestObject('TopUP/Penarikan/BTN_Lanjut'), 0)
        }
        
        if (Detail.toString() == 'Nominal Harus Diisi') {
            Mobile.verifyElementVisible(findTestObject('TopUP/Penarikan/BTN_Lanjut'), 0)

            break
        }
        
        break
}

