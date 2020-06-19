package main

class TestResult {
    private var runCount: Int = 0
    private var errorCount: Int = 0

    fun summary() = "$runCount run, $errorCount failed"

    fun testStarted() {
        runCount +=1
    }

    fun testFailed() {
        errorCount +=1
    }
}
