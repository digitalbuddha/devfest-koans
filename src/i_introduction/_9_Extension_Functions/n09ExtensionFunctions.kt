package i_introduction._9_Extension_Functions

import util.TODO
import util.doc9
import java.text.DecimalFormat


// declares an extension function that returns the last character
fun String.lastChar() = this.get(this.length - 1)


// 'this' refers to the receiver (String) and can be omitted
fun String.lastChar1() = get(length - 1)

fun useExtensionFunction() {
    // try Ctrl+Space "default completion" after the dot: lastChar() is visible
    "abc".lastChar()
}

// 'lastChar' is compiled to a static function in the class ExtensionFunctionsKt (see JavaCode9.useExtension)

fun todoTask9(): Nothing = TODO(
        """
        Task 9.
        Implement the extension functions Double.toDollar()
        to support the following manner of creating strings with dollar signs
        15.00.toDollar()
    """,
        documentation = doc9())


fun Double.toDollar(): String {
    val df = DecimalFormat("0.00")
    return "$"+df.format(this)
}


