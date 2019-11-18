import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

TestData testData = findTestData("サンプル/テストデータviaExcel")

String[] columnNames = testData.getColumnNames()
columnNames.eachWithIndex { name, idx ->
	WebUI.comment("column name: ${idx} ${name}")
}

int numberOfRows = testData.getRowNumbers()
for (int i = 1; i <= numberOfRows; i++) {
	WebUI.comment("row ${i}: ユーザ名: \"${testData.getValue('ユーザ名', i)}\", パスワード: \"${testData.getValue('パスワード', i)}\"")
}

