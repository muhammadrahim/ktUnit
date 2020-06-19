package main

class WasRun(override val name: String) : TestCase(name) {
     var log: String = ""


    fun testMethod() {
        log += "testMethod "
    }

    fun testBrokenMethod() {
       throw Exception("fk")
    }

    override fun setUp()  {
        log += "setUp "
    }

    override fun tearDown() {
        log += "tearDown "
    }

}
