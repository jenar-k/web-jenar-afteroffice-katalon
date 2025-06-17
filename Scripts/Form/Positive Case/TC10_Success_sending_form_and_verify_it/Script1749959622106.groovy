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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import java.nio.file.Paths as Paths
import java.io.File as File

WebUI.callTestCase(findTestCase('Open Common Website (DemoQA-Form)/Open Website'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Form/txt_first_name'), 0)

WebUI.setText(findTestObject('Form/txt_first_name'), 'Jenar')

WebUI.setText(findTestObject('Form/txt_last_name'), 'Kuswidiardi')

WebUI.setText(findTestObject('Form/txt_email_user'), 'jenar@yopmail.com')

WebUI.scrollToElement(findTestObject('Form/radiobtn_gender_male'), 0)

WebUI.click(findTestObject('Form/radiobtn_gender_male'))

WebUI.setText(findTestObject('Form/txt_phone_number'), '6280989999')

WebUI.click(findTestObject('Form/datepicker_dob'))

WebUI.click(findTestObject('Form/dropdown_year'))

WebUI.click(findTestObject('Form/year'))

WebUI.delay(1)

WebUI.click(findTestObject('Form/dropdown_month'))

WebUI.click(findTestObject('Form/month'))

WebUI.delay(1)

WebUI.click(findTestObject('Form/date'))

WebUI.delay(1)

WebUI.click(findTestObject('Form/txtarea_address'))

WebUI.scrollToElement(findTestObject('Form/container_subjects_for_auto_complete'), 0)

WebUI.click(findTestObject('Form/container_subjects_for_auto_complete'))

WebUI.setText(findTestObject('Form/txt_subject'), 'ma')

WebUI.click(findTestObject('Form/container_choose_in_subject'))

WebUI.setText(findTestObject('Form/txt_subject'), 'ar')

WebUI.click(findTestObject('Form/container_choose_in_subject'))

WebUI.scrollToElement(findTestObject('Form/chckbox_hobbies_sports'), 0)

WebUI.click(findTestObject('Form/chckbox_hobbies_sports'))

WebUI.click(findTestObject('Form/chckbox_hobbies_reading'))

WebUI.scrollToElement(findTestObject('Form/txtarea_address'), 0)

String projectDir = RunConfiguration.getProjectDir()

String relativeFilePath = 'Asset/user-profile.jpg'

File pictureFile = Paths.get(projectDir, relativeFilePath).toFile()

if (pictureFile.exists()) {
    println('Picture file found at: ' + pictureFile.getAbsolutePath())

    WebUI.uploadFile(findTestObject('Form/input_upload_attachment'), pictureFile.getAbsolutePath())
} else {
    println('picture file not found at: ' + pictureFile.getAbsolutePath())
}

WebUI.setText(findTestObject('Form/txtarea_address'), 'Jalan Bersama Selalu no.1')

WebUI.scrollToElement(findTestObject('Form/dropdown_state'), 0)

WebUI.click(findTestObject('Form/dropdown_state'))

WebUI.delay(1)

WebUI.click(findTestObject('Form/selectdata_state_uttar_pradesh'))

WebUI.delay(1)

WebUI.click(findTestObject('Form/dropdown_city'))

WebUI.delay(1)

WebUI.click(findTestObject('Form/selectdata_city_lucknow'))

WebUI.delay(1)

WebUI.click(findTestObject('Form/btn_submit'))

WebUI.verifyElementPresent(findTestObject('Verify/popup_modal_success'), 0)

WebUI.verifyElementPresent(findTestObject('Verify/msg_thanks_for_submit'), 0)

WebUI.verifyElementText(findTestObject('Verify/student_name'), 'Jenar Kuswidiardi')

WebUI.verifyElementText(findTestObject('Verify/student_email'), 'jenar@yopmail.com')

WebUI.verifyElementText(findTestObject('Verify/gender'), 'Male')

WebUI.verifyElementText(findTestObject('Verify/mobile_phone'), '6280989999')

WebUI.verifyElementText(findTestObject('Verify/dob'), '11 November,2000')

WebUI.verifyElementText(findTestObject('Verify/subjects'), 'Maths, Arts')

WebUI.verifyElementText(findTestObject('Verify/hobbies'), 'Sports, Reading')

WebUI.verifyElementText(findTestObject('Verify/picture'), 'user-profile.jpg')

WebUI.verifyElementText(findTestObject('Verify/address'), 'Jalan Bersama Selalu no.1')

WebUI.verifyElementText(findTestObject('Verify/state_and_city'), 'Uttar Pradesh Lucknow')

WebUI.closeBrowser()

