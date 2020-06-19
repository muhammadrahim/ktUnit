package main

import kotlin.test.assertEquals

class TestCaseTest(override val name: String) : TestCase(name) {

    private lateinit var result: TestResult
    private lateinit var test: WasRun

    override fun setUp() {
        result = TestResult()
    }

    fun testTemplateMethod() {
        test = WasRun("testMethod")
        test.run(result)
        assertEquals(test.log, "setUp testMethod tearDown ")
    }

    fun testResult() {
        test = WasRun("testMethod")
        val result = test.run(result)
        assertEquals( result.summary(), "1 run, 0 failed")
    }

    fun testFailedResult() {
        test = WasRun("testBrokenMethod")
        val result = test.run(result)
        assertEquals(result.summary(), "1 run, 1 failed")
    }

    fun testFailedFormattingResult() {
        result.testStarted()
        result.testFailed()
        assertEquals(result.summary(), "1 run, 1 failed")
    }

    fun testSuite() {
        val suite = TestSuite()
        suite.add(WasRun("testMethod"))
        suite.add(WasRun("testBrokenMethod"))
        suite.run(result)
        assertEquals("2 run, 1 failed", result.summary())
    }
}
