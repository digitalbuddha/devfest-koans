package i_introduction._6_Data_Classes

import util.TODO
import util.doc6

fun todoTask6(): Nothing = TODO(
    """
        Use the auto converter to convert 'JavaCode6.Workshop' class to Kotlin.
        Then add a modifier `data` to the resulting class.
        This keyword means the compiler will generate a bunch of useful methods in this class:
        `equals`/`hashCode`, `toString` and some others.
        The `task6` function should return a list of workshop.
    """,
    documentation = doc6(),
    references = { JavaCode6.Workshop("Basket Weaving", "NYC") }
)
data class Workshop(val name: String, val location: String)

fun task6(): List<Workshop> {
    return listOf(Workshop("Kotlin", "DevFestNYC"), Workshop("Flutter", "DevFestNYC"))
}

