package i_introduction._4_Lambdas

import util.TODO
import util.doc4

fun example() {

    val sum = { x: Int, y: Int -> x + y }
    val square: (Int) -> Int = { it*it}

    sum(1, square(2)) == 5
}

fun todoTask4(collection: Collection<Int>): Nothing = TODO(
    """
        Task 4.
        Rewrite 'Finder.containsEven()' in Kotlin using lambdas:
        return true if the collection contains an even number.
        You can use the kotlin collections class extension method `any` along with a lambda
    """,
    documentation = doc4(),
    references = { Finder().containsEven(collection) })

fun task4(collection: Collection<Int>): Boolean = TODO()//collection.any { it % 2 == 0; }