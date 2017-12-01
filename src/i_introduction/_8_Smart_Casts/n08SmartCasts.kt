package i_introduction._8_Smart_Casts

import util.TODO
import util.doc8




// 'sealed' modifier restricts the type hierarchy:
// all the subclasses must be declared in the same file
sealed class Expr
class Num(val value: Int) : Expr()
class Sum(val left: Expr, val right: Expr) : Expr()


fun todoTask8(expr: Expr): Nothing = TODO(
        """
        Task 8.
        Simplify the implementation of the 'eval' function above using smart casts and 'when' expression.
        The 'JavaCode8.eval' method provides the similar functionality written in Java.
    """,
        documentation = doc8(),
        references = { JavaCode8().eval(expr) })

//fun whenExample(e: Expr): Int {
//    when (e) {
//        is Foo -> foo.getSomethingFromFoo
//        is Bar -> bar.getSomethingFromBar
//    }
//}


fun eval(expr: Expr): Int {
    if (expr is Num) {
        return (expr as Num).value
    }
    if (expr is Sum) {
        val sum = expr as Sum
        return eval(sum.left) + eval(sum.right)
    }
    throw IllegalArgumentException("Unknown expression")
}

