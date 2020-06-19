package main

open class TestCase(open val name: String) {

    fun run(result: TestResult): TestResult {
        setUp()
        result.testStarted()

        try {
            javaClass.getMethod(this.name).invoke(this)
        } catch (e: Exception) {
            result.testFailed()
        }

        tearDown()
        return result
    }

    open fun setUp() {}

    open fun tearDown() {}
}
