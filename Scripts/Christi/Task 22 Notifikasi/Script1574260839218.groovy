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

WebUI.callTestCase(findTestCase('Christi/User_Login'), [('email') : 'christiantiangelin@gmail.com', ('password') : 'Chr!st1'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(7)

Mobile.tap(findTestObject('Page_Login/AKUN'), 0)

WebUI.delay(3)

Mobile.tap(findTestObject('Page_Notifikasi/lihat notifikasi'), 3)

WebUI.delay(3)

switch (cek_input.toString()) {
    case 'semua notif':
        Mobile.tap(findTestObject('Page_Notifikasi/menu.notif_lelang'), 0)

        WebUI.delay(3)

        Mobile.tap(findTestObject('Page_Notifikasi/CheckBox.SemuaEventLelang'), 0)

        Mobile.tap(findTestObject('Page_Notifikasi/CheckBox.EventLelangYgDiikuti'), 0)

        Mobile.tap(findTestObject('Page_Notifikasi/CheckBox.UnitYgSayaTawar'), 0)

        Mobile.tap(findTestObject('Page_Notifikasi/CheckBox.HargaPenawaranSaya'), 0)

        WebUI.delay(3)

        Mobile.tap(findTestObject('Page_Notifikasi/menu.notif_lelang'), 0)

        WebUI.delay(5)

        Mobile.tap(findTestObject('Page_Notifikasi/menu.notif_akundeposit'), 0)

        WebUI.delay(3)

        Mobile.tap(findTestObject('Page_Notifikasi/CheckBox.VerifikasiAkun'), 0)

        Mobile.tap(findTestObject('Page_Notifikasi/CheckBox.TopUpDeposit'), 0)

        Mobile.tap(findTestObject('Page_Notifikasi/CheckBox.PenarikanDeposit'), 0)

        WebUI.delay(3)

        Mobile.tap(findTestObject('Page_Notifikasi/menu.notif_akundeposit'), 0)

        WebUI.delay(5)

        Mobile.tap(findTestObject('Page_Notifikasi/menu.notif_aplikasi'), 0)

        WebUI.delay(3)

        Mobile.tap(findTestObject('Page_Notifikasi/CheckBox.Promo'), 0)

        Mobile.tap(findTestObject('Page_Notifikasi/CheckBox.Berita'), 0)

        WebUI.delay(3)

        Mobile.tap(findTestObject('Page_Notifikasi/menu.notif_aplikasi'), 0)

        WebUI.delay(3)

        break
    case 'hanya notif lelang':
        Mobile.tap(findTestObject('Page_Notifikasi/menu.notif_lelang'), 0)

        WebUI.delay(3)

        Mobile.tap(findTestObject('Page_Notifikasi/CheckBox.SemuaEventLelang'), 0)

        Mobile.tap(findTestObject('Page_Notifikasi/CheckBox.EventLelangYgDiikuti'), 0)

        Mobile.tap(findTestObject('Page_Notifikasi/CheckBox.UnitYgSayaTawar'), 0)

        Mobile.tap(findTestObject('Page_Notifikasi/CheckBox.HargaPenawaranSaya'), 0)

        WebUI.delay(3)

        Mobile.tap(findTestObject('Page_Notifikasi/menu.notif_lelang'), 0)

        WebUI.delay(5)

        break
    case 'hanya notif akun':
        Mobile.tap(findTestObject('Page_Notifikasi/menu.notif_akundeposit'), 0)

        WebUI.delay(3)

        Mobile.tap(findTestObject('Page_Notifikasi/CheckBox.VerifikasiAkun'), 0)

        Mobile.tap(findTestObject('Page_Notifikasi/CheckBox.TopUpDeposit'), 0)

        Mobile.tap(findTestObject('Page_Notifikasi/CheckBox.PenarikanDeposit'), 0)

        WebUI.delay(3)

        Mobile.tap(findTestObject('Page_Notifikasi/menu.notif_akundeposit'), 0)

        WebUI.delay(5)

        break
    case 'hanya notif aplikasi':
        Mobile.tap(findTestObject('Page_Notifikasi/menu.notif_aplikasi'), 0)

        WebUI.delay(3)

        Mobile.tap(findTestObject('Page_Notifikasi/CheckBox.Promo'), 0)

        Mobile.tap(findTestObject('Page_Notifikasi/CheckBox.Berita'), 0)

        WebUI.delay(3)

        Mobile.tap(findTestObject('Page_Notifikasi/menu.notif_aplikasi'), 0)

        WebUI.delay(5)

        break
}

WebUI.delay(3)

Mobile.closeApplication()

