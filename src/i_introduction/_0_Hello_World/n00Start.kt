package i_introduction._0_Hello_World

import util.TODO
import util.doc0
//TODO BRIAN: Copy the first part of the TODO into a slide
fun todoTask0(): Nothing = TODO(
    """
        Task 0.


        Using 'documentation =' below the task description you can open the related part of the online documentation.
            Press 'Ctrl+Q'(Windows/Linux) or 'F1'(Mac OS) on 'doc0()' to call the "Quick Documentation" action;
            "See also" section gives you a link.
            You can see the shortcut for the "Quick Documentation" action used in your IntelliJ IDEA
            by choosing "Help -> Find Action..." (in the top menu), and typing the action name ("Quick Documentation").
            The shortcut in use will be written next to the action name.

        Using 'references =' you can navigate to the code mentioned in the task description.

        Let's start! Make the function 'task0' return "Hello Devfest". Note that you can return expression directly.
    """,
    documentation = doc0(),
    references = { task0(); "Hello DevFest" }
)

fun task0(): String {
    return todoTask0()
}