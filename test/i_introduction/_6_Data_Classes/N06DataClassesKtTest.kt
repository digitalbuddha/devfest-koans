package i_introduction._6_Data_Classes

import org.junit.Assert.assertEquals
import org.junit.Test


class N06DataClassesKtTest {
    @Test fun testListOfPeople() {
        assertEquals("[Workshop(name=Kotlin, location=DevFestNYC), Workshop(name=Flutter, location=DevFestNYC)]", task6().toString())
    }
}