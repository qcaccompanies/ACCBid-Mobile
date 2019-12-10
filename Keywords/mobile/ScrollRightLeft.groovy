
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import io.appium.java_client.TouchAction as TouchAction
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver
import io.appium.java_client.touch.offset.PointOption

import internal.GlobalVariable


public class ScrollRightLeft {


	@Keyword
	def RightLeft(int startX, int startY,int endX, int endY){

		def device_Height = Mobile.getDeviceHeight()
		def device_Width = Mobile.getDeviceWidth()

		startY = device_Height / 2
		endY = startY

		startX = device_Width * 0.30
		endX = device_Width * 0.70


		Mobile.swipe(startX, startY, endX, endY)
	}
}
