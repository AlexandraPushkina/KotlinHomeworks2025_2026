package homework5

class Box<T1, T2, T3>(val item1:T1, val item2:T2, val item3:T3) {

    fun countNumbers() {
        var sum = 0.0f
        if (item1 is Number)
            sum += item1.toFloat()
        if (item2 is Number)
            sum += item2.toFloat()
        if (item3 is Number)
            sum += item3.toFloat()
        println("Сумма всех принятых чисел: $sum")
    }
}

fun main(){

    val boxWithBalls = Box(20, "Шарики", 1.4f)
    val boxWithToys = Box("Игрушки", 5.31f, 7)
    val boxWithLeafs = Box(7.909f, 80, "Листья")

    boxWithBalls.countNumbers()
    boxWithToys.countNumbers()
    boxWithLeafs.countNumbers()

}