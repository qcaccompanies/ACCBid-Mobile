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

Mobile.startApplication('C:\\Users\\Intan\\Downloads\\accbid.apk', true)

Mobile.tap(findTestObject('carimobil'), 0)

Mobile.tap(findTestObject('brand'), 0)

Mobile.setText(findTestObject('isi_brand'), brand, 0)

Mobile.tap(findTestObject('type'), 0)

Mobile.setText(findTestObject('isi_type'), type, 0)

Mobile.tap(findTestObject('model'), 0)

Mobile.setText(findTestObject('isi_model'), model, 0)

Mobile.tap(findTestObject('tahunmin'), 0)

Mobile.setText(findTestObject('isi_tahun_min'), tahunmin, 0)

Mobile.tap(findTestObject('tahunmaks'), 0)

Mobile.setText(findTestObject('isi_tahun_maks'), tahunmaks, 0)

Mobile.tap(findTestObject('transmisi_automatic'), 0)

Mobile.tap(findTestObject('tipelelang_terbuka'), 0)

Mobile.tap(findTestObject('btn_cari_mobil'), 0)

