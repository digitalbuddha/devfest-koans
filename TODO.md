more advanced topics:
coroutines
!! on nulls
if you know a variable that is a null type cannot be null you can deference it with !! ie foo!!.bar
alternatively you can do a safe get by doing something like foo?.bar and you will get null as a result if foo is null
run/let,with,apply
you can also do val value = foo?.let{ it.bar}  which will give you either null or bar as a result
@Parcelize
Kotlin has useful annotations like Parcelize
Top level functions
you can make function at the top level without needed to encapsulate them in a class like java
Companion Objects instead of statics
Kotlin does not have static methods but instead companion objects nested in a class which have class level functions
var/val vs lateinit
var means we can change the value, val means once its created it cannot be reassigned,
lateinit var means it is null to start but can be set once and only once
copy immutable data classes
data classes have a copy function that takes as arguments any fields you want to change while copying
val newFoo=foo.copy(baz=5)
koltinx synthetic methods
https://antonioleiva.com/kotlin-android-extensions/
