import main.TestCaseTest
import main.TestResult
import main.TestSuite

val suite = TestSuite()
suite.add(TestCaseTest("testTemplateMethod"))
suite.add(TestCaseTest("testResult"))
suite.add(TestCaseTest("testFailedResult"))
suite.add(TestCaseTest("testFailedFormattingResult"))
suite.add(TestCaseTest("testSuite"))
val result = TestResult()
suite.run(result)

result.summary()
