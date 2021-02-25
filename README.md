# ktUnit

Derives from TDD by Example by Kent Beck (Part 2) where he implements a testing framework in Python.

This involves a `TestCase(methodName)` which is passed the name of the method that is going to be tested. This method uses reflection to find the relevant method and if an exception is thrown, the test fails. If the class does not know the method invoked, then it will also fail.

To use this, use a `TestSuite` instance and it provides two methods:
* `add(testCase)` - add the desired test cases. A `TestCase` is needed to be added here.
* `run(testResult)` - runs all of the test cases. A `TestResult` is needed to be instantiated here. To view results, simply call on the `testResult.summary()` method.
