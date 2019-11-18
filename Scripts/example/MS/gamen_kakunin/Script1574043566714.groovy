import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kazurayam.katalon.utils.HighlightElement as HE
import com.kazurayam.katalon.utils.HideElement as HI
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
def check(TestObject tobj) {
	WebUI.verifyElementPresent(tobj, 1)
	HE.highlight(tobj)
	WebUI.delay(1)
}
String url = 'http://www.morningstar.co.jp/FundData/SnapShot.do?fnc=2012052801'
WebUI.openBrowser('')
WebUI.setViewPortSize(1024, 768)
WebUI.navigateToUrl(url)
WebUI.waitForPageLoad(10)
//WebUI.scrollToElement(findTestObject('MS/FundData/tesuuryou_jouhou/h2_tesuuryou_jouhou'), 1)
WebUI.scrollToElement(findTestObject('MS/FundData/手数料情報/h2_手数料情報'), 1)
HI.hide(findTestObject('MS/FundData/nav'))

/*
check(findTestObject('MS/FundData/tesuuryou_jouhou/kaiyakuji_shintaku_zaisan_ryuuhogaku'))
check(findTestObject('MS/FundData/tesuuryou_jouhou/kaiyakuji_tesuuryou_gaku'))
check(findTestObject('MS/FundData/tesuuryou_jouhou/kaiyakuji_tesuuryou_ritsu'))
check(findTestObject('MS/FundData/tesuuryou_jouhou/kounyuuji_shintaku_zaisan_ryuuhogaku'))
check(findTestObject('MS/FundData/tesuuryou_jouhou/kounyuuji_tesuuryou_gaku'))
check(findTestObject('MS/FundData/tesuuryou_jouhou/kounyuuji_tesuuryou_ritsu'))
 */

check(findTestObject('MS/FundData/手数料情報/解約時信託財産留保額'))
check(findTestObject('MS/FundData/手数料情報/解約時手数料額'))
check(findTestObject('MS/FundData/手数料情報/解約時手数料率'))
check(findTestObject('MS/FundData/手数料情報/購入時信託財産留保額'))
check(findTestObject('MS/FundData/手数料情報/購入時手数料額'))
check(findTestObject('MS/FundData/手数料情報/購入時手数料率'))

WebUI.delay(3)
WebUI.closeBrowser()
