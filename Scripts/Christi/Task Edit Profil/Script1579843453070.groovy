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

        Mobile.tap(findTestObject('ikut lelang/topup_saldo/android.widget.TextView0 - IMG_20200106_160511_1.jpg', [('text') : varInput]), 
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
            varInput, 0)

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

        Mobile.setText(findTestObject('Page Profil/android.widget.EditText0 - Alamat Ktp'), varInput, 0)

        WebUI.delay(3)

        Mobile.tap(findTestObject('Page Profil/android.view.View0 - Simpan'), 0)

        WebUI.delay(3)

        break
    case 'pekerjaan':
        Mobile.tap(findTestObject('Page Profil/android.view.View0 - Ubah'), 0)

        WebUI.delay(3)

        Mobile.setText(findTestObject('Page Profil/android.widget.EditText0 - Pekerjaan'), 'guru', 0)

        WebUI.delay(3)

        Mobile.tap(findTestObject('Page Profil/android.view.View0 - Simpan'), 0)

        WebUI.delay(3)

        break
    case 'tgl lahir':
        Mobile.tap(findTestObject('Page Profil/android.view.View0 - Ubah'), 0)

        WebUI.delay(3)

        Mobile.tap(findTestObject('Page Profil/android.widget.Spinner0 - Edit Tgl Lahir'), 0)

        Mobile.delay(3)

        Mobile.tap(findTestObject('ikut lelang/topup_saldo/android.view.View0 - Pilih Tanggal Topup', [('text') : '31']), 
            0)

        Mobile.delay(5)

        Mobile.tap(findTestObject('ikut lelang/topup_saldo/android.widget.Button0 - SET Tanggal TopUp'), 0)

        WebUI.delay(3)

        break
}

WebUI.delay(3)

Mobile.closeApplication()

