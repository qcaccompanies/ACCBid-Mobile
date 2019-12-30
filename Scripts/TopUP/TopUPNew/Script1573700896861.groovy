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

Mobile.startApplication('C:\\Users\\ASUS\\git\\ACCBid-Mobile\\accbid.apk', false)

Mobile.getDeviceHeight()

Mobile.getDeviceWidth()

Mobile.tap(findTestObject('TopUP/BTN_Deposit'), 0)

if (JenisLelang == 'Astria') {
    Mobile.tap(findTestObject('TopUP/Btn_TopUP'), 0)

    Mobile.setText(findTestObject('TopUP/InputNominal'), varTopUP, 0)

    Mobile.tap(findTestObject('TopUP/DropDownBank'), 0)

    Mobile.tap(findTestObject('Kalkulator/Click', [('text') : varBank]), 0)

    if (Mobile.verifyElementVisible(findTestObject('TopUP/NotifKelipatan'), 3, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('TopUP/BtnLanjut'), 0, FailureHandling.STOP_ON_FAILURE)

        Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)
    } else {
        Mobile.tap(findTestObject('TopUP/BtnLanjut'), 0)

        Mobile.tap(findTestObject('TopUP/Btn_View'), 0)

        Mobile.tap(findTestObject('TopUP/CloseBtn'), 0)

        Mobile.tap(findTestObject('TopUP/BankTransferDrop'), 0)

        Mobile.tap(findTestObject('TopUP/BCAPaymentButton'), 0)

        CustomKeywords.'ScrollUpDown.UpDown'(52, 1891, 52, 1891)

        Mobile.pressHome()

        Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)
    }
} else if (JenisLelang == 'IBID') {
    CustomKeywords.'mobile.Swipers.RightLeft'(0.9, 0.5, 300)

    Mobile.tap(findTestObject('TopUP/TopUPIBID/Top UP IBID'), 0)

    Mobile.setText(findTestObject('TopUP/TopUPIBID/NominalTopUPIBID'), varTopUP, 0)

    Mobile.tap(findTestObject('TopUP/TopUPIBID/Bank'), 0)

    Mobile.tap(findTestObject('TopUP/TopUPIBID/BankBar', [('text') : varBank]), 0)

    Mobile.tap(findTestObject('TopUP/TopUPIBID/DatePicker'), 0)

    Mobile.tap(findTestObject('TopUP/TopUPIBID/DateSelect', [('text') : varTanggal]), 0)

    Mobile.tap(findTestObject('TopUP/TopUPIBID/SeteLButton'), 0)

    Mobile.tap(findTestObject('TopUP/TopUPIBID/ButtonUploadPembayaran'), 0)

    if (varFoto == 'Camera') {
        Mobile.tap(findTestObject('TopUP/TopUPIBID/CameraBTN (1)'), 0)

        Mobile.tap(findTestObject('TopUP/TopUPIBID/CaptureButton'), 0)

        Mobile.tap(findTestObject('TopUP/TopUPIBID/CameraOK'), 0)

        Mobile.tap(findTestObject('TopUP/TopUPIBID/KonfirmasiBtn'), 0)

        if (Mobile.verifyElementVisible(findTestObject('TopUP/TopUPIBID/AlertWajibDiisi1'), 0, FailureHandling.OPTIONAL) || 
        Mobile.verifyElementVisible(findTestObject('TopUP/TopUPIBID/AlertFotoPembayaranHarusDiUpload'), 0, FailureHandling.OPTIONAL)) {
            Mobile.verifyElementVisible(findTestObject('TopUP/TopUPIBID/KonfirmasiBtn'), 0)
        } else {
            Mobile.pressBack()
        }
    } else if (varFoto == 'Gallery') {
        Mobile.tap(findTestObject('TopUP/TopUPIBID/GalleryBTNS'), 0)

        Mobile.tap(findTestObject('TopUP/TopUPIBID/FotoGallery', [('text') : Picture]), 0)

        Mobile.tap(findTestObject('TopUP/TopUPIBID/KonfirmasiBtn'), 0)

        if (Mobile.verifyElementVisible(findTestObject('TopUP/TopUPIBID/AlertWajibDiisi1'), 0, FailureHandling.OPTIONAL) || 
        Mobile.verifyElementVisible(findTestObject('TopUP/TopUPIBID/AlertFotoPembayaranHarusDiUpload'), 0, FailureHandling.OPTIONAL)) {
            Mobile.verifyElementVisible(findTestObject('TopUP/TopUPIBID/KonfirmasiBtn'), 0)
        } else {
            Mobile.pressBack()
        }
    }
}

switch ('Result') {
    case 'Pass':
        Mobile.verifyElementVisible(findTestObject('TopUP/BtnLanjut'), 0)

        break
    case 'Fail':
        break
        
        if (Detail.toString() == 'Nominal Tidak Boleh Kosong') {
            Mobile.verifyElementVisible(findTestObject('TopUP/BtnLanjut'), 0)
        }
        
        if (Detail.toString() == 'Bank Tidak Boleh Kosong') {
            Mobile.verifyElementVisible(findTestObject('TopUP/BtnLanjut'), 0)
        }
        
        if (Detail.toString() == 'Tanggal Tidak Boleh Kosong') {
            Mobile.verifyElementVisible(findTestObject('TopUP/BtnLanjut'), 0)
        }
}

