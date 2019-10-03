import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.remote.RemoteWebElement as RemoteWebElement
import com.detroitlabs.katalonmobileutil.testobject.XPathBuilder as XPathBuilder
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory

Mobile.tap(findTestObject('ubah profil/ubahprofil_InpTanggalLahir'), 0)

ArrayList listElement = MobileDriverFactory.getDriver().findElementsByClassName('android.widget.TextView')

i = (listElement.size() - 1)

String textItem = listElement[i].getText()

if (textItem < varTahun) {
    varScrollUpDown = 'UP'
} else {
    varScrollUpDown = 'DOWN'
}

switch (varScrollUpDown.toString()) {
    case 'UP':
        CustomKeywords.'mobile.swiping.scrollListToElementWithTextUp'(varTahun)

        break
    case 'DOWN':
        CustomKeywords.'mobile.swiping.scrollListToElementWithTextDown'(varTahun)

        break
}

Mobile.tap(findTestObject('ubah profil/New Test Object', [('text') : varTahun]), 0)

Mobile.tap(findTestObject('ubah profil/Calendar_BtnSet'), 0)

