package i_introduction._3_Default_Arguments

import util.TODO
import util.doc2

fun todoTask3(): Nothing = TODO(
        """
        Task 3.
        Several overloaded 'helloConference' functions can be replaced with one which uses a default value
        Change the declaration of the function 'hellConferenceWithDefaults' in a way that makes the code
        using 'helloConference' compile. You have to add a default value to hellConferenceWithDefaults then
        Uncomment the commented code and make it compile.
    """,
        documentation = doc2(),
        references = { conferenceName: String, workshopName: String -> helloConference(conferenceName, workshopName) })

fun helloConference(workshopName: String) =
        helloConference("DevFestNYC", workshopName)

fun helloConference(conferenceName: String, workshopName: String) =
        "Hello $conferenceName hope you are enjoying the $workshopName"

fun hellConferenceWithDefaults(conferenceName: String, workshopName: String) =
        "Hello $conferenceName hope you are enjoying the $workshopName Workshop"

fun task3(): String {
    todoTask3()
//    return hellConferenceWithDefaults(workshopName = "Kotlin")
}