package homework2
import kotlin.random.Random

fun playGuessNumber(chosenDifficult: Int, attempts: Int){
    var attempts = attempts
    if (chosenDifficult !in 1..3){
        println("Так не пойдет, сложность нужно выбрать 1, 2 или 3")
        return
    }
    if (attempts < 1){
        println("Ты выбрал меньше одной попытки, но думаю, что хотя бы одну ты заслуживаешь")
        attempts = 1  //если не указывать в начале функции var attempts = attempts, то эта строка выдает ошибку
    }
    var hiddenNumber:Int = 0
    when (chosenDifficult){
        1 -> {hiddenNumber = Random.nextInt(1, 4)
            println("Нужно отгадать число от 1 до 3") }

        2 -> {hiddenNumber = Random.nextInt(1, 11)
            println("Нужно отгадать число от 1 до 10")}
        3 -> {hiddenNumber = Random.nextInt(1, 101)
        println("Нужно отгадать число от 1 до 100")}
    }
    println("Отгадайте загаданное число... И пусть высшие силы помогут вам")
    for (i in 1..attempts){
        val chooseNumber:Int = readln().toInt()
        if (hiddenNumber == chooseNumber){
            println("Ура, вы победили, загаданное число - $hiddenNumber")
            return
        }
        else if (i != attempts)
            println("Неправильное число, осталось попыток - ${attempts-i}")
        else
            println("К сожалению, вы проиграли, загаданное число - $hiddenNumber")
    }
}

fun main() {
    var answerIsTrue: Int = 1
    while (answerIsTrue == 1){
        var difficult:Int = 0
        var attempts:Int = 0
        println("Выберите сложность от 1 до 3")
        difficult = readln().toInt()
        println("Выберите количество попыток")
        attempts = readln().toInt()
        playGuessNumber(difficult, attempts)
        println("Продолжить игру? 1 - Да, 0 - Нет")
        answerIsTrue = readln().toInt()
    }
}