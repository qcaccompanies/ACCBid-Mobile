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

Mobile.startApplication('C:\\Users\\ASUS\\Desktop\\accbid(2).apk', false)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'mobile.Swipers.RightLeft'(0.9, 0.3, 1640)

CustomKeywords.'mobile.Swipers.RightLeft'(0.9, 0.3, 1640)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('ikut lelang/bid manual/android.view.View0 - Lihat Semua Event Hari Ini'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'mobile.Swipers.UpDown'(0.9, 0.5, 540)

Mobile.tap(findTestObject('ikut lelang/android.view.View0 - IBID - Awal Tahun Bakar Uang'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('ikut lelang/bid manual/android.widget.Button0 - Ikut Lelang'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('ikut lelang/bid manual/android.widget.Button0 - Bid Otomatis'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('ikut lelang/bid manual/android.widget.EditText0 - Bid Otomatis'), harga_penawaran, 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('ikut lelang/bid manual/android.widget.Button0 - Bid'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('ikut lelang/topup_saldo/android.view.View0 - Dana tidak mencukupi apakah Anda ingin melakukan Top Up '), 
    0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('ikut lelang/topup_saldo/android.widget.Button0 - Top Up'), 0)

Mobile.delay(3)

Mobile.setText(findTestObject('ikut lelang/topup_saldo/android.view.View0 - Input Nominal'), nominal_topup, 0)

Mobile.delay(3)

Mobile.tap(findTestObject('ikut lelang/topup_saldo/android.view.View0 - Pilih akun bank anda'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('ikut lelang/topup_saldo/android.view.View0 - Bank', [('text') : bank]), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('ikut lelang/topup_saldo/android.widget.Spinner0 - Input Date'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('ikut lelang/topup_saldo/android.view.View0 - Pilih Tanggal Topup', [('text') : tanggal]), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('ikut lelang/topup_saldo/android.widget.Button0 - SET Tanggal TopUp'), 0)

Mobile.delay(3)

CustomKeywords.'mobile.Swipers.UpDown'(0.9, 0.5, 540)

Mobile.delay(3)

Mobile.tap(findTestObject('ikut lelang/topup_saldo/android.widget.Button0 - UPLOAD BUKTI PEMBAYARAN'), 0)

Mobile.tap(findTestObject('ikut lelang/topup_saldo/android.view.View0 - Gallery'), 0)

Mobile.tap(findTestObject('ikut lelang/topup_saldo/android.widget.TextView0 - IMG_20200106_160511_1.jpg', [('text') : picture]), 
    0)

Mobile.delay(10)

not_run: Mobile.tap(findTestObject('ikut lelang/topup_saldo/android.widget.Button0 - Konfirmasi'), 0)

