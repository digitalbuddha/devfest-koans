package i_introduction._2_Named_Arguments

import org.junit.Assert.assertEquals

class N02NamedArgumentsKtTest {

    @org.junit.Test fun testJoinToString() {
        assertEquals("Hello DevFestNYC hope you are enjoying the Kotlin Workshop",
                task2("DevFestNYC", "Kotlin Workshop"))
    }

}
