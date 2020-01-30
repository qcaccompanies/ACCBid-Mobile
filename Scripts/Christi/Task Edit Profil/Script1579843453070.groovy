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

WebUI.delay(5)

Mobile.tap(findTestObject('akun'), 0)

WebUI.delay(3)

Mobile.tap(findTestObject('Page Profil/android.view.View0 - Lihat Profil'), 0)

WebUI.delay(3)

switch (edit.toString()) {
    case 'foto profil':
        Mobile.tap(findTestObject('Page Profil/android.widget.Image0 - Photo Profil'), 0)

        WebUI.delay(3)

        Mobile.tap(findTestObject('ikut lelang/topup_saldo/android.view.View0 - Gallery'), 0)

        WebUI.delay(3)

        Mobile.tap(findTestObject('ikut lelang/topup_saldo/android.widget.TextView0 - IMG_20200106_160511_1.jpg', [('text') : varPhoto]), 
            0)

        break
    case 'no handphone':
        Mobile.tap(findTestObject('Page Profil/android.view.View0 - Ubah'), 0)

        WebUI.delay(3)

        Mobile.tap(findTestObject('Page Profil/android.widget.EditText0 - No.Handphone'), 0)

        WebUI.delay(3)

        Mobile.tap(findTestObject('Page Profil/Page Ganti No Handphone/android.widget.EditText0 - No. Handphone Baru'), 
            0)

        WebUI.delay(3)

        Mobile.setText(findTestObject('Page Profil/Page Ganti No Handphone/android.widget.EditText0 - Input No. Handphone Baru'), 
            varNoHP, 0)

        WebUI.delay(3)

        if (expected == 'fail') {
            Mobile.verifyElementVisible(findTestObject('Page Profil/Page Ganti No Handphone/android.view.View0 - No.hp sudah digunakan'), 
                0)
        } else if (expected == 'pass') {
            Mobile.tap(findTestObject('Page Profil/Page Ganti No Handphone/android.widget.Button0 - Konfirmasi'), 0)

            WebUI.delay(20)

            Mobile.tap(findTestObject('Page Profil/Page Ganti No Handphone/android.widget.Button0 - Okay'), 0)

            WebUI.delay(3)
        }
        
        break
    case 'alamat ktp':
        Mobile.tap(findTestObject('Page Profil/android.view.View0 - Ubah'), 0)

        WebUI.delay(3)

        Mobile.setText(findTestObject('Page Profil/android.widget.EditText0 - Alamat Ktp'), varAlamat, 0)

        WebUI.delay(3)

        Mobile.tap(findTestObject('Page Profil/android.view.View0 - Simpan'), 0)

        WebUI.delay(3)

        break
    case 'pekerjaan':
        Mobile.tap(findTestObject('Page Profil/android.view.View0 - Ubah'), 0)

        WebUI.delay(3)

        Mobile.setText(findTestObject('Page Profil/android.widget.EditText0 - Pekerjaan'), varPekerjaan, 0)

        WebUI.delay(3)

        Mobile.tap(findTestObject('Page Profil/android.view.View0 - Simpan'), 0)

        WebUI.delay(3)

        break
    case 'tgl lahir':
        Mobile.tap(findTestObject('Page Profil/android.view.View0 - Ubah'), 0)

        WebUI.delay(3)

        Mobile.tap(findTestObject('Page Profil/android.widget.Spinner0 Input Tgl Lahir'), 0)

        Mobile.delay(3)

        if (expected == 'pass') {
            Mobile.tap(findTestObject('Page Profil/Page set tgl lahir/android.widget.TextView0 - btn set tahun'), 0, FailureHandling.STOP_ON_FAILURE)

            CustomKeywords.'mobile.Swipers.UpDown'(0.6, 0.9, 540)

            CustomKeywords.'mobile.Swipers.UpDown'(0.6, 0.9, 540)

            CustomKeywords.'mobile.Swipers.UpDown'(0.6, 0.9, 540)

            Mobile.tap(findTestObject('Page Profil/Page set tgl lahir/android.widget.TextView0 - pilih tahun', [('text') : varTahun]), 
                0, FailureHandling.STOP_ON_FAILURE)

            Mobile.delay(5)

            switch (varBulan.toString()) {
                case 'January':
                    Mobile.verifyElementExist(findTestObject('Page Profil/habis test hapus/android.widget.TextView0 - Month'), 
                        0)

                    break
                case 'February':
                    Mobile.tap(findTestObject('Page Profil/Page set tgl lahir/android.widget.ImageButton0 - Next month'), 
                        0, FailureHandling.STOP_ON_FAILURE)

                    Mobile.verifyElementExist(findTestObject('Page Profil/habis test hapus/android.widget.TextView0 - Month'), 
                        0)

                    break
                case 'March':
                    for (def index : (0..1)) {
                        Mobile.tap(findTestObject('Page Profil/Page set tgl lahir/android.widget.ImageButton0 - Next month'), 
                            0, FailureHandling.STOP_ON_FAILURE)
                    }
                    
                    break
                case 'April':
                    for (def index : (0..2)) {
                        Mobile.tap(findTestObject('Page Profil/Page set tgl lahir/android.widget.ImageButton0 - Next month'), 
                            0, FailureHandling.STOP_ON_FAILURE)
                    }
                    
                    break
                case 'May':
                    for (def index : (0..3)) {
                        Mobile.tap(findTestObject('Page Profil/Page set tgl lahir/android.widget.ImageButton0 - Next month'), 
                            0, FailureHandling.STOP_ON_FAILURE)
                    }
                    
                    break
                case 'June':
                    for (def index : (0..4)) {
                        Mobile.tap(findTestObject('Page Profil/Page set tgl lahir/android.widget.ImageButton0 - Next month'), 
                            0, FailureHandling.STOP_ON_FAILURE)
                    }
                    
                    break
                case 'July':
                    for (def index : (0..5)) {
                        Mobile.tap(findTestObject('Page Profil/Page set tgl lahir/android.widget.ImageButton0 - Next month'), 
                            0, FailureHandling.STOP_ON_FAILURE)
                    }
                    
                    break
                case 'August':
                    for (def index : (0..6)) {
                        Mobile.tap(findTestObject('Page Profil/Page set tgl lahir/android.widget.ImageButton0 - Next month'), 
                            0, FailureHandling.STOP_ON_FAILURE)
                    }
                    
                    break
                case 'September':
                    for (def index : (0..7)) {
                        Mobile.tap(findTestObject('Page Profil/Page set tgl lahir/android.widget.ImageButton0 - Next month'), 
                            0, FailureHandling.STOP_ON_FAILURE)
                    }
                    
                    break
                case 'October':
                    for (def index : (0..8)) {
                        Mobile.tap(findTestObject('Page Profil/Page set tgl lahir/android.widget.ImageButton0 - Next month'), 
                            0, FailureHandling.STOP_ON_FAILURE)
                    }
                    
                    break
                case 'November':
                    for (def index : (0..9)) {
                        Mobile.tap(findTestObject('Page Profil/Page set tgl lahir/android.widget.ImageButton0 - Next month'), 
                            0, FailureHandling.STOP_ON_FAILURE)
                    }
                    
                    break
                case 'December':
                    for (def index : (0..10)) {
                        Mobile.tap(findTestObject('Page Profil/Page set tgl lahir/android.widget.ImageButton0 - Next month'), 
                            0, FailureHandling.STOP_ON_FAILURE)
                    }
                    
                    break
            }
            
            Mobile.delay(5)

            Mobile.tap(findTestObject('Page Profil/Page set tgl lahir/android.view.View0 - pilih tgl', [('text') : varTanggal]), 
                0, FailureHandling.STOP_ON_FAILURE)

            Mobile.tap(findTestObject('Page Profil/Page set tgl lahir/android.widget.Button0 - SET'), 0)

            WebUI.delay(5)

            Mobile.tap(findTestObject('Page Profil/android.view.View0 - Simpan'), 0)
        } else if (expected == 'fail') {
            Mobile.tap(findTestObject('Page Profil/Page set tgl lahir/android.widget.TextView0 - btn set tahun'), 0, FailureHandling.STOP_ON_FAILURE)

            Mobile.tap(findTestObject('Page Profil/Page set tgl lahir/android.widget.TextView0 - pilih tahun', [('text') : varTahun]), 
                0, FailureHandling.STOP_ON_FAILURE)

            Mobile.delay(5)

            switch (varBulan.toString()) {
                case 'January':
                    Mobile.verifyElementExist(findTestObject('Page Profil/habis test hapus/android.widget.TextView0 - Month'), 
                        0)

                    break
                case 'February':
                    Mobile.tap(findTestObject('Page Profil/Page set tgl lahir/android.widget.ImageButton0 - Next month'), 
                        0, FailureHandling.STOP_ON_FAILURE)

                    Mobile.verifyElementExist(findTestObject('Page Profil/habis test hapus/android.widget.TextView0 - Month'), 
                        0)

                    break
                case 'March':
                    for (def index : (0..1)) {
                        Mobile.tap(findTestObject('Page Profil/Page set tgl lahir/android.widget.ImageButton0 - Next month'), 
                            0, FailureHandling.STOP_ON_FAILURE)
                    }
                    
                    break
                case 'April':
                    for (def index : (0..2)) {
                        Mobile.tap(findTestObject('Page Profil/Page set tgl lahir/android.widget.ImageButton0 - Next month'), 
                            0, FailureHandling.STOP_ON_FAILURE)
                    }
                    
                    break
                case 'May':
                    for (def index : (0..3)) {
                        Mobile.tap(findTestObject('Page Profil/Page set tgl lahir/android.widget.ImageButton0 - Next month'), 
                            0, FailureHandling.STOP_ON_FAILURE)
                    }
                    
                    break
                case 'June':
                    for (def index : (0..4)) {
                        Mobile.tap(findTestObject('Page Profil/Page set tgl lahir/android.widget.ImageButton0 - Next month'), 
                            0, FailureHandling.STOP_ON_FAILURE)
                    }
                    
                    break
                case 'July':
                    for (def index : (0..5)) {
                        Mobile.tap(findTestObject('Page Profil/Page set tgl lahir/android.widget.ImageButton0 - Next month'), 
                            0, FailureHandling.STOP_ON_FAILURE)
                    }
                    
                    break
                case 'August':
                    for (def index : (0..6)) {
                        Mobile.tap(findTestObject('Page Profil/Page set tgl lahir/android.widget.ImageButton0 - Next month'), 
                            0, FailureHandling.STOP_ON_FAILURE)
                    }
                    
                    break
                case 'September':
                    for (def index : (0..7)) {
                        Mobile.tap(findTestObject('Page Profil/Page set tgl lahir/android.widget.ImageButton0 - Next month'), 
                            0, FailureHandling.STOP_ON_FAILURE)
                    }
                    
                    break
                case 'October':
                    for (def index : (0..8)) {
                        Mobile.tap(findTestObject('Page Profil/Page set tgl lahir/android.widget.ImageButton0 - Next month'), 
                            0, FailureHandling.STOP_ON_FAILURE)
                    }
                    
                    break
                case 'November':
                    for (def index : (0..9)) {
                        Mobile.tap(findTestObject('Page Profil/Page set tgl lahir/android.widget.ImageButton0 - Next month'), 
                            0, FailureHandling.STOP_ON_FAILURE)
                    }
                    
                    break
                case 'December':
                    for (def index : (0..10)) {
                        Mobile.tap(findTestObject('Page Profil/Page set tgl lahir/android.widget.ImageButton0 - Next month'), 
                            0, FailureHandling.STOP_ON_FAILURE)
                    }
                    
                    break
            }
            
            Mobile.delay(5)

            Mobile.tap(findTestObject('Page Profil/Page set tgl lahir/android.view.View0 - pilih tgl', [('text') : varTanggal]), 
                0, FailureHandling.STOP_ON_FAILURE)

            Mobile.tap(findTestObject('Page Profil/Page set tgl lahir/android.widget.Button0 - SET'), 0)

            WebUI.delay(5)

            Mobile.tap(findTestObject('Page Profil/android.view.View0 - Simpan'), 0)

            Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

            Mobile.verifyElementVisible(findTestObject('Page Profil/Page set tgl lahir/android.view.View0 - Tgl. Lahir (No Text)'), 
                0)
        }
        
        WebUI.delay(3)

        break
}

WebUI.delay(3)

Mobile.closeApplication()

