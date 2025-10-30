fun greeting(name: String){
    println("Hello, $name !")
}

fun isNegative(x: Number): Boolean{
    return x.toDouble() < 0
}

fun printIsNegative(x: Number){
    if (isNegative(x))
        println("Число $x - Отрицательное")
    else
        println("Число $x - Положительное")
}

fun sequence(){
    for (i in 1000 downTo 0){
        if (i % 3 == 0)
            println (i)
    }
}

fun main(){
    var a1 = 1
    var a5 = 5
    var a2 = 6
    val imm = 1
    var pi: Float = 3.142F
    var d: Double = -4.909
    var t: Boolean = true
    var f: Boolean = a2 in a1..a5
    var name: String = "Alexandra"
    var c: Char = 'i'

    greeting(name)
    printIsNegative(d)
    printIsNegative(pi)
    sequence()

    println(f)

}


