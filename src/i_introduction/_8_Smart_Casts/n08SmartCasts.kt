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
        The commented out `whenExample' function provides the similar pattern.
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
    return when (expr) {
        is Num -> expr.value
        is Sum -> eval(expr.left) + eval(expr.right)
    }
}
