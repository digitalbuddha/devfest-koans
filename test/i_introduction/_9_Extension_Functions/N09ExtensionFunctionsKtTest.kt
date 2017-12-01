package i_introduction._9_Extension_Functions

import org.junit.Assert.assertEquals
import org.junit.Test

class N09ExtensionFunctionsKtTest {
    //toDollar
    @Test
    fun testDoubleExtension() {
        assertEquals("Rational number creation error: ", "$15.00", 15.00.toDollar())
    }
}