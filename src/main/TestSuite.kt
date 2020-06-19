package main

class TestSuite {
    private var tests = mutableListOf<TestCase>()

    fun add(testCase: TestCase) {
        tests.add(testCase)
    }

    fun run(result: TestResult) {
        for (test in tests) {
            test.run(result)
        }
    }

}
