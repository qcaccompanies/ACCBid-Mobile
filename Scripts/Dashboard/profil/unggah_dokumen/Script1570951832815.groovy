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

Mobile.tap(findTestObject('unggah_dokumen/unggah_dokumen'), 0)

switch (hapus_foto.toString()) {
    case 'tidak':
        not_run: Mobile.tap(findTestObject('unggah_dokumen/btn_ktp'), 0)

        not_run: Mobile.tap(findTestObject('unggah_dokumen/gallery'), 0)

        not_run: Mobile.tap(findTestObject('unggah_dokumen/dir_downloads_gallery'), 0)

        not_run: Mobile.scrollToText(nama_foto, FailureHandling.STOP_ON_FAILURE)

        not_run: Mobile.tap(findTestObject('object_diluar_aplikasi/picklist', [('text') : nama_foto]), 0)

        Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('unggah_dokumen/btn_npwp'), 0)

        Mobile.tap(findTestObject('unggah_dokumen/gallery'), 0)

        Mobile.tap(findTestObject('unggah_dokumen/dir_downloads_gallery'), 0)

        Mobile.scrollToText(nama_foto, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('object_diluar_aplikasi/picklist', [('text') : nama_foto]), 0)

        Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('unggah_dokumen/btn_kk'), 0)

        Mobile.tap(findTestObject('unggah_dokumen/gallery'), 0)

        Mobile.tap(findTestObject('unggah_dokumen/dir_downloads_gallery'), 0)

        Mobile.scrollToText(nama_foto, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('object_diluar_aplikasi/picklist', [('text') : nama_foto]), 0)

        Mobile.tap(findTestObject('unggah_dokumen/btn_submit_ubah_dokumen'), 0)

        break
    case 'ya':
        Mobile.tap(findTestObject('unggah_dokumen/ubah_unggah_dokumen'), 0)

        Mobile.tap(findTestObject('unggah_dokumen/sampah'), 0)

        Mobile.tap(findTestObject('unggah_dokumen/ya_hapus'), 0)

        Mobile.tap(findTestObject('unggah_dokumen/btn_ktp_stlh_hapus'), 0)

        Mobile.tap(findTestObject('unggah_dokumen/gallery'), 0)

        Mobile.tap(findTestObject('unggah_dokumen/dir_downloads_gallery'), 0)

        Mobile.scrollToText(nama_foto, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('object_diluar_aplikasi/picklist', [('text') : nama_foto]), 0)

        Mobile.tap(findTestObject('unggah_dokumen/btn_submit_ubah_dokumen'), 0)

        break
}

