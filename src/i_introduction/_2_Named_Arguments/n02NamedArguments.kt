package i_introduction._2_Named_Arguments

import util.TODO
import util.doc2

// default values for arguments
fun bar(i: Int, s: String = "", b: Boolean = true) {}

fun usage() {
    // named arguments
    bar(1, b = false)
}

fun todoTask2(): Nothing = TODO(
    """
        Task 2.
        Currently the parameters are being passed in the wrong order.
        Use Named parameters to match  each of the parameter of the function call helloConference()
        to the proper parameter. You cannot change the order of the parameters

        Don't forget to remove the 'todoTask2()' invocation which throws an exception.
    """,
    documentation = doc2())

fun task2(conferenceName: String, workshopName: String): String {
    todoTask2()
    return  helloConference(workshopName,conferenceName);
}

fun helloConference(conferenceName:String, workshopName:String) =
        "Hello $conferenceName hope you are enjoying the $workshopName"